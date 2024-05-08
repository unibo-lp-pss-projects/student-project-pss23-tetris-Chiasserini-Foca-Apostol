plugins {
    java
    application
    checkstyle
}

repositories {
    mavenCentral() // Config for download Mavan dependencies
}

application { // Config for specify the main class 
    mainClass.set("main.java.it.unibo.tetris.Main")
}
