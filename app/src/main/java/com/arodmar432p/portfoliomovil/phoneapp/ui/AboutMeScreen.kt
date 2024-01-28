package com.arodmar432p.portfoliomovil.phoneapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
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


@Composable
fun AboutMe(navController: NavController) {
    // Estado para controlar si se muestra o no la barra de navegación
    var showNavigationBar by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .width(393.dp)
            .height(852.dp)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFF2F254C), Color(0xFF2A0790)),
                    startY = 0.0f,
                    endY = Float.POSITIVE_INFINITY
                )
            )
    ) {
        Image(
            painter = painterResource(id = R.drawable.planeta1),
            contentDescription = "image description",
            contentScale = ContentScale.None,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(30.dp)
                .width(40.99996.dp)
                .height(44.23907.dp)
        )

        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .width(85.dp)
                .height(67.dp)
                .size(-20.dp)
                .offset(x = 10.dp, y = (-20).dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.planeta2),
                contentDescription = "Saturn picture",
                contentScale = ContentScale.None
            )
        }

        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(25.dp)
                .width(64.dp)
        )

        LazyRow(
            modifier = Modifier
                .fillMaxSize()
                .offset(y = (-10).dp),
            horizontalArrangement = Arrangement.Center) {
            item { TargetsBox() }
            item { BackgroundBox() }
            item { ValuesBox() }
        }

        // Cuando se pulse sobre este botón, se mostrará NavigationBar()
        MenuDots(onClick = { showNavigationBar = true }, drawableId = R.drawable.abrirmenuamarillo)

        AboutStatusBar()


        // Si showNavigationBar es true, se muestra la barra de navegación
        if (showNavigationBar) {
            Box(
                modifier = Modifier
            ) {
                Dialog(onDismissRequest = { showNavigationBar = false }) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .height(420.dp)
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
}


@Composable
fun AboutStatusBar() {
    // Obtiene una referencia a SystemUiController
    val systemUiController = rememberSystemUiController()

    SideEffect {
        // Establece el color de la barra de estado y los íconos
        systemUiController.setStatusBarColor(
            color = Color(0xFF2F254C),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAboutMe() {
    val navController = rememberNavController()
    AboutMe(navController)
}

@Preview(showBackground = true)
@Composable
fun TargetsBox() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = (-120).dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image( // La imagen se muestra arriba del todo
            painter = painterResource(id = R.drawable.objetivos),
            contentDescription = "A guy on a Rocket",
            modifier = Modifier
                .size(120.dp)
                .width(119.dp)
                .height(220.dp)
                .offset(y = (80).dp)
        )

        Text( // El texto se muestra entre la caja y la imagen
            text = "OBJETIVOS",
            style = TextStyle(
                fontSize = 25.76.sp,
                lineHeight = 18.89.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFCB14),
                textAlign = TextAlign.Center,
                letterSpacing = 1.07.sp,
            ),
            modifier = Modifier
                .width(123.14343.dp)
                .height(39.dp)
                .offset(y = 85.dp)
        )

        Box( // La caja se muestra debajo del texto objetivo, y bien en el centro
            modifier = Modifier
                .padding(horizontal = 50.dp)
                .width(274.dp)
                .height(475.dp)
                .offset( y = 90.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color(0xFF48194D), Color(0x8A221A47)),
                        startY = 0.0f,
                        endY = Float.POSITIVE_INFINITY
                    ),
                    shape = RoundedCornerShape(1.dp) // Ajustar este valor para cambiar la redondez de las esquinas
                )
                .border(
                    width = 2.dp,
                    color = Color(0xFF7C1DF5),
                    shape = RoundedCornerShape(10.dp) // la forma del borde me debe coincidir con la forma del fondo
                )
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BackgroundBox() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = (-120).dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image( // La imagen se muestra arriba del todo
            painter = painterResource(id = R.drawable.trayectoria),
            contentDescription = "A guy on a Rocket",
            modifier = Modifier
                .size(120.dp)
                .width(119.dp)
                .height(220.dp)
                .offset(y = (80).dp)
        )

        Text( // El texto se muestra entre la caja y la imagen
            text = "TRAYECTORIA",
            style = TextStyle(
                fontSize = 25.76.sp,
                lineHeight = 18.89.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFCB14),
                textAlign = TextAlign.Center,
                letterSpacing = 1.07.sp,
            ),
            modifier = Modifier
                .width(123.14343.dp)
                .height(39.dp)
                .offset(y = (85).dp)
        )

        Box( // La caja se muestra debajo del texto objetivo, y bien en el centro
            modifier = Modifier
                .padding(horizontal = 50.dp)
                .width(274.dp)
                .height(475.dp)
                .offset(y = 90.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color(0xFF48194D), Color(0x8A221A47)),
                        startY = 0.0f,
                        endY = Float.POSITIVE_INFINITY
                    ),
                    shape = RoundedCornerShape(1.dp) // Ajustar este valor para cambiar la redondez de las esquinas
                )
                .border(
                    width = 2.dp,
                    color = Color(0xFF7C1DF5),
                    shape = RoundedCornerShape(10.dp) // la forma del borde me debe coincidir con la forma del fondo
                )
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ValuesBox() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = (-120).dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image( // La imagen se muestra arriba del todo
            painter = painterResource(id = R.drawable.valores),
            contentDescription = "A picture of a robot",
            modifier = Modifier
                .size(120.dp)
                .width(119.dp)
                .height(220.dp)
                .offset(y = (80).dp)
        )

        Text( // El texto se muestra entre la caja y la imagen
            text = "VALORES",
            style = TextStyle(
                fontSize = 25.76.sp,
                lineHeight = 18.89.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFCB14),
                textAlign = TextAlign.Center,
                letterSpacing = 1.07.sp,
            ),
            modifier = Modifier
                .width(123.14343.dp)
                .height(39.dp)
                .offset(y = (85).dp)
        )

        Box( // La caja se muestra debajo del texto objetivo, y bien en el centro
            modifier = Modifier
                .padding(horizontal = 50.dp)
                .width(274.dp)
                .height(475.dp)
                .offset(y = 90.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color(0xFF48194D), Color(0x8A221A47)),
                        startY = 0.0f,
                        endY = Float.POSITIVE_INFINITY
                    ),
                    shape = RoundedCornerShape(1.dp) // Ajustar este valor para cambiar la redondez de las esquinas
                )
                .border(
                    width = 2.dp,
                    color = Color(0xFF7C1DF5),
                    shape = RoundedCornerShape(10.dp) // la forma del borde me debe coincidir con la forma del fondo
                )
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
            }
        }
    }
}