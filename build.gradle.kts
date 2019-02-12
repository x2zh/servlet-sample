
plugins {
    war
    java
}

repositories {
    mavenCentral()
}

dependencies {
    providedCompile("javax.servlet:javax.servlet-api:3.1.0")
    testImplementation("junit:junit:4.12")
}
