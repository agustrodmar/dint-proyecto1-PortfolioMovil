package com.arodmar432p.portfoliomovil.phoneapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.layout.ContentScale
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
 * IMPORTANTE:
 * TODO: PARA PRUEBAS DE DISEÑO mapa de calor: https://vas.3m.com/
 * TODO: PRUEBA DE LOS CINCO SEGUNDOS: http://www.uxables.com/
 * TODO: ENVIA EL DISEÑO A LOS USUARIOS PARA QUE LO TESTEEN: https://www.lyssna.com/
 */

@Composable
fun TechnologiesScreen(navController: NavController) {
    // Estado para controlar si se muestra o no la barra de navegación
    var showNavigationBar by remember { mutableStateOf(false) }

    Background()
    MainTechnologiesFrame()

    // Cuando se pulse sobre este botón, se mostrará NavigationBar()
    MenuDots(onClick = { showNavigationBar = true }, drawableId = R.drawable.abrirmenuamarillo)

    TechnologiesStatusBar()

    // Si showNavigationBar es true, se muestra la barra de navegación
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

@Composable
fun Background() {

    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp
    val screenHeight = configuration.screenHeightDp

    val starPositions = remember { listOf(
        Pair(screenWidth * 0.1f, screenHeight * 0.6f),
        Pair(screenWidth * 0.2f, screenHeight * 0.7f),
        Pair(screenWidth * 0.12f, screenHeight * 0.3f),
        Pair(screenWidth * 0.4f, screenHeight * 0.9f),
        Pair(screenWidth * 0.5f, screenHeight * 0.4f),
        Pair(screenWidth * 0.6f, screenHeight * 0.7f),
        Pair(screenWidth * 0.7f, screenHeight * 0.8f),
        Pair(screenWidth * 0.8f, screenHeight * 0.7f),
        Pair(screenWidth * 0.9f, screenHeight * 0.6f),
        Pair(screenWidth * 0.1f, screenHeight * 0.7f),
        Pair(screenWidth * 0.2f, screenHeight * 0.8f),
        Pair(screenWidth * 0.2f, screenHeight * 0.12f)
    ) }

    Box(
        modifier = Modifier
            .width(393.dp)
            .height(852.dp)
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF2A0790),
                        Color(0xFF2A0790),
                        Color(0xFF4668E1)
                    )
                )
            )
    ) {
        Text(
            text = "TECNOLOGÍAS QUE USO",
            modifier = Modifier
                .width(183.dp)
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

        // Genero un segundo texto para formar una sombra sólida.
        Text(
            text = "TECNOLOGÍAS QUE USO",
            modifier = Modifier
                .width(183.25.dp)
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

        // TODO: Añadir los textos de las apps aquí
        Text(
            text = "JAVA",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(25.dp)
                .align(Alignment.Center)
                .offset(x = (-100).dp, y = (-130).dp)
            // .clickable { navController.navigate(ScreenNavigation.AboutMeScreen.route) }
        )
        Text(
            text = "PYTHON",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(25.dp)
                .align(Alignment.Center)
                .offset(y = (-130).dp)
            // .clickable { navController.navigate(ScreenNavigation.AboutMeScreen.route) }
        )
        Text(
            text = "unity",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(25.dp)
                .align(Alignment.Center)
                .offset(x = 100.dp, y = (-130).dp)
            // .clickable { navController.navigate(ScreenNavigation.AboutMeScreen.route) }
        )
        Text(
            text = "C++",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(25.dp)
                .align(Alignment.Center)
                .offset(x = (-100).dp, y = (-20).dp)
            // .clickable { navController.navigate(ScreenNavigation.AboutMeScreen.route) }
        )
        Text(
            text = "ANGULAR",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(25.dp)
                .align(Alignment.Center)
                .offset(y = (-20).dp)
            // .clickable { navController.navigate(ScreenNavigation.AboutMeScreen.route) }
        )
        Text(
            text = "DOCKER",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(25.dp)
                .align(Alignment.Center)
                .offset(x = 100.dp, y = (-20).dp)
            // .clickable { navController.navigate(ScreenNavigation.AboutMeScreen.route) }
        )
        Text(
            text = "GIT",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(25.dp)
                .align(Alignment.Center)
                .offset(x = (-100).dp, y = (90).dp)
            // .clickable { navController.navigate(ScreenNavigation.AboutMeScreen.route) }
        )
        Text(
            text = "C#",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(25.dp)
                .align(Alignment.Center)
                .offset(y = 90.dp)
            // .clickable { navController.navigate(ScreenNavigation.AboutMeScreen.route) }
        )
        Text(
            text = "KOTLIN",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(25.dp)
                .align(Alignment.Center)
                .offset(x = 100.dp, y = 90.dp)
            // .clickable { navController.navigate(ScreenNavigation.AboutMeScreen.route) }
        )
        Text(
            text = "CSS3",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(25.dp)
                .align(Alignment.Center)
                .offset(x = (-100).dp, y = (200).dp)
            // .clickable { navController.navigate(ScreenNavigation.AboutMeScreen.route) }
        )
        Text(
            text = "JAVA",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(25.dp)
                .align(Alignment.Center)
                .offset(y = (200).dp)
            // .clickable { navController.navigate(ScreenNavigation.AboutMeScreen.route) }
        )
        Text(
            text = "JAVA",
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(25.dp)
                .align(Alignment.Center)
                .offset(x = 100.dp, y = 200.dp)
            // .clickable { navController.navigate(ScreenNavigation.AboutMeScreen.route) }
        )

        for ((x, y) in starPositions) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.BottomStart)
                    .offset(x = x.dp, y = y.dp)
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

        Image(
            painter = painterResource(id = R.drawable.cohete1),
            contentDescription = "Just a rocket",
            modifier = Modifier
                .size(140.dp)
                .width(120.dp)
                .height(180.dp)
                .align(Alignment.BottomEnd)
                .padding(end = 40.dp, bottom = 60.dp)
                .offset(x = 20.dp, y = 30.dp),
            contentScale = ContentScale.Fit
        )

        Image(
            painter= painterResource(id = R.drawable.sol),
            contentDescription = "The sun",
            modifier = Modifier
                .size(90.dp)
                .width(120.dp)
                .height(250.dp)
                .align(Alignment.TopEnd)
                .offset(y = 40.dp)
                .padding(end = 25.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.luna),
            contentDescription = "The moon",
            modifier = Modifier
                .size(160.dp)
                .width(40.dp)
                .height(200.dp)
                .align(Alignment.BottomStart)
                .offset(x = -20.dp, y = 40.dp)
                .padding(start = 20.dp, bottom = 120.dp)
        )
    }
}

