buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        val kotlinVersion = "1.4.20"
        classpath(kotlin("gradle-plugin", version = kotlinVersion))
        classpath(kotlin("serialization", version = kotlinVersion))
        classpath("com.android.tools.build:gradle:7.0.0-alpha02")
        classpath("com.codingfeline.buildkonfig:buildkonfig-gradle-plugin:0.7.0")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
    }
}