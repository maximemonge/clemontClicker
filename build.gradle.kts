plugins {
    kotlin("js") version "1.6.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:18.0.0-pre.331-kotlin-1.6.20")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:18.0.0-pre.331-kotlin-1.6.20")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-css:18.0.0-pre.331-kotlin-1.6.20")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-csstype:3.0.11-pre.331-kotlin-1.6.20")
}

kotlin {
    js(LEGACY) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
}