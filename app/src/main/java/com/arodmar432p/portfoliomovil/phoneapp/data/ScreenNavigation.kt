/**
 * A sealed class representing different screens for navigation.
 *
 * @property route The route of the screen.
 */
sealed class ScreenNavigation(val route: String) {

    /**
     * An object representing the MainScreen.
     */
    object MainScreen : ScreenNavigation("MainScreen")

    /**
     * An object representing the AboutMeScreen.
     */
    object AboutMeScreen : ScreenNavigation("AboutMe")

    /**
     * An object representing the CertificatesScreen.
     */
    object CertificatesScreen : ScreenNavigation("Certificates")

    /**
     * An object representing the TechnologiesScreen.
     */
    object TechnologiesScreen : ScreenNavigation("Technologies")

    /**
     * An object representing the ProjectScreen.
     */
    object ProjectScreen : ScreenNavigation("Projects")

    /**
     * An object representing the ContactScreen.
     */
    object ContactScreen : ScreenNavigation("ContactMe")
}
