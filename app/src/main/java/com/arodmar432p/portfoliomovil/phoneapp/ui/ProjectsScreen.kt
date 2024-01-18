package com.arodmar432p.portfoliomovil.phoneapp.ui

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
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
fun Projects(){
    ProjectsBackground()
}

@Composable
fun ProjectsBackground(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF389FFF),
                        Color(0xFF389FFF),
                        Color(0xFF52F1Fc)
                    ),
                    startY = 0.0f,
                    endY = Float.POSITIVE_INFINITY
                )
            )
    ) {
        Text(
            text = "MIS PROYECTOS",
            modifier = Modifier
                .width(130.dp)
                .height(92.dp)
                .align(Alignment.TopCenter)
                .padding(top = 60.dp),
            style = TextStyle(
                fontSize = 26.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFCB14),
                textAlign = TextAlign.Justify

            )
        )
        Text(
            text = "MIS PROYECTOS",
            modifier = Modifier
                .width(130.dp)
                .height(92.dp)
                .align(Alignment.TopCenter)
                .padding(top = 60.dp),
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
            text = "MIS PROYECTOS",
            modifier = Modifier
                .width(131.25.dp)
                .height(92.dp)
                .align(Alignment.TopCenter)
                .padding(top = 60.dp),
            style = TextStyle(
                fontSize = 26.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFCB14),
                textAlign = TextAlign.Justify

            )
        )

        Image(
            painter = painterResource(id = R.drawable.nubegrande1),
            contentDescription = "A picture of a cloud",
            modifier = Modifier
                .height(310.dp)
                .width(170.dp)
                .align(Alignment.BottomStart)
                .offset(x = 15.dp, y = (-10).dp)

        )

        Image(
            painter = painterResource(id = R.drawable.nubepeque1),
            contentDescription = "A picture of a small cloud",
            modifier = Modifier
                .height(110.dp)
                .width(70.dp)
                .align(Alignment.BottomEnd)
                .offset(x = (-30).dp, y = (-65).dp)

        )
    }
}
