package com.arodmar432p.portfoliomovil.phoneapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

        Column(
            modifier = Modifier.align(Alignment.TopCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.objetivos),
                contentDescription = "image description",
                modifier = Modifier
                    .padding(top = 30.dp)
                    .width(119.dp)
                    .height(147.dp)
            )

            Text(
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
            )
        }

        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(top = 35.dp)
                .width(80.dp)
                .height(65.89185.dp)
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

        // El box de la caja con el texto
        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 120.dp)
                .width(274.dp)
                .height(547.dp)
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

        // Cuando se pulse sobre este botón, se mostrará NavigationBar()
        MenuDots(onClick = { showNavigationBar = true })

        // Si showNavigationBar es true, se muestra la barra de navegación
        if (showNavigationBar) {
            Box(
                modifier = Modifier
                    .padding(top = 80.dp)
            ) {
                Dialog(onDismissRequest = { showNavigationBar = false }) {
                    Box(
                        modifier = Modifier
                            .size(250.dp, 480.dp)
                            .offset(x = (-32).dp , y = (-32).dp)
                            .background(
                                brush = Brush.verticalGradient(
                                    colors = listOf(Color.Black.copy(alpha = 1f), Color.Black.copy(alpha = 0.5f)),
                                    startY = 0.0f,
                                    endY = Float.POSITIVE_INFINITY
                                ),
                                shape = RoundedCornerShape(16.dp) // Bordes redondeados
                            ),
                        contentAlignment = Alignment.TopStart
                    ) {
                        NavigationBar(navController)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAboutMe() {
    val navController = rememberNavController()
    AboutMe(navController)
}
