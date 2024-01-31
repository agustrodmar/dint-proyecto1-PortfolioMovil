package com.arodmar432p.portfoliomovil.phoneapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.arodmar432p.portfoliomovil.R
import com.google.accompanist.systemuicontroller.rememberSystemUiController

/**
 * Initial Screen of the App
 *
 * @param navController allows the user to navigate between screens.
 */
@Composable
fun MainScreen(navController: NavController) {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp
    val screenHeight = configuration.screenHeightDp

    // The small white stars that are going to be on the screen.
    val starPositions = remember { listOf(
        Pair(0.1f, 0.92f),
        Pair(0.3f, 0.65f),
        Pair(0.80f, 0.8f),
        Pair(0.5f, 0.7f),
        Pair(0.8f, 0.95f),
        Pair(0.1f, 0.7f),
        Pair(0.25f, 0.8f),
        Pair(0.6f, 0.75f)
    ) }

    // It controls if NavigationBar must be showed or not
    var showNavigationBar by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFF000000), Color(0xFF000000),
                        Color(0xFF000000), Color(0xFF2F254C)),
                    startY = 0.0f,
                    endY = Float.POSITIVE_INFINITY
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Agustín R.Márquez\nSoftware Developer\n",
            style = TextStyle(
                fontSize = 28.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(134.dp)
                .offset(y = (-40).dp)
        )
        Image(
            painter = painterResource(id = R.drawable.es),
            contentDescription = "Spanish flag",
            modifier = Modifier
                .height(25.dp)
                .width(25.dp)
                .offset(x = (-65).dp)
        )
        Image(
            painter = painterResource(id = R.drawable.deutsch),
            contentDescription = "Deutschland flag",
            modifier = Modifier
                .height(25.dp)
                .width(25.dp)
                .offset(x = (65).dp)
        )
        Image(
            painter = painterResource(id = R.drawable.us),
            contentDescription = "US flag",
            modifier = Modifier
                .height(25.dp)
                .width(25.dp)
                .offset()
        )
        Image(
            painter = painterResource(id = R.drawable.es),
            contentDescription = "Spanish flag",
            modifier = Modifier
                .height(25.dp)
                .width(25.dp)
                .offset(x = (-65).dp)
        )

        Text(
            text = "Codewars",
            style = TextStyle(
                fontSize = 11.sp,
                fontFamily = FontFamily(Font(R.font.interbold)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(134.dp)
                .offset(x = (-75).dp,y = (90).dp)
        )
        Text(
            text = "Github",
            style = TextStyle(
                fontSize = 11.sp,
                fontFamily = FontFamily(Font(R.font.interbold)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(134.dp)
                .offset(x = (0).dp,y = (90).dp)
        )

        Text(
            text = "Linkedin",
            style = TextStyle(
                fontSize = 11.sp,
                fontFamily = FontFamily(Font(R.font.interbold)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(134.dp)
                .offset(x = (75).dp,y = (90).dp)
        )

        for ((x, y) in starPositions) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.BottomStart)
                    .offset(x = (screenWidth * x).dp, y = (screenHeight * y).dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.star),
                    contentDescription = "small white stars",
                    modifier = Modifier
                        .width(22.dp)
                        .height(10.22593.dp)
                )
            }
        }

        // When pressed, it shows NavigationBar()
        MenuDots(onClick = { showNavigationBar = true }, drawableId = R.drawable.abrirmenublanco)

        BlackStatusBar()

        if (showNavigationBar) {
            Box(
                modifier = Modifier
            ) {
                Dialog(onDismissRequest = { showNavigationBar = false }) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .height(480.dp)
                            .size(150.dp, 480.dp)
                            .height(20.dp)
                            .offset(x = (-32).dp),
                        contentAlignment = Alignment.TopStart
                    ) {
                        NavigationBar(navController)
                        //ScrollScreen() In case I do want to add scroll later on.
                    }
                }
            }
        }
    }
}


/**
 * A composable function that sets the status bar color to black.
 */
@Composable
fun BlackStatusBar() {
    // Obtiene una referencia a SystemUiController
    val systemUiController = rememberSystemUiController()

    SideEffect {
        // Establish a color for the status bar
        systemUiController.setStatusBarColor(
            color = Color.Black,
        )
    }
}

/**
 * A preview function for MainScreen.
 */
@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    val navController = rememberNavController()
    MainScreen(navController)
}