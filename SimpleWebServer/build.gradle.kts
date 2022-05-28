import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    application
}

group = "me.josephditton"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.ktor:ktor-server-core-jvm:2.0.1")
    implementation("io.ktor:ktor-server-netty-jvm:2.0.1")
    implementation("io.ktor:ktor-server-status-pages-jvm:2.0.1")
    implementation("io.ktor:ktor-server-default-headers-jvm:2.0.1")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}