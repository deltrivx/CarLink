import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions // Import KotlinJvmOptions

plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdk = 34
    namespace = "com.andrerinas.openheadunit.contract"

    defaultConfig {
        minSdk = 16
        targetSdk = 34
    }

//    buildTypes {
//        create("release") {
//            postprocessing {
//                removeUnusedCode = false
//                removeUnusedResources = false
//                obfuscate = false
//                optimizeCode = false
//                proguardFile("proguard-rules.pro")
//            }
//        }
//    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        (this as KotlinJvmOptions).let {
           it.jvmTarget = "17"
        }
    }
}

dependencies {
}
