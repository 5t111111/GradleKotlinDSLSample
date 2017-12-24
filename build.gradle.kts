task("hello") {
    doLast { println("Hello, world!") }
}

plugins {
    application
    kotlin("jvm") version "1.2.10"
}

application {
    mainClassName = "sample.HelloWorldKt"
}

dependencies {
    compile(kotlin("stdlib"))
}

repositories {
    jcenter()
}
