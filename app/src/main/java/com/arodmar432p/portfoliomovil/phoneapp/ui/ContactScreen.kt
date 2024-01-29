package com.arodmar432p.portfoliomovil.phoneapp.ui


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
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
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.platform.LocalDensity
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.arodmar432p.portfoliomovil.R
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@Composable
fun ContactScreen(navController: NavController) {
    // Estado para controlar si se muestra o no la barra de navegación
    var showNavigationBar by remember { mutableStateOf(false) }

    ContactScreenBackground()

    // Cuando se pulse sobre este botón, se mostrará NavigationBar()
    MenuDots(onClick = { showNavigationBar = true }, drawableId = R.drawable.abrirmenunegro)

    ContactStatusBar()

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
fun ContactStatusBar() {
    // Obtiene una referencia a SystemUiController
    val systemUiController = rememberSystemUiController()

    SideEffect {
        // Establece el color de la barra de estado y los íconos
        systemUiController.setStatusBarColor(
            color = Color(0xFF52F1FC)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewContact() {
    val navController = rememberNavController()
    ContactScreen(navController)
}

@Composable
fun ContactScreenBackground() {
    BoxWithConstraints {
        val width = with(LocalDensity.current) { constraints.maxWidth.toDp() }
        val height = with(LocalDensity.current) { constraints.maxHeight.toDp() }

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
                    .size(width * 0.45f)
                    .height(height * 0.15f)
                    .width(width * 0.25f)
                    .align(Alignment.TopCenter)
                    .padding(top = height * 0.01f)
                    .offset(y = height * 0.04f)
            )

            Image(
                painter = painterResource(id = R.drawable.nubepeque2),
                contentDescription = "A picture of small cloud, top left",
                modifier = Modifier
                    .size(width * 0.20f)
                    .height(height * 0.2625f)
                    .width(width * 0.1125f)
                    .align(Alignment.TopStart)
                    .padding(top = height * 0.025f)
                    .offset(x = width * 0.01875f, y = height * -0.0125f)
            )

            Image(
                painter = painterResource(id = R.drawable.nubepeque3),
                contentDescription = "A picture of small cloud, top right",
                modifier = Modifier
                    .size(width * 0.20f)
                    .height(height * 0.25f)
                    .width(width * 0.1125f)
                    .align(Alignment.TopEnd)
                    .padding(top = height * 0.025f)
                    .offset(x = width * -0.0125f, y = height * -0.0125f)
            )

            Image(
                painter = painterResource(id = R.drawable.pajarorojo),
                contentDescription = "A picture of small red bird.",
                modifier = Modifier
                    .size(width * 0.12f)
                    .height(height * 0.25f)
                    .width(width * 0.1125f)
                    .align(Alignment.CenterEnd)
                    .padding(top = height * 0.025f)
                    .offset(x = width * -0.025f, y = height * -0.1f)
            )

            Image(
                painter = painterResource(id = R.drawable.pajarosepia),
                contentDescription = "A picture of small cuttleflish bird.",
                modifier = Modifier
                    .size(width * 0.20f)
                    .height(height * 0.1125f)
                    .width(width * 0.1f)
                    .align(Alignment.Center)
                    .padding(top = height * 0.075f)
                    .offset(x = width * -0.30f, y = height * -0.3f)
            )

            Image(
                painter = painterResource(id = R.drawable.pajarocadista),
                contentDescription = "A picture of small yellow and blue bird",
                modifier = Modifier
                    .size(width * 0.12f)
                    .height(height * 0.25f)
                    .width(width * 0.1125f)
                    .align(Alignment.Center)
                    .padding(top = height * 0.025f)
                    .offset(x = width * 0.30f, y = height * -0.2875f)
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
                    .height(height * 0.0375f)
                    .align(Alignment.BottomCenter)
                    .offset(x = width * 0.27f)
            )

            Text(
                text = "Envíame un mensaje",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = height * 0.215f),
                style = TextStyle(
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.interbold)),
                    fontWeight = FontWeight(100),
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
            )

            Text(
                text = "Nombre",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = height * 0.295f)
                    .offset(x = width * -0.20f),
                style = TextStyle(
                    fontSize = 11.sp,
                    fontFamily = FontFamily(Font(R.font.interbold)),
                    fontWeight = FontWeight(100),
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
            )

            Text(
                text = "E-mail",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = height * 0.380f)
                    .offset(x = width * -0.21f),
                style = TextStyle(
                    fontSize = 11.sp,
                    fontFamily = FontFamily(Font(R.font.interbold)),
                    fontWeight = FontWeight(100),
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
            )

            Text(
                text = "Mensaje",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = height * 0.465f)
                    .offset(x = width * -0.195f),
                style = TextStyle(
                    fontSize = 11.sp,
                    fontFamily = FontFamily(Font(R.font.interbold)),
                    fontWeight = FontWeight(100),
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
            )
            ContactMenu()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun ContactMenu() {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") }

    BoxWithConstraints {
        val width = with(LocalDensity.current) { constraints.maxWidth.toDp() }
        val height = with(LocalDensity.current) { constraints.maxHeight.toDp() }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .offset(y = height * 0.2f)
                .padding(96.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Campo de nombre
            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                modifier = Modifier
                    .width(width * 3.00f)
                    .height(height * 0.04f)
                    .background(Color.White)
                    .border(BorderStroke(1.dp, Color.White), RoundedCornerShape(30.dp)),
                label = {},
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(height * 0.045f)) // Espacio entre los campos

            // Campo de correo electrónico
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                modifier = Modifier
                    .width(width * 0.55f)
                    .height(height * 0.04f)
                    .background(Color.White)
                    .border(BorderStroke(1.dp, Color.White), RoundedCornerShape(30.dp)),
                label = {},
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(height * 0.045f)) // Espacio entre los campos

            // Campo de mensaje
            OutlinedTextField(
                value = message,
                onValueChange = { message = it },
                modifier = Modifier
                    .width(width * 0.55f)
                    .height(height * 0.2f)
                    .background(Color.White)
                    .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 20.dp)),
                label = {},
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Transparent,
                    unfocusedBorderColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(height * 0.015f)) // Espacio entre los campos

            // Botón de enviar
            Button(
                onClick = { /* Aquí va la lógica de tu botón */ },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                modifier = Modifier
                    .padding(1.dp)
                    .width(width * 0.575f)
                    .height(height * 0.06f)
                    .background(color = Color(0xFF0B0A0A), shape = RoundedCornerShape(size = 20.dp))
            ) {
                Text(
                    text = "Enviar",
                    modifier = Modifier
                        .width(width * 0.1625f)
                        .height(height * 0.03f),
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.interbold)),
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF)
                    )
                )
            }
        }
    }
}