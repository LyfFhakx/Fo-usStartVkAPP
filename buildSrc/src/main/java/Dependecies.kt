object App {
    const val targetSdk = 28
    const val minApi = 21
}

object Versions {
    const val gradle = "3.4.1"
    const val kotlin = "1.3.31"
    const val appCompat = "1.0.2"
    const val room = "2.0.0"
}

object Dependencies {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomRx = "androidx.room:room-rxjava2:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
}

object Classpaths {
    val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
    val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}