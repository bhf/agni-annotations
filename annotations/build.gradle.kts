plugins {
    java
}


dependencies {
    implementation(project(":annotations"))
    implementation(libs.log4j.api)
    implementation(libs.log4j.core)

    testImplementation(platform(libs.junit.bom))
    testImplementation(libs.junit)
    testImplementation(libs.junit.params)
    testImplementation(libs.mockito)
    testImplementation(libs.mockito.junit)
}

tasks.test {
    useJUnitPlatform()
}
