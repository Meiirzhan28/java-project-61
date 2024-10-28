plugins {
    id("java")
    id("application")
    id('checkstyle')
}

checkstyle {
    toolVersion = "10.12.4"
}


application {

   mainClass.set("hexlet.code.App")
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.11.0-M1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    checkstyle "com.puppycrawl.tools:checkstyle:${checkstyle.toolVersion}"
    checkstyle "group:artifact:version"
}

tasks.test {
    useJUnitPlatform()
}

