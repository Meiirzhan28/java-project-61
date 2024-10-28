plugins {
    id("java")
    id("application")
    id("checkstyle")
}

checkstyle {
    configFile = file("app/config/checkstyle/checkstyle.xml")
}


application {

   mainClass.set("hexlet.code.App")
}
tasks.withType(Checkstyle) {
    reports {
        xml.required = false
        html.required = true
    }
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
}

tasks.test {
    useJUnitPlatform()
}

