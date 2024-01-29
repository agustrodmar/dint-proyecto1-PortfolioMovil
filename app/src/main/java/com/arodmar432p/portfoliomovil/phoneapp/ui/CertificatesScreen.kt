package com.arodmar432p.portfoliomovil.phoneapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
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
 * The main composable of this screen.
 *
 * @param navController exclusively for navigation
 */
@Composable
fun CertificatesScreen(navController: NavController) {

    var showNavigationBar by remember { mutableStateOf(false) }

    CertificatesBackground()


    MenuDots(onClick = { showNavigationBar = true }, drawableId = R.drawable.abrirmenuamarillo)

    CertificatesStatusBar()

    //
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
                }
            }
        }
    }
}

/**
 * A composable where the background color is determined
 * as well as the additional elements that compose it.
 */
@Composable
fun CertificatesBackground() {
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF4668E1),
                        Color(0xFF4668E1),
                        Color(0xFF389FFF)
                    ),
                    startY = 0.0f,
                    endY = Float.POSITIVE_INFINITY
                )
            )
    ) {
        Text(
            text = "CERTIFICADOS",
            modifier = Modifier
                .width(110.dp)
                .height(92.dp)
                .align(Alignment.TopCenter)
                .padding(top = 40.dp),
            style = TextStyle(
                fontSize = 26.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color.Black,
                textAlign = TextAlign.Justify
            )
        )

        Text(
            text = "CERTIFICADOS",
            modifier = Modifier
                .width(110.25.dp)
                .height(92.dp)
                .align(Alignment.TopCenter)
                .padding(top = 40.dp),
            style = TextStyle(
                fontSize = 26.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFCB14),
                textAlign = TextAlign.Justify
            )
        )

        Image(
            painter = painterResource(id = R.drawable.tierra),
            contentDescription = "Earth",
            modifier = Modifier
                .fillMaxSize()
                .height(IntrinsicSize.Min)
                .align(Alignment.BottomCenter)
                .offset(y = (screenHeight * 0.5).dp)
        )

        Image(
            painter = painterResource(id = R.drawable.astronauta),
            contentDescription = "A picture of an Astronaut",
            modifier = Modifier
                .width(140.dp)
                .height(70.dp)
                .align(Alignment.BottomCenter)
                .offset(y = (-150).dp, x = (-40).dp)
        )

        Image(
            painter = painterResource(id = R.drawable.cohetefuego),
            contentDescription = "A rocket picture",
            modifier = Modifier
                .width(80.dp)
                .height(330.dp)
                .align(Alignment.BottomEnd)
                .offset(y = (-95).dp, x = (-60).dp)
        )

        Image(
            painter = painterResource(id = R.drawable.nave),
            contentDescription = "A capsule picture",
            modifier = Modifier
                .width(80.dp)
                .height(330.dp)
                .align(Alignment.BottomStart)
                .offset(y = (-80).dp, x = (30).dp)
        )


        LazyRow(
            modifier = Modifier
                .fillMaxSize()
                .offset(y = 200.dp),
            horizontalArrangement = Arrangement.Center) {
            item { PythonCertificate() }
            item { MySqlCertificate() }
            item { JavaCertificate() }
            item { CsharpCertificate() }
        }

    }
}


/**
 * A composable function that sets the status bar color for the certificates screen.
 */
@Composable
fun CertificatesStatusBar() {
    // Gets a reference to SystemUiController
    val systemUiController = rememberSystemUiController()

    SideEffect {
        // Sets the status bar color and icons
        systemUiController.setStatusBarColor(
            color = Color(0xFF4668E1),
        )
    }
}


/**
 * A preview function for PythonCertificate.
 */
@Preview
@Composable
fun PythonCertificate(){
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp

    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Image(
        painter = painterResource(id = R.drawable.pythoncertificate),
        contentDescription = "Python Certificate Card",
        modifier = Modifier
            .padding(horizontal = (screenWidth * 0.225).dp)
            .size((screenWidth * 0.55).dp)
    )
        Image(painter = painterResource(id = R.drawable.coheteflecha),
            contentDescription = "A rocket working as an arrow",
            modifier = Modifier
                .size(35.dp)
                .offset(x = 315.dp, y = 90.dp)
        )
    }
}

/**
 * A preview function for CsharpCertificate.
 */
@Preview
@Composable
fun CsharpCertificate(){
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp

    Box(
        modifier = Modifier
            .fillMaxSize() // To modify if I need to add more things in the future.
    ){
        Image(
            painter = painterResource(id = R.drawable.csharpcertificate),
            contentDescription = "C# Certificate Card",
            modifier = Modifier
                .padding(horizontal = (screenWidth * 0.225).dp)
                .size((screenWidth * 0.55).dp)
        )
        Image(painter = painterResource(id = R.drawable.coheteflechareves),
            contentDescription = "A rocket working as an arrow",
            modifier = Modifier
                .size(35.dp)
                .offset(x = 15.dp, y = 90.dp)
        )
    }
}

/**
 * A preview function for MySqlCertificate.
 */
@Preview
@Composable
fun MySqlCertificate(){
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp

    Box(
        modifier = Modifier
            .fillMaxSize() // A modificar si se desean añadir más cosas en la screen a futuro.
    ){
        Image(
            painter = painterResource(id = R.drawable.mysqlcertificate),
            contentDescription = "MySQL Certificate Card",
            modifier = Modifier
                .padding(horizontal = (screenWidth * 0.225).dp)
                .size((screenWidth * 0.55).dp)
        )
        Image(painter = painterResource(id = R.drawable.coheteflecha),
            contentDescription = "A rocket working as an arrow",
            modifier = Modifier
                .size(35.dp)
                .offset(x = 315.dp, y = 90.dp)
        )
    }
}


/**
 * A preview function for JavaCertificate.
 */
@Preview
@Composable
fun JavaCertificate(){
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp

    Box(
        modifier = Modifier
            .fillMaxSize() // A modificar si se desean añadir más cosas en la screen a futuro.
    ){
        Image(
            painter = painterResource(id = R.drawable.javacertificate),
            contentDescription = "Java Certificate Card",
            modifier = Modifier
                .padding(horizontal = (screenWidth * 0.225).dp)
                .size((screenWidth * 0.55).dp)
        )
        Image(painter = painterResource(id = R.drawable.coheteflecha),
            contentDescription = "A rocket working as an arrow",
            modifier = Modifier
                .size(35.dp)
                .offset(x = 315.dp, y = 90.dp)
        )
    }
}

/**
 * A preview function for CertificatesScreen.
 */
@Preview(showBackground = true)
@Composable
fun PreviewCertificates() {
    val navController = rememberNavController()
    CertificatesScreen(navController)
}
