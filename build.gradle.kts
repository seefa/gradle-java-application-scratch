plugins {
    java
    application
    idea
}

group = "ir.seefa.sample.project"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile("joda-time", "joda-time", "2.2")
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks{
    register<Jar>("sourcesJar") {
        archiveBaseName.set("seefa-gradle-java-sample")
    }
}

application {
    mainClassName = "ir.seefa.sample.project.App"
}