// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Deps.gradle_plugin)
        classpath(Deps.Kotlin.gradle_plugin)
        classpath(Deps.Hilt.gradlePlugin)
        classpath(Deps.Navigation.safeArgs_gradle)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean").configure {
    delete("build")
}