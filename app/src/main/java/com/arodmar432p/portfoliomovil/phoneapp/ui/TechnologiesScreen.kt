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

@Preview(showBackground = true)
@Composable
fun Technologies() {
    Background()
}

@SuppressLint("InvalidColorHexValue")
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
            .background(Brush.verticalGradient(colors = listOf(Color(0xFF2A0790), Color(0xFF2A0790), Color(0xFF4668E1))))
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

    }
}