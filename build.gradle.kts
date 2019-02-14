
plugins {
    war
    java
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    providedCompile("javax.servlet:javax.servlet-api:3.1.0")
    testImplementation("junit:junit:4.12")
}
