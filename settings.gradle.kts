pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "BankUtilsMultiplatform"
include(":androidApp")
include(":library:utils-country")
include(":library:utils-currency")
