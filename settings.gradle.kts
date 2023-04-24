pluginManagement {
	repositories {
		google()
		gradlePluginPortal()
		mavenCentral()
	}
}

dependencyResolutionManagement {
	repositories {
		google()
		mavenCentral()
	}
}

rootProject.name = "KMM_Sample_App"
include(":androidApp")
include(":shared")

// https://docs.gradle.org/current/userguide/composite_builds.html
include(":kmmlibmodule")
