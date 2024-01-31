package com.arodmar432p.portfoliomovil.phoneapp.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
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
import com.arodmar432p.portfoliomovil.R
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import androidx.compose.material.Card
import androidx.navigation.compose.rememberNavController


/**
 * A composable function that displays the ProjectsScreen.
 *
 * @param navController The NavController used for navigation.
 */
@Composable
fun ProjectsScreen(navController: NavController) {
    // State to control whether the navigation bar is shown or not
    var showNavigationBar by remember { mutableStateOf(false) }

    ProjectsBackground()


    MenuDots(onClick = { showNavigationBar = true }, drawableId = R.drawable.abrirmenuamarillo)

    ProjectsStatusBar()


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

    // El LazyRow para hacer scroll entre proyectos
    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = 200.dp),
        horizontalArrangement = Arrangement.Center) {
        item { PythonCard() }
        item { FigmaCard() }
        item { BdCard() }
        item { ComposeCard() }
        item { ErpCard() }
        item { UnityCard() }
    }
}

/**
 * A composable function that displays the background for the projects screen.
 */
@Composable
fun ProjectsBackground(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF389FFF),
                        Color(0xFF389FFF),
                        Color(0xFF52F1Fc)
                    ),
                    startY = 0.0f,
                    endY = Float.POSITIVE_INFINITY
                )
            )
    ) {
        Text(
            text = "MIS PROYECTOS",
            modifier = Modifier
                .width(130.dp)
                .height(92.dp)
                .align(Alignment.TopCenter)
                .padding(top = 60.dp),
            style = TextStyle(
                fontSize = 26.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFCB14),
                textAlign = TextAlign.Justify

            )
        )
        Text(
            text = "MIS PROYECTOS",
            modifier = Modifier
                .width(130.dp)
                .height(92.dp)
                .align(Alignment.TopCenter)
                .padding(top = 60.dp),
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
            text = "MIS PROYECTOS",
            modifier = Modifier
                .width(131.25.dp)
                .height(92.dp)
                .align(Alignment.TopCenter)
                .padding(top = 60.dp),
            style = TextStyle(
                fontSize = 26.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFCB14),
                textAlign = TextAlign.Justify

            )
        )

        Image(
            painter = painterResource(id = R.drawable.nubegrande1),
            contentDescription = "A picture of a cloud",
            modifier = Modifier
                .height(270.dp)
                .width(130.dp)
                .align(Alignment.BottomStart)
                .offset(x = 15.dp, y = (20).dp)

        )

        Image(
            painter = painterResource(id = R.drawable.nubepeque1),
            contentDescription = "A picture of a small cloud",
            modifier = Modifier
                .height(110.dp)
                .width(70.dp)
                .align(Alignment.BottomEnd)
                .offset(x = (-30).dp, y = (-65).dp)

        )
    }
}


/**
 * A composable function that sets the status bar color for the projects screen.
 */
@Composable
fun ProjectsStatusBar() {
    // Obtiene una referencia a SystemUiController
    val systemUiController = rememberSystemUiController()

    SideEffect {
        // Establece el color de la barra de estado y los íconos
        systemUiController.setStatusBarColor(
            color = Color(0xFF389FFF),
        )
    }
}


/**
 * A preview function for PythonCard.
 */
