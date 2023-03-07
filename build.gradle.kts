plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

group = "net.upliftinglemma"
version = "1.0-SNAPSHOT"

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

repositories {
    mavenCentral()
}
