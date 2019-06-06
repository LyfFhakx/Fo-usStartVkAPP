buildscript {
    repositories {
        google()
        jcenter()
        
    }

    dependencies {
        classpath(Classpaths.gradle)
        classpath(Classpaths.kotlin)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
