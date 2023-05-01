import org.gradle.api.JavaVersion

object Config {

    const val compileSdk = 33
    const val minSDK = 21
    const val targetSDK = 33

    const val release = "release"
    const val debug = "debug"
    const val packageName = "quick.workout.com"

    object Options {
        val compileOptions = JavaVersion.VERSION_11
        const val kotlinOptions = "11"
    }

}