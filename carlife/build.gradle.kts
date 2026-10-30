plugins { id("com.android.library") }

android {
    compileSdk = 37
    namespace = "net.easyconn.gwmec.carlife"

    defaultConfig { minSdk = 24 }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")

    // 上游 CarLife 车辆端的 protobuf 生成代码是 2.2.0 风格（GeneratedMessage），
    // 只能用同一代的 runtime；与 auto 模块的 3.x 互不影响（不同模块各自打包）。
    implementation(files("libs/protobuf-java-2.2.0.jar"))
}