@Preview(showBackground = true)
@Composable
fun PythonCard() {
    val image: Painter = painterResource(id = R.drawable.proyectopython)
    val arrow: Painter = painterResource(id = R.drawable.coheteflecha)

    Box(modifier = Modifier
        .fillMaxSize()
        .offset(y = (-30).dp)){
        Column(
            modifier = Modifier
                .padding(bottom = 255.dp)
                .padding(horizontal = 60.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Card(
                shape = RoundedCornerShape(6.dp),
                backgroundColor = Color.Transparent,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(380.dp)
                    .width(250.dp)
            ) {
                Image(
                    painter = image,
                    contentDescription = "Python Projects Card",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .height(10.dp)
                        .width(1.dp)
                )
            }

            Image(
                painter = arrow,
                contentDescription = "Arrow",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(60.dp)
                    .width(60.dp)
            )
        }
    }
}

    /**
 * A preview function for FigmaCard.
 */
@Preview(showBackground = true)
@Composable
fun FigmaCard(){
        val image: Painter = painterResource(id = R.drawable.proyectoopochat)
        val arrow: Painter = painterResource(id = R.drawable.coheteflecha)

        Box(modifier = Modifier
            .fillMaxSize()
            .offset(y = (-30).dp)){
            Column(
                modifier = Modifier
                    .padding(bottom = 255.dp)
                    .padding(horizontal = 60.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Card(
                    shape = RoundedCornerShape(6.dp),
                    backgroundColor = Color.Transparent,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .height(380.dp)
                        .width(250.dp)
                ) {
                    Image(
                        painter = image,
                        contentDescription = "Python Projects Card",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .height(10.dp)
                            .width(1.dp)
                    )
                }

                Image(
                    painter = arrow,
                    contentDescription = "Arrow",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .height(60.dp)
                        .width(60.dp)
                )
            }
        }
    }


/**
 * A preview function for BdCard.
 */
@Preview(showBackground = true)
@Composable
fun BdCard() {
    val image: Painter = painterResource(id = R.drawable.proyectobd)
    val arrow: Painter = painterResource(id = R.drawable.coheteflecha)

    Box(modifier = Modifier
        .fillMaxSize()
        .offset(y = (-30).dp)){
        Column(
            modifier = Modifier
                .padding(bottom = 255.dp)
                .padding(horizontal = 60.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Card(
                shape = RoundedCornerShape(6.dp),
                backgroundColor = Color.Transparent,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(380.dp)
                    .width(250.dp)
            ) {
                Image(
                    painter = image,
                    contentDescription = "Python Projects Card",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .height(10.dp)
                        .width(1.dp)
                )
            }

            Image(
                painter = arrow,
                contentDescription = "Arrow",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(60.dp)
                    .width(60.dp)
            )
        }
    }
}


/**
 * A preview function for ComposeCard.
 */
@Preview(showBackground = true)
@Composable
fun ComposeCard(){
    val image: Painter = painterResource(id = R.drawable.proyectocompose)
    val arrow: Painter = painterResource(id = R.drawable.coheteflecha)

    Box(modifier = Modifier
        .fillMaxSize()
        .offset(y = (-30).dp)){
        Column(
            modifier = Modifier
                .padding(bottom = 255.dp)
                .padding(horizontal = 60.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Card(
                shape = RoundedCornerShape(6.dp),
                backgroundColor = Color.Transparent,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(380.dp)
                    .width(250.dp)
            ) {
                Image(
                    painter = image,
                    contentDescription = "Python Projects Card",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .height(10.dp)
                        .width(1.dp)
                )
            }

            Image(
                painter = arrow,
                contentDescription = "Arrow",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(60.dp)
                    .width(60.dp)
            )
        }
    }
}


/**
 * A preview function for ErpCard.
 */
@Preview(showBackground = true)
@Composable
fun ErpCard() {
    val image: Painter = painterResource(id = R.drawable.proyectoerp)
    val arrow: Painter = painterResource(id = R.drawable.coheteflecha)

    Box(modifier = Modifier
        .fillMaxSize()
        .offset(y = (-30).dp)){
        Column(
            modifier = Modifier
                .padding(bottom = 255.dp)
                .padding(horizontal = 60.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Card(
                shape = RoundedCornerShape(6.dp),
                backgroundColor = Color.Transparent,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(380.dp)
                    .width(250.dp)
            ) {
                Image(
                    painter = image,
                    contentDescription = "Python Projects Card",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .height(10.dp)
                        .width(1.dp)
                )
            }

            Image(
                painter = arrow,
                contentDescription = "Arrow",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(60.dp)
                    .width(60.dp)
            )
        }
    }
}

/**
 * A preview function for UnityCard.
 */
@Preview(showBackground = true)
@Composable
fun UnityCard(){
    val image: Painter = painterResource(id = R.drawable.proyectounity)
    val arrow: Painter = painterResource(id = R.drawable.coheteflechareves)

    Box(modifier = Modifier
        .fillMaxSize()
        .offset(y = (-30).dp)){
        Column(
            modifier = Modifier
                .padding(bottom = 255.dp)
                .padding(horizontal = 60.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Card(
                shape = RoundedCornerShape(6.dp),
                backgroundColor = Color.Transparent,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(380.dp)
                    .width(250.dp)
            ) {
                Image(
                    painter = image,
                    contentDescription = "Python Projects Card",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .height(10.dp)
                        .width(1.dp)
                )
            }

            Image(
                painter = arrow,
                contentDescription = "Arrow",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(60.dp)
                    .width(60.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCProjects() {
    val navController = rememberNavController()
    ProjectsScreen(navController)
}
