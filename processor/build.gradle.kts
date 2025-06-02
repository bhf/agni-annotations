plugins {
    java
}

dependencies {
    implementation(libs.log4j.api)
    implementation(libs.log4j.core)
    testImplementation(platform(libs.junit.bom))
    testImplementation(libs.junit)
    testImplementation(libs.junit.params)
    testImplementation(libs.mockito)

}

tasks.test {
    useJUnitPlatform()
}
