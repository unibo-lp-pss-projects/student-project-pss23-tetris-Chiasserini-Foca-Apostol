plugins {
    java
    application
    checkstyle
}

repositories {
    mavenCentral() // Config for download Mavan dependencies
}

dependencies {
    // Dependencies for write the JUnitTest
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.1")
    // Dependencies for run the JUnitTest
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.1")
}

tasks.test {
    useJUnitPlatform() // Configure task "test" for use JUnit Platform
    testLogging { events("passed", "skipped", "failed") } // Print Test's result
}

application { // Config for specify the main class 
    mainClass.set("main.java.it.unibo.tetris.Main")
}
