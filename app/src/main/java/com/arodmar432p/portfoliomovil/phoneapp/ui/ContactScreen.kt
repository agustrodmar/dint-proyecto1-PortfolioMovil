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
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
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
                .height(120.dp)
                .width(200.dp)
                .align(Alignment.TopCenter)
                .padding(top = 10.dp)
                .offset(y = (33).dp)

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
                .offset(x = (-20).dp, y = (-80).dp)

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
                .offset(x = (-130).dp, y = (-240).dp)

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
                .offset(x = (120).dp, y = (-230).dp)

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
                .offset(x = 5.dp, y = (-220).dp),
            style = TextStyle(
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.interbold)),
                fontWeight = FontWeight(100),
                color = Color.Black,
                textAlign = TextAlign.Justify

            )
        )
        Text(
            text = "Nombre",
            modifier = Modifier
                .width(200.dp)
                .height(80.dp)
                .align(Alignment.Center)
                .padding(top = 40.dp)
                .offset(x = (-10).dp, y = (-182).dp),
            style = TextStyle(
                fontSize = 11.sp,
                fontFamily = FontFamily(Font(R.font.interbold)),
                fontWeight = FontWeight(100),
                color = Color.Black,
                textAlign = TextAlign.Justify

            )
        )
        Text(
            text = "E-mail",
            modifier = Modifier
                .width(200.dp)
                .height(80.dp)
                .align(Alignment.Center)
                .padding(top = 40.dp)
                .offset(x = (-10).dp, y = (-112).dp),
            style = TextStyle(
                fontSize = 11.sp,
                fontFamily = FontFamily(Font(R.font.interbold)),
                fontWeight = FontWeight(100),
                color = Color.Black,
                textAlign = TextAlign.Justify

            )
        )
        Text(
            text = "Mensaje",
            modifier = Modifier
                .width(200.dp)
                .height(80.dp)
                .align(Alignment.Center)
                .padding(top = 40.dp)
                .offset(x = (-10).dp, y = (-47).dp),
            style = TextStyle(
                fontSize = 11.sp,
                fontFamily = FontFamily(Font(R.font.interbold)),
                fontWeight = FontWeight(100),
                color = Color.Black,
                textAlign = TextAlign.Justify

            )
        )
        ContactMenu()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun ContactMenu() {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = 190.dp)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Campo de nombre
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            modifier = Modifier
                .width(220.dp)
                .height(36.dp)
                .background(Color.White)
                .border(BorderStroke(1.dp, Color.White), RoundedCornerShape(30.dp)),
            label = {},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.White,
                unfocusedBorderColor = Color.White
            )
        )

        Spacer(modifier = Modifier.height(30.dp)) // Espacio entre los campos

        // Campo de correo electrónico
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier
                .width(220.dp)
                .height(36.dp)
                .background(Color.White)
                .border(BorderStroke(1.dp, Color.White), RoundedCornerShape(30.dp)),
            label = {},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent
            )
        )

        Spacer(modifier = Modifier.height(30.dp)) // Espacio entre los campos

        // Campo de mensaje
        OutlinedTextField(
            value = message,
            onValueChange = { message = it },
            modifier = Modifier
                .width(220.dp)
                .height(170.dp)
                .background(Color.White)
                .background(color = Color(0xFFFFFF), shape = RoundedCornerShape(size = 20.dp)),
            label = {},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent
            )
        )

        Spacer(modifier = Modifier.height(15.dp)) // Espacio entre los campos

        // Botón de enviar
        Button(
            onClick = { /* Aquí va la lógica de tu botón */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
            modifier = Modifier
                .padding(1.dp)
                .width(230.dp)
                .height(57.dp)
                .background(color = Color(0xFF0B0A0A), shape = RoundedCornerShape(size = 20.dp))
        ) {
            Text(
                text = "Enviar",
                modifier = Modifier
                    .width(65.dp)
                    .height(24.dp),
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