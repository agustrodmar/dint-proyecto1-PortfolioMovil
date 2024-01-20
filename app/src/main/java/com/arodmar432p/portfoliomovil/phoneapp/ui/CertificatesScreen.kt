package com.arodmar432p.portfoliomovil.phoneapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
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


/**
 * La composable principal de esta screen
 */
@Composable
fun Certificates(navController: NavController) {
    // Estado para controlar si se muestra o no la barra de navegación
    var showNavigationBar by remember { mutableStateOf(false) }

    CertificatesBackground()

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

/**
 * La composable donde se determina el color del background
 * así como los elementos adicionales que le componen.
 */
@Composable
fun CertificatesBackground() {
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

        // Genero un segundo texto encima del primero para hacer efecto de sombras
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
                .offset(y = 360.dp)
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

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCertificates() {
    val navController = rememberNavController()
    Certificates(navController)
}


