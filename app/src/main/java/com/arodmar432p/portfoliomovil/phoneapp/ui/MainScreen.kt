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


@Composable
fun MainScreen(navController: NavController) {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp
    val screenHeight = configuration.screenHeightDp

    // Defino las estrellas en posiciones por la parte inferior
    // de la pantalla
    val starPositions = remember { listOf(
        Pair(screenWidth * 0.1f, screenHeight * 0.92f),
        Pair(screenWidth * 0.3f, screenHeight * 0.65f),
        Pair(screenWidth * 0.80f, screenHeight * 0.8f),
        Pair(screenWidth * 0.5f, screenHeight * 0.7f),
        Pair(screenWidth * 0.8f, screenHeight * 0.95f),
        Pair(screenWidth * 0.1f, screenHeight * 0.7f),
        Pair(screenWidth * 0.25f, screenHeight * 0.8f),
        Pair(screenWidth * 0.6f, screenHeight * 0.75f)
    ) }

    // Estado para controlar si se muestra o no la barra de navegación
    var showNavigationBar by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFF000000), Color(0xFF000000), Color(0xFF2F254C)),
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
                            .offset(x = (-32).dp, y = (-32).dp)
                            .background(
                                brush = Brush.verticalGradient(
                                    colors = listOf(
                                        Color.Black.copy(alpha = 1f),
                                        Color.Black.copy(alpha = 0.5f)
                                    ),
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
fun PreviewMainScreen() {
    val navController = rememberNavController()
    MainScreen(navController)
}

