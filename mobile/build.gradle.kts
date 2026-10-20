import java.io.File
import java.text.SimpleDateFormat
import java.util.Date

import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.provider.ValueSource
import org.gradle.api.provider.ValueSourceParameters

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
}

// --- Automatic date-based versioning -----------------------------------------------
// The version is never written by hand. Every build derives it:
//
//   versionName = YYYY.MM.DD, or YYYY.MM.DD-N when the day already shipped N builds
//                 (N counted from the git tags of this day — the remote tags are the
//                 only authority on what has shipped; a clean checkout has none, and
//                 falls back to the day's first build)
//   versionCode = YYYYMMDD*100 + N   (N = 0 for the first build of the day)
//
// versionCode stays a strictly increasing 32-bit int: the worst case a real date can
// reach is 9999_12_31_99 = 999,123,199, three times under the 2,147,483,647 ceiling,
// and up to a hundred builds a day. A day that somehow needs more stops the build
// rather than silently overflowing into another day's numbers.
//
// -PversionName / -PversionCode (or VERSION_NAME / VERSION_CODE in the environment)
// override everything, so a release script that has already asked the remote for the
// day's tag list injects the exact pair it planned; the fallback here is only for
// builds that did not ask — assembleDebug offline, a fresh checkout, CI.
val autoVersionName: String = providers.gradleProperty("versionName")
    .orElse(providers.environmentVariable("VERSION_NAME"))
    .orElse(providers.gradleProperty("autoVersionName"))
    .getOrElse("")
val autoVersionCode: String = providers.gradleProperty("versionCode")
    .orElse(providers.environmentVariable("VERSION_CODE"))
    .getOrElse("")

// The day's shipped tags, read the configuration-cache way: a ValueSource runs
// outside the cache, so the git call cannot invalidate it. With no .git (a source
// archive) or a git failure the day has shipped nothing and this is build zero.
abstract class TodaysVersionTags : ValueSource<List<String>, TodaysVersionTags.Params> {
    @Suppress("unused")
    interface Params : ValueSourceParameters {
        @get:Input
        val projectDir: Property<String>
    }

    override fun obtain(): List<String> {
        val today = SimpleDateFormat("yyyy.MM.dd").format(Date())
        return runCatching {
            val process = ProcessBuilder("git", "tag", "--list", "$today*")
                .directory(File(parameters.projectDir.get()))
                .redirectErrorStream(true)
                .start()
            process.inputStream.bufferedReader().readLines()
                .filter { it.startsWith(today) }
        }.getOrDefault(emptyList())
    }
}

fun computeAutoVersion(): Pair<Int, String> {
    val today = SimpleDateFormat("yyyy.MM.dd").format(Date())
    val tags = providers.of(TodaysVersionTags::class.java) {
        parameters.projectDir.set(rootDir.absolutePath)
    }.get()
    val shipped = tags.mapNotNull { tag ->
        when (tag) {
            today -> 0
            else -> Regex("^${Regex.escape(today)}-(\\d+)$").find(tag)
                ?.groupValues?.get(1)?.toIntOrNull()
        }
    }
    // Next build number: one past everything the day has already shipped.
    val n = (shipped.maxOrNull() ?: -1) + 1
    check(n <= 99) { "more than 100 builds on $today: give -PversionCode and -PversionName by hand" }
    val code = today.replace(".", "").toInt() * 100 + n
    val name = if (n == 0) today else "$today-$n"
    return code to name
}

val computedAutoVersion: Pair<Int, String> by lazy { computeAutoVersion() }
val resolvedVersionCode: Int = autoVersionCode.toIntOrNull() ?: computedAutoVersion.first
val resolvedVersionName: String = autoVersionName.ifEmpty { computedAutoVersion.second }

// Optional local-only input. CI and ordinary source builds contain no accessory identity.
val localAuthenticationAssets = providers.environmentVariable("DIPLAY_AUTH_ASSETS_DIR")
    .orNull?.let { file(it).canonicalFile }

