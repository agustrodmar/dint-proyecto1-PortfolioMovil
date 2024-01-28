package com.arodmar432p.portfoliomovil.phoneapp.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.navigation.compose.rememberNavController
import com.arodmar432p.portfoliomovil.R
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import androidx.compose.material.Card




@Composable
fun Projects(navController: NavController) {
    // Estado para controlar si se muestra o no la barra de navegación
    var showNavigationBar by remember { mutableStateOf(false) }

    ProjectsBackground()

    // Cuando se pulse sobre este botón, se mostrará NavigationBar()
    MenuDots(onClick = { showNavigationBar = true })
    ProjectsStatusBar()

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
                .height(310.dp)
                .width(170.dp)
                .align(Alignment.BottomStart)
                .offset(x = 15.dp, y = (-10).dp)

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



@Preview(showBackground = true)
@Composable
fun PythonCard() {
    val image: Painter = painterResource(id = R.drawable.proyectopython)
    Card(
        shape = RoundedCornerShape(6.dp),
        modifier = Modifier
            .padding(horizontal = 100.dp),
        backgroundColor = Color.Transparent
    ) {
        Image(
            painter = image,
            contentDescription = "My Python Projects",
            contentScale = ContentScale.Crop
        )
    }
}


@Preview(showBackground = true)
@Composable
fun FigmaCard(){
    val image: Painter = painterResource(id = R.drawable.proyectoopochat)
    Card(
        shape = RoundedCornerShape(6.dp),
        modifier = Modifier
                .padding(horizontal = 100.dp),
        backgroundColor = Color.Transparent
    ) {
        Image(
            painter = image,
            contentDescription = "Figma Projects Card",
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BdCard() {
    val image: Painter = painterResource(id = R.drawable.proyectobd)
    Card(
        shape = RoundedCornerShape(6.dp),
        modifier = Modifier
                .padding(horizontal = 100.dp),
        backgroundColor = Color.Transparent
    ) {
        Image(
            painter = image,
            contentDescription = "DB Projects Card",
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeCard(){
    val image: Painter = painterResource(id = R.drawable.proyectocompose)
    Card(
        shape = RoundedCornerShape(6.dp),
        modifier = Modifier
            .padding(horizontal = 100.dp),
        backgroundColor = Color.Transparent
    ) {
        Image(
            painter = image,
            contentDescription = "Compose Projects Card",
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ErpCard() {
    val image: Painter = painterResource(id = R.drawable.proyectoerp)
    Card(
        shape = RoundedCornerShape(6.dp),
        modifier = Modifier
            .padding(horizontal = 100.dp),
        backgroundColor = Color.Transparent
    ) {
        Image(
            painter = image,
            contentDescription = "ERP Projects Card",
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true)
@Composable
fun UnityCard(){
    val image: Painter = painterResource(id = R.drawable.proyectounity)
    Card(
        shape = RoundedCornerShape(6.dp),
        modifier = Modifier
            .padding(horizontal = 100.dp),
        backgroundColor = Color.Transparent
    ) {
        Image(
            painter = image,
            contentDescription = "Unity Projects Card",
            contentScale = ContentScale.Crop
        )
    }
}