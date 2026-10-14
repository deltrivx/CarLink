plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
}

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
        versionCode = 11557
        versionName = "1.3.50"

    }


    localAuthenticationAssets?.let { sourceSets.getByName("main").assets.srcDir(it) }

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
