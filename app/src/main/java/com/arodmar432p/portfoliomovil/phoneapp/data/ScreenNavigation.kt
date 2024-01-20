package com.arodmar432p.portfoliomovil.phoneapp.data

sealed class ScreenNavigation(val route: String) {

    object MainScreen : ScreenNavigation("MainScreen")

    object AboutMeScreen : ScreenNavigation("AboutMe")

    object CertificatesScreen : ScreenNavigation("Certificates")

    object TechnologiesScreen : ScreenNavigation("Technologies")

    object ProjectScreen : ScreenNavigation("Projects")

    object ContactScreen : ScreenNavigation("ContactMe")
}