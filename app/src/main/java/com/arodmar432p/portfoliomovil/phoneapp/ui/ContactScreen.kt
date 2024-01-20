package com.arodmar432p.portfoliomovil.phoneapp.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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


@Composable
fun Contact(navController: NavController) {
    // Estado para controlar si se muestra o no la barra de navegación
    var showNavigationBar by remember { mutableStateOf(false) }

    ContactScreenBackground()

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

@Preview(showBackground = true)
@Composable
fun PreviewContact() {
    val navController = rememberNavController()
    Contact(navController)
}

@Composable
fun ContactScreenBackground() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF52F1FC),
                        Color(0xFF52F1FC),
                        Color(0xFFFFFFFF)
                    ),
                    startY = 0.0f,
                    endY = Float.POSITIVE_INFINITY
                )
            )
    ) {
        Image(
            painter = painterResource(id = R.drawable.nubecontacto),
            contentDescription = "A picture of a cloud with my logo",
            modifier = Modifier
                .height(200.dp)
                .width(200.dp)
                .align(Alignment.TopCenter)
                .padding(top = 20.dp)
                .offset(y = (50).dp)

        )

        Image(
            painter = painterResource(id = R.drawable.nubepeque2),
            contentDescription = "A picture of small cloud, top left",
            modifier = Modifier
                .size(75.dp)
                .height(210.dp)
                .width(90.dp)
                .align(Alignment.TopStart)
                .padding(top = 20.dp)
                .offset(x = 15.dp, y = (-10).dp)

        )
        Image(
            painter = painterResource(id = R.drawable.nubepeque3),
            contentDescription = "A picture of small cloud, top right",
            modifier = Modifier
                .size(70.dp)
                .height(200.dp)
                .width(90.dp)
                .align(Alignment.TopEnd)
                .padding(top = 20.dp)
                .offset(x = (-10).dp, y = (-10).dp)

        )

        Image(
            painter = painterResource(id = R.drawable.pajarorojo),
            contentDescription = "A picture of small red bird.",
            modifier = Modifier
                .size(40.dp)
                .height(200.dp)
                .width(90.dp)
                .align(Alignment.CenterEnd)
                .padding(top = 20.dp)
                .offset(x = (-10).dp, y = (-10).dp)

        )
        Image(
            painter = painterResource(id = R.drawable.pajarosepia),
            contentDescription = "A picture of small cuttleflish bird.",
            modifier = Modifier
                .size(80.dp)
                .height(90.dp)
                .width(80.dp)
                .align(Alignment.Center)
                .padding(top = 60.dp)
                .offset(x = (-125).dp, y = (-180).dp)

        )
        Image(
            painter = painterResource(id = R.drawable.pajarocadista),
            contentDescription = "A picture of small yellow and blue bird",
            modifier = Modifier
                .size(40.dp)
                .height(200.dp)
                .width(90.dp)
                .align(Alignment.Center)
                .padding(top = 20.dp)
                .offset(x = (120).dp, y = (-170).dp)

        )

        Image(
            painter = painterResource(id = R.drawable.ciudad),
            contentDescription = "A city that is part of the wallpaper",
            modifier = Modifier
                .align(Alignment.BottomStart)
        )

        Image(
            painter = painterResource(id = R.drawable.bosque),
            contentDescription = "A small forest that is part of the wallpaper",
            modifier = Modifier
                .fillMaxWidth()
                .size(30.dp)
                .align(Alignment.BottomCenter)
                .offset(x = 100.dp)
        )

        Text(
            text = "Envíame un mensaje",
            modifier = Modifier
                .width(200.dp)
                .height(80.dp)
                .align(Alignment.Center)
                .padding(top = 40.dp)
                .offset(x = 5.dp, y = (-150).dp),
            style = TextStyle(
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.interbold)),
                fontWeight = FontWeight(100),
                color = Color.Black,
                textAlign = TextAlign.Justify

            )
        )
    }
}

