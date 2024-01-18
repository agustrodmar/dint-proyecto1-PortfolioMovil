package com.arodmar432p.portfoliomovil.phoneapp.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
import com.arodmar432p.portfoliomovil.R

/**
 * IMPORTANTE:
 * TODO: PARA PRUEBAS DE DISEÑO mapa de calor: https://vas.3m.com/
 * TODO: PRUEBA DE LOS CINCO SEGUNDOS: http://www.uxables.com/
 * TODO: ENVIA EL DISEÑO A LOS USUARIOS PARA QUE LO TESTEEN: https://www.lyssna.com/
 */

@Preview(showBackground = true)
@Composable
fun Technologies() {
    Background()
    MainTechnologiesFrame()
}

@Composable
fun Background() {

    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp
    val screenHeight = configuration.screenHeightDp

    val starPositions = remember { listOf(
        Pair(screenWidth * 0.1f, screenHeight * 0.6f),
        Pair(screenWidth * 0.2f, screenHeight * 0.7f),
        Pair(screenWidth * 0.12f, screenHeight * 0.3f),
        Pair(screenWidth * 0.4f, screenHeight * 0.9f),
        Pair(screenWidth * 0.5f, screenHeight * 0.4f),
        Pair(screenWidth * 0.6f, screenHeight * 0.7f),
        Pair(screenWidth * 0.7f, screenHeight * 0.8f),
        Pair(screenWidth * 0.8f, screenHeight * 0.7f),
        Pair(screenWidth * 0.9f, screenHeight * 0.6f),
        Pair(screenWidth * 0.1f, screenHeight * 0.7f),
        Pair(screenWidth * 0.2f, screenHeight * 0.8f),
        Pair(screenWidth * 0.2f, screenHeight * 0.12f)
    ) }

    Box(
        modifier = Modifier
            .width(393.dp)
            .height(852.dp)
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF2A0790),
                        Color(0xFF2A0790),
                        Color(0xFF4668E1)
                    )
                )
            )
    ) {
        Text(
            text = "TECNOLOGÍAS QUE USO",
            modifier = Modifier
                .width(183.dp)
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
        // Genero un segundo texto para formar una sombra sólida.
        Text(
            text = "TECNOLOGÍAS QUE USO",
            modifier = Modifier
                .width(183.25.dp)
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

        Image(
            painter = painterResource(id = R.drawable.cohete1),
            contentDescription = "Just a rocket",
            modifier = Modifier
                .width(120.dp)
                .height(180.dp)
                .align(Alignment.BottomEnd)
                .padding(end = 40.dp, bottom = 60.dp),
            contentScale = ContentScale.Fit
        )

        Image(
            painter= painterResource(id = R.drawable.sol),
            contentDescription = "The sun",
            modifier = Modifier
                .width(120.dp)
                .height(250.dp)
                .align(Alignment.TopEnd)
                .padding(end = 25.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.luna),
            contentDescription = "The moon",
            modifier = Modifier
                .width(80.dp)
                .height(200.dp)
                .align(Alignment.BottomStart)
                .padding(start = 20.dp, bottom = 120.dp)
        )
    }
}

/**
 * El marco en el que van a ir las tecnologías que voy a ir añadiendo.
 */
@Composable
fun MainTechnologiesFrame() {

    Box(
        modifier = Modifier
            .width(393.dp)
            .height(852.dp)

    ) {

        Image(
            painter = painterResource(id = R.drawable.java),
            contentDescription = "Java logo",
            modifier = Modifier
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.python),
            contentDescription = "Python logo",
            modifier = Modifier
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.unity),
            contentDescription = "Unity logo",
            modifier = Modifier
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.cplusplus),
            contentDescription = "C++ logo",
            modifier = Modifier
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.angular),
            contentDescription = "Angular logo",
            modifier = Modifier
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.kotlin),
            contentDescription = "kotlin logo",
            modifier = Modifier
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.git),
            contentDescription = "Git logo",
            modifier = Modifier
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.java),
            contentDescription = "Java logo",
            modifier = Modifier
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.docker),
            contentDescription = "Docker logo",
            modifier = Modifier
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.css),
            contentDescription = "JavaScript logo",
            modifier = Modifier
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.html),
            contentDescription = "HTML5 logo",
            modifier = Modifier
                .width(200.dp)
                .height(130.dp)
                .padding(12.dp)
        )
    }
}
