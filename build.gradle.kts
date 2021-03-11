plugins {
    java
    `maven-publish`
}

group = "net.stormdev"
version = "1.16.2-R0.1-15"
description = "uCarsTrade"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    maven(uri("https://repo.dmulloy2.net/nexus/repository/public/")) //spigot, ProtocolLib
    maven(uri("https://jitpack.io")) //VaultAPI
}

dependencies {
    compileOnly("org.spigotmc", "spigot", "1.16.2-R0.1-SNAPSHOT")
    compileOnly("com.comphenix.protocol", "ProtocolLib", "4.6.0") {
        exclude("net.bytebuddy", "byte-buddy")
    }
    compileOnly("com.github.MilkBowl", "VaultAPI", "1.7") {
        exclude("org.bukkit", "bukkit")
    }

    //temporary local dependency until uCars is published
    compileOnly(fileTree("libs") {
        include("*.jar")
    })
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}
