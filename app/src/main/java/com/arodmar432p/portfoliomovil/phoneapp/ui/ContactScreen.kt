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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.arodmar432p.portfoliomovil.R


@Preview(showBackground = true)
@Composable
fun ContactScreen() {
    ContactScreenBackground()
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
        // TODO: Necesita estar más arriba
        Image(
            painter = painterResource(id = R.drawable.nubecontacto),
            contentDescription = "A picture of a cloud with my logo",
            modifier = Modifier
                .height(310.dp)
                .width(200.dp)
                .align(Alignment.TopCenter)
                .padding(top = 70.dp)

        )

        Image(
            painter = painterResource(id = R.drawable.nubepeque2),
            contentDescription = "A picture of small cloud, top left",
            modifier = Modifier
                .size(75.dp)
                .height(210.dp)
                .width(90.dp)
                .align(Alignment.TopStart)
                .padding(top =20.dp)
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

        //TODO: Se necesita colocar correctamente los pájaritos
        Image(
            painter = painterResource(id = R.drawable.pajarorojo),
            contentDescription = "A picture of small red bird.",
            modifier = Modifier
                .size(70.dp)
                .height(200.dp)
                .width(90.dp)
                .align(Alignment.CenterEnd)
                .padding(top = 20.dp)
                .offset(x = (-10).dp, y = (-10).dp)

        )
        Image(
            painter = painterResource(id = R.drawable.pajarosepia),
            contentDescription = "A picture of small cuttleflish coloured bird.",
            modifier = Modifier
                .size(70.dp)
                .height(200.dp)
                .width(90.dp)
                .align(Alignment.CenterStart)
                .padding(top = 20.dp)
                .offset(x = (-10).dp, y = (-10).dp)

        )
        Image(
            painter = painterResource(id = R.drawable.pajarocadista),
            contentDescription = "A picture of small yellow and blue bird",
            modifier = Modifier
                .size(70.dp)
                .height(200.dp)
                .width(90.dp)
                .align(Alignment.Center)
                .padding(top = 20.dp)
                .offset(x = (-10).dp, y = (-10).dp)

        )

        Text(
            text = "Envíame un mensaje",
            modifier = Modifier
                .width(300.dp)
                .height(350.dp)
                .align(Alignment.Center)
                .offset(x = 50.dp, y = 10.dp)
                .padding(top = 60.dp),
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