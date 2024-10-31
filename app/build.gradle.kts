plugins {
    id("java")
    id("application")
    id("checkstyle")
}

checkstyle {
    toolVersion = "10.12.4"
    configFile = file("config/checkstyle/checkstyle.xml")
}


application {

   mainClass.set("hexlet.code.app")
}
tasks.withType<Checkstyle>().configureEach {
    reports {
        xml.required = false // Отключить XML-отчет
        html.required = true  // Включить HTML-отчет
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

