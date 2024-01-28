package com.arodmar432p.portfoliomovil.phoneapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.arodmar432p.portfoliomovil.R
import com.arodmar432p.portfoliomovil.phoneapp.data.ScreenNavigation

@Composable
fun MenuDots(onClick: () -> Unit, drawableId: Int) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopStart
    ) {
        IconButton(
            onClick = onClick,
            modifier = Modifier
                .size(30.dp)
                .padding(1.dp)
                .width(19.dp)
                .height(6.dp)
                .offset(x = 8.dp, y = (15).dp)
        ) {
            Image(
                painter = painterResource(id = drawableId),
                contentDescription = "Three dots button to open Menu bar",
                contentScale = ContentScale.Fit
            )
        }
    }
}

@Composable
fun NavigationBar(navController: NavController) {
    Box(
        modifier = Modifier
            .size(250.dp, 485.dp)
            .border(2.dp, Color.White, RoundedCornerShape(12.dp))
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color.Black.copy(alpha = 1f), Color.Black.copy(alpha = 0.85f)),
                    startY = 0.0f,
                    endY = Float.POSITIVE_INFINITY
                )
            ),contentAlignment = Alignment.Center
    ) {

        Image(
            painter =  painterResource(id = R.drawable.yo),
            contentDescription = "Small logo representing MainScreen section",
            modifier = Modifier
                .size(30.dp)
                .height(60.dp)
                .width(170.dp)
                .align(Alignment.TopCenter)
                .offset(x = 7.dp, y = (50).dp)
                .clickable { navController.navigate(ScreenNavigation.MainScreen.route) }
        )

        Image(
            painter =  painterResource(id = R.drawable.sobremi),
            contentDescription = "Small logo representing Sobre mi section",
            modifier = Modifier
                .size(25.dp)
                .height(310.dp)
                .width(170.dp)
                .align(Alignment.TopCenter)
                .offset(x = (-100).dp, y = (125).dp)
                .clickable { navController.navigate(ScreenNavigation.AboutMeScreen.route) }

        )
        Image(
            painter =  painterResource(id = R.drawable.software),
            contentDescription = "Small logo representing Software que uso",
            modifier = Modifier
                .size(28.dp)
                .height(310.dp)
                .width(170.dp)
                .align(Alignment.TopCenter)
                .offset(x = (-100).dp, y = (185).dp)
                .clickable { navController.navigate(ScreenNavigation.TechnologiesScreen.route) }

        )
        Image(
            painter =  painterResource(id = R.drawable.certificados),
            contentDescription = "Small logo representing Sobre mi section",
            modifier = Modifier
                .size(23.dp)
                .height(310.dp)
                .width(170.dp)
                .align(Alignment.TopCenter)
                .offset(x = (-99).dp, y = (245).dp)
                .clickable { navController.navigate(ScreenNavigation.CertificatesScreen.route) }

        )
        Image(
            painter =  painterResource(id = R.drawable.cv),
            contentDescription = "Small logo representing Certificados section",
            modifier = Modifier
                .size(24.5.dp)
                .height(310.dp)
                .width(170.dp)
                .align(Alignment.TopCenter)
                .offset(x = (-99).dp, y = (305).dp)
                .clickable { navController.navigate(ScreenNavigation.ProjectScreen.route) }

        )

        Image(
            painter =  painterResource(id = R.drawable.contact),
            contentDescription = "Small logo representing Contáctame section",
            modifier = Modifier
                .size(30.dp)
                .height(310.dp)
                .width(170.dp)
                .align(Alignment.TopCenter)
                .offset(x = (-98).dp, y = (365).dp)
                .clickable { navController.navigate(ScreenNavigation.ContactScreen.route) }

        )

        Text(
            text = "Sobre mí",
            style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(25.dp)
                .offset(x = ((-42).dp), y = (-100).dp)
                .clickable { navController.navigate(ScreenNavigation.AboutMeScreen.route) }
        )

        Text(
            text = "Software que uso",
            style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(250.dp)
                .height(25.dp)
                .offset(x = (-12).dp, y = (-40).dp)
                .clickable { navController.navigate(ScreenNavigation.TechnologiesScreen.route) }

        )

        Text(
            text = "Certificados",
            style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(25.dp)
                .offset(x = (-29).dp, y = (20).dp)
                .clickable { navController.navigate(ScreenNavigation.CertificatesScreen.route) }
        )

        Text(
            text = "Mis proyectos",
            style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(25.dp)
                .offset(x = (-24).dp, y = (80).dp)
                .clickable { navController.navigate(ScreenNavigation.ProjectScreen.route) }
        )

        Text(
            text = "Contáctame",
            style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFFFFF),
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                .width(190.dp)
                .height(25.dp)
                .offset(x = (-32).dp, y = (142).dp)
                .clickable { navController.navigate(ScreenNavigation.ContactScreen.route) }
        )

    }
}


@Preview(showBackground = true)
@Composable
fun PreviewNavigationMenu() {
    val navController = rememberNavController()
    NavigationBar(navController)
}

