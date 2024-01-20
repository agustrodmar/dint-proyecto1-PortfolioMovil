@file:Suppress("SpellCheckingInspection")

package com.arodmar432p.portfoliomovil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.arodmar432p.portfoliomovil.phoneapp.data.ScreenNavigation
import com.arodmar432p.portfoliomovil.phoneapp.ui.AboutMe
import com.arodmar432p.portfoliomovil.phoneapp.ui.Certificates
import com.arodmar432p.portfoliomovil.phoneapp.ui.Contact
import com.arodmar432p.portfoliomovil.ui.theme.PortfolioMovilTheme
import com.arodmar432p.portfoliomovil.phoneapp.ui.MainScreen
import com.arodmar432p.portfoliomovil.phoneapp.ui.Projects
import com.arodmar432p.portfoliomovil.phoneapp.ui.Technologies

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PortfolioMovilTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = ScreenNavigation.MainScreen.route
                    ) {
                        composable(ScreenNavigation.MainScreen.route) {
                            MainScreen(navController)
                        }
                        composable(ScreenNavigation.AboutMeScreen.route) {
                            AboutMe(navController)
                        }
                        composable(ScreenNavigation.CertificatesScreen.route) {
                            Certificates(navController)
                        }
                        composable(ScreenNavigation.TechnologiesScreen.route) {
                            Technologies(navController)
                        }
                        composable(ScreenNavigation.ProjectScreen.route) {
                            Projects(navController)
                        }
                        composable(ScreenNavigation.ContactScreen.route) {
                            Contact(navController)
                        }
                    }
                }
            }
        }
    }
}