/**
 * El marco en el que van a ir las tecnologías que voy a ir añadiendo.
 */
@Composable
fun MainTechnologiesFrame() {

    Box(
        modifier = Modifier
            .width(393.dp)
            .height(852.dp)

    ) {

        Image(
            painter = painterResource(id = R.drawable.java),
            contentDescription = "Java logo",
            modifier = Modifier
                .size(75.dp)
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
                .align(Alignment.Center)
                .offset(x = (-100).dp, y = (-180).dp)
        )

        Image(
            painter = painterResource(id = R.drawable.python),
            contentDescription = "Python logo",
            modifier = Modifier
                .size(75.dp)
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
                .align(Alignment.Center)
                .offset(y = (-180).dp)
        )

        Image(
            painter = painterResource(id = R.drawable.unity),
            contentDescription = "Unity logo",
            modifier = Modifier
                .size(75.dp)
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
                .align(Alignment.Center)
                .offset(x = 100.dp, y = (-180).dp)
        )

        Image(
            painter = painterResource(id = R.drawable.cplusplus),
            contentDescription = "C++ logo",
            modifier = Modifier
                .size(75.dp)
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
                .align(Alignment.Center)
                .offset(x = (-100).dp, y = (-70).dp)
        )
        Image(
            painter = painterResource(id = R.drawable.angular),
            contentDescription = "Angular logo",
            modifier = Modifier
                .size(75.dp)
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
                .align(Alignment.Center)
                .offset(y = (-70).dp)
        )
        Image(
            painter = painterResource(id = R.drawable.kotlin),
            contentDescription = "kotlin logo",
            modifier = Modifier
                .size(75.dp)
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
                .align(Alignment.Center)
                .offset(x = 100.dp, y = (40).dp)
        )
        Image(
            painter = painterResource(id = R.drawable.git),
            contentDescription = "Git logo",
            modifier = Modifier
                .size(75.dp)
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
                .align(Alignment.Center)
                .offset(x = (-100).dp, y = (40).dp)
        )
        Image(
            painter = painterResource(id = R.drawable.csharp),
            contentDescription = "C#",
            modifier = Modifier
                .size(75.dp)
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
                .align(Alignment.Center)
                .offset(y = (40).dp)
        )
        Image(
            painter = painterResource(id = R.drawable.docker),
            contentDescription = "Docker logo",
            modifier = Modifier
                .size(75.dp)
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
                .align(Alignment.Center)
                .offset(x = 100.dp, y = (-70).dp)
        )
        Image(
            painter = painterResource(id = R.drawable.css),
            contentDescription = "CSS logo",
            modifier = Modifier
                .size(75.dp)
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
                .align(Alignment.Center)
                .offset(x = (-100).dp, y = 150.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.javascript),
            contentDescription = "JavaScript logo",
            modifier = Modifier
                .size(75.dp)
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
                .align(Alignment.Center)
                .offset(y = 150.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.html),
            contentDescription = "HTML5 logo",
            modifier = Modifier
                .size(78.dp)
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
                .align(Alignment.Center)
                .offset(x = 100.dp, y = 150.dp)
        )
    }
}

@Composable
fun TechnologiesStatusBar() {
    // Obtiene una referencia a SystemUiController
    val systemUiController = rememberSystemUiController()

    SideEffect {
        // Establece el color de la barra de estado y los íconos
        systemUiController.setStatusBarColor(
            color = Color(0xFF2A0790),
        )
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewTechnologies() {
    val navController = rememberNavController()
    TechnologiesScreen(navController)
}

