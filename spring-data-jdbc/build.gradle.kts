
group = "ulllie"
version = "0.0.1-SNAPSHOT"

plugins {
    id("org.springframework.boot") version "3.2.0" apply false
    id("io.spring.dependency-management") version "1.1.4" apply false
}

apply(plugin = "org.springframework.boot")
apply(plugin = "io.spring.dependency-management")

dependencies {

    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
}
