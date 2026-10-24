plugins {
    id("com.android.library")
}

android {
    compileSdk = 37
    namespace = "com.andrerinas.openheadunit.contract"

    defaultConfig {
        minSdk = 28
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
}