android {
    namespace = "net.easyconn.gwmec"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "net.easyconn.gwmec"
        minSdk = 25
        targetSdk = 37
        versionCode = resolvedVersionCode
        versionName = resolvedVersionName

    }


    localAuthenticationAssets?.let { sourceSets.getByName("main").assets.srcDir(it) }



    // Whether this package shares the system uid.
    //
    // The custom build for the car needs it; the generic build for any device must not
    // have it. A public build that declares a system uid it was never granted is a build
    // Android refuses to update, and an install carrying one can never be upgraded over.
    //
    // AGP 9 offers no manifest placeholder for this, so the attribute is written into the
    // merged manifest by a task that runs before anything packages it: -PsystemUid=true,
    // which only the car build passes, puts it back; an ordinary build - the public
    // repository's CI, or a first checkout - leaves it out.
    val systemUid = providers.gradleProperty("systemUid").map(String::toBoolean).getOrElse(false)

    // The custom build for the car shares the system uid, and that attribute lives in its
    // own source set. Including it here - only when -PsystemUid=true is passed - means an
    // ordinary build, the public repository's CI or a first checkout, never sees it and
    // carries no uid at all.
    if (systemUid) {
        sourceSets.getByName("main").manifest.srcFile("src/car/AndroidManifest.xml")
    }

    signingConfigs {
        // The release key is a credential, passed in through the environment and never
        // stored here. When it is absent — a public build, or a first checkout — the
        // release build falls back to the debug key rather than refusing to build: a
        // build nobody can produce is worse than one signed with a key that is already
        // public. A build meant for a car always passes the real key in.
        val keystorePath = providers.environmentVariable("ANDROID_KEYSTORE_PATH").orNull
        if (keystorePath != null && file(keystorePath).exists()) {
            create("release") {
                storeFile = file(keystorePath)
                storePassword = providers.environmentVariable("ANDROID_KEYSTORE_PASSWORD").getOrElse("")
                keyAlias = providers.environmentVariable("ANDROID_KEY_ALIAS").getOrElse("")
                keyPassword = providers.environmentVariable("ANDROID_KEY_PASSWORD").getOrElse("")
            }
        }
    }

    buildTypes {
        debug {
            applicationIdSuffix = ""
            versionNameSuffix = ""
        }
        release {
            // Use the release key when one was passed in; otherwise the debug key, which
            // is already public. See the signing config above.
            signingConfig = signingConfigs.findByName("release")
                ?: signingConfigs.getByName("debug")
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    packaging {
        resources {
            // BouncyCastle's post-quantum lookup tables. They are only reachable from
            // algorithm identifiers this app never asks for, and they cost over a
            // megabyte of the download for nothing.
            excludes += "/org/bouncycastle/pqc/crypto/picnic/*"
            excludes += "/org/bouncycastle/pqc/crypto/**/*.properties"
        }
    }
    // Where this build looks for its own updates. The custom build for the car
    // reads the private repository; the generic build reads the public one.
    // Injected rather than written in the source, so a public tree never names
    // the private repository at all.
    buildTypes {
        debug {
            buildConfigField("String", "UPDATE_REPO_OWNER", "\"deltrivx\"")
            buildConfigField("String", "UPDATE_REPO_NAME", "\"EasyConnect\"")
        }
        release {
            buildConfigField("String", "UPDATE_REPO_OWNER",
                "\"${providers.gradleProperty("updateRepoOwner").getOrElse("deltrivx")}\"")
            buildConfigField("String", "UPDATE_REPO_NAME",
                "\"${providers.gradleProperty("updateRepoName").getOrElse("EasyConnect")}\"")
        }
    }
}

dependencies {
    implementation(platform(libs.androidx.compose.bom))
    implementation(project(":common"))
    implementation(project(":shared"))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.app.projected)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    debugImplementation(libs.androidx.compose.ui.tooling)
}

// No implicit import. Only the two explicitly selected local runtime assets are allowed.
val credentialAssets = files(android.sourceSets.flatMap { source ->
    source.assets.directories.map { directory ->
        fileTree(directory) {
            include("**/offline-mfi/**", "**/*.pk8", "**/*.p7b", "**/*.key",
                "**/*.pem", "**/*.p12", "**/*.pfx", "**/*.jks", "**/*.keystore")
        }
    }
})
val rejectBundledCredentials by tasks.registering {
    group = "verification"
    description = "Reject unexpected credential files in APK assets."
    val filesToCheck = credentialAssets
    val allowed = localAuthenticationAssets?.let { dir ->
        listOf("identity.pk8", "certificate.p7b").map { dir.resolve("offline-mfi/$it").canonicalFile }.toSet()
    } ?: emptySet()
    inputs.files(filesToCheck)
    doLast {
        check(allowed.all { it.isFile }) { "Explicit local authentication assets are incomplete" }
        val unexpected = filesToCheck.files.filter { it.canonicalFile !in allowed }
        check(unexpected.isEmpty()) { "Unexpected credential files in APK assets" }
    }
}
tasks.named("preBuild") { dependsOn(rejectBundledCredentials) }

// Car-test packages must be standalone. Keep ordinary source/CI builds identity-free.
val verifyStandaloneAuthentication by tasks.registering {
    group = "verification"
    description = "Require the explicit runtime authentication input for a standalone car-test APK."
    val directory = localAuthenticationAssets
    doLast {
        check(directory != null) {
            "Standalone car builds require DIPLAY_AUTH_ASSETS_DIR; assembleDebug alone is source-only."
        }
        check(listOf("identity.pk8", "certificate.p7b").all {
            directory.resolve("offline-mfi/$it").let { file -> file.isFile && file.length() > 0 }
        }) { "Standalone CarPlay authentication files are missing or empty" }
    }
}
tasks.named("preBuild") { mustRunAfter(verifyStandaloneAuthentication) }
tasks.register("assembleStandaloneDebug") {
    group = "build"
    description = "Build a standalone car-test APK with explicitly provisioned authentication."
    dependsOn(verifyStandaloneAuthentication, "assembleDebug")
}
