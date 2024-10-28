plugins {
    id("java")
}

subprojects{ apply(plugin = "java") }

group = "org.huanlui.bank"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }

    dependencies {
        testImplementation(platform("org.junit:junit-bom:5.9.1"))
        testImplementation("org.junit.jupiter:junit-jupiter")
        testImplementation("org.assertj:assertj-core:3.26.3")
    }

    tasks.test {
        useJUnitPlatform()
    }
}




