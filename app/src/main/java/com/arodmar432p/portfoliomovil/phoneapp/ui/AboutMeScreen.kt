package com.arodmar432p.portfoliomovil.phoneapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
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
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.arodmar432p.portfoliomovil.R
import com.google.accompanist.systemuicontroller.rememberSystemUiController


@Composable
fun AboutMeScreen(navController: NavController) {
    // Estado para controlar si se muestra o no la barra de navegación
    var showNavigationBar by remember { mutableStateOf(false) }

    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp
    val screenHeight = configuration.screenHeightDp

    // Defino las estrellas en posiciones por la parte inferior
    // de la pantalla
    val starPositions = remember { listOf(
        Pair(0.07f, 0.85f),
        Pair(0.85f, 0.21f),
        Pair(0.53f, 0.96f),
        Pair(0.3f, 0.07f),
        Pair(0.8f, 0.95f),
        Pair(0.1f, 0.08f),
        Pair(0.15f, 0.18f),
        Pair(0.84f, 0.89f),
        Pair(0.35f, 0.23f),
        Pair(0.6f, 0.12f)
    ) }


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFF2F254C), Color(0xFF2A0790)),
                    startY = 0.0f,
                    endY = Float.POSITIVE_INFINITY
                )
            )
    ) {
        Image(
            painter = painterResource(id = R.drawable.planeta1),
            contentDescription = "A blue planet",
            contentScale = ContentScale.None,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(30.dp)
                .width(40.99996.dp)
                .height(44.23907.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.ufo),
            contentDescription = "An UFO picture",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .width(80.dp)
                .height(32.5.dp)
                .offset(x = (-20).dp, y = (110.dp))
        )

        Image(
            painter = painterResource(id = R.drawable.yellowstar),
            contentDescription = "small yellow stars",
            modifier = Modifier
                .width(10.dp)
                .height(10.dp)
                .offset(x = 30.dp, y = (90).dp)
        )

        Image(
            painter = painterResource(id = R.drawable.yellowstar),
            contentDescription = "small yellow stars",
            modifier = Modifier
                .width(10.dp)
                .height(10.dp)
                .offset(x = 220.dp, y = (790).dp)
        )

        Image(
            painter = painterResource(id = R.drawable.yellowstar),
            contentDescription = "small yellow stars",
            modifier = Modifier
                .width(10.dp)
                .height(10.dp)
                .offset(x = 320.dp, y = (740).dp)
        )

        Image(
            painter = painterResource(id = R.drawable.yellowstar),
            contentDescription = "small yellow stars",
            modifier = Modifier
                .width(10.dp)
                .height(10.dp)
                .offset(x = 360.dp, y = (540).dp)
        )
        Image(
            painter = painterResource(id = R.drawable.yellowstar),
            contentDescription = "small yellow stars",
            modifier = Modifier
                .width(10.dp)
                .height(10.dp)
                .offset(x = 345.dp, y = (640).dp)
        )

        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .width(45.dp)
                .height(37.dp)
                .size((-20).dp)
                .offset(x = 70.dp, y = (-20).dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.planeta2),
                contentDescription = "Saturn picture",
                contentScale = ContentScale.Fit
            )
        }

        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(25.dp)
                .width(64.dp)
        )

        LazyRow(
            modifier = Modifier
                .fillMaxSize()
                .offset(y = (-10).dp),
            horizontalArrangement = Arrangement.Center) {
            item { TargetsBox() }
            item { BackgroundBox() }
            item { ValuesBox() }
        }

        for ((x, y) in starPositions) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.BottomStart)
                    .offset(x = (screenWidth * x).dp, y = (screenHeight * y).dp)
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
        MenuDots(onClick = { showNavigationBar = true }, drawableId = R.drawable.abrirmenuamarillo)

        AboutStatusBar()


        // Si showNavigationBar es true, se muestra la barra de navegación
        if (showNavigationBar) {
            Box(
                modifier = Modifier
            ) {
                Dialog(onDismissRequest = { showNavigationBar = false }) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .height(420.dp)
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
}


@Composable
fun AboutStatusBar() {
    // Obtiene una referencia a SystemUiController
    val systemUiController = rememberSystemUiController()

    SideEffect {
        // Establece el color de la barra de estado y los íconos
        systemUiController.setStatusBarColor(
            color = Color(0xFF2F254C),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAboutMe() {
    val navController = rememberNavController()
    AboutMeScreen(navController)
}

@Preview(showBackground = true)
@Composable
fun TargetsBox() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = (-120).dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image( // La imagen se muestra arriba
            painter = painterResource(id = R.drawable.objetivos),
            contentDescription = "A guy on a Rocket",
            modifier = Modifier
                .size(120.dp)
                .width(119.dp)
                .height(220.dp)
                .offset(y = (135).dp)
        )

        Text(
            text = "OBJETIVOS",
            style = TextStyle(
                fontSize = 25.76.sp,
                lineHeight = 18.89.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFCB14),
                textAlign = TextAlign.Center,
                letterSpacing = 1.07.sp,
            ),
            modifier = Modifier
                .width(123.14343.dp)
                .height(39.dp)
                .offset(y = 125.dp)
        )

        Image(painter = painterResource(id = R.drawable.coheteflecha),
            contentDescription = "A rocket working as an arrow",
            modifier = Modifier
                .size(35.dp)
                .offset(x = 170.dp, y = 350.dp )

        )
        Box(
            modifier = Modifier
                .padding(horizontal = 50.dp)
                .width(285.dp)
                .height(500.dp)
                .offset(y = 90.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color(0xFF48194D), Color(0x8A221A47)),
                        startY = 0.0f,
                        endY = Float.POSITIVE_INFINITY
                    ),
                    shape = RoundedCornerShape(1.dp) // Ajustar este valor para cambiar la redondez de las esquinas
                )
                .border(
                    width = 2.dp,
                    color = Color(0xFF7C1DF5),
                    shape = RoundedCornerShape(10.dp) // la forma del borde me debe coincidir con la forma del fondo
                )
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    text = "Agus como desarrollado no solo se centra en la construcción de " +
                            "aplicaciones.",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontFamily = FontFamily(Font(R.font.interbold)),
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF),
                    ),
                    modifier = Modifier
                        .padding(top = 35.dp, bottom = 10.dp)
                        .width(248.dp)
                        .offset(y = (-20).dp)

                )
                Text(
                    text = "Uno de los principales objetivos de Agus es seguir evolucionando como " +
                            "profesional integral. Su decisión de titularse como Desarrollador de " +
                            "Aplicaciones Multiplataforma en 2022 es un testimonio de su compromiso" +
                            " con la excelencia y su deseo de abordar proyectos desde una " +
                            "perspectiva más holística. \nBusca no solo comprender profundamente el" +
                            " desarrollo de software en sí, sino también la interconexión de" +
                            " plataformas.\nBusca constantemente maneras de aplicar nuevas " +
                            "tecnologías y enfoques para resolver problemas y mejorar la eficiencia" +
                            " en el desarrollo de software. Su participación en proyectos de " +
                            "automatización de procesos con Python y en entornos .NET demuestra su " +
                            "disposición a explorar y adoptar nuevas herramientas y marcos de " +
                            "trabajo.\n",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Justify,
                    ),
                    modifier = Modifier
                        .width(245.dp)
                        .height(400.dp)
                        .offset(y = (-20).dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BackgroundBox() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = (-120).dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image( // La imagen se muestra arriba del todo
            painter = painterResource(id = R.drawable.trayectoria),
            contentDescription = "A flying guy",
            modifier = Modifier
                .size(120.dp)
                .width(119.dp)
                .height(220.dp)
                .offset(x = 10.dp, y = (135).dp)
        )

        Text( // El texto se muestra entre la caja y la imagen
            text = "TRAYECTORIA",
            style = TextStyle(
                fontSize = 25.76.sp,
                lineHeight = 18.89.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFCB14),
                textAlign = TextAlign.Center,
                letterSpacing = 1.07.sp,
            ),
            modifier = Modifier
                .width(123.14343.dp)
                .height(39.dp)
                .offset(y = (125).dp)
        )

        Image(painter = painterResource(id = R.drawable.coheteflecha),
            contentDescription = "A rocket working as an arrow",
            modifier = Modifier
                .size(35.dp)
                .offset(x = 170.dp, y = 350.dp )
        )

        Box( // La caja se muestra debajo del texto objetivo, y bien en el centro
            modifier = Modifier
                .padding(horizontal = 50.dp)
                .width(285.dp)
                .height(500.dp)
                .offset(y = 90.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color(0xFF48194D), Color(0x8A221A47)),
                        startY = 0.0f,
                        endY = Float.POSITIVE_INFINITY
                    ),
                    shape = RoundedCornerShape(1.dp) // Ajustar este valor para cambiar la redondez de las esquinas
                )
                .border(
                    width = 2.dp,
                    color = Color(0xFF7C1DF5),
                    shape = RoundedCornerShape(10.dp) // la forma del borde me debe coincidir con la forma del fondo
                )
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    text = "Agus Rodríguez es un programador gaditano con experiencia Full-Stack",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontFamily = FontFamily(Font(R.font.interbold)),
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Justify,
                    ),
                    modifier = Modifier
                        .padding(top = 30.dp, bottom = 10.dp)
                        .width(248.dp)
                        .offset(y = (-20).dp)
                )
                Text(
                    text = "En 2010 comienza su formación en Programación en Cádiz, donde destacó" +
                            " al realizar su primer proyecto como SQL Developer. Alternó su " +
                            "formación con proyectos independientes y trabajos para terceros " +
                            "hasta 2013, donde salta a la formación reglada con proyectos ofrecidos" +
                            " por la Fundación estatal para el empleo como Automatización de " +
                            "procesos con Python y trabajos con Google cloud. En 2014 participa en" +
                            " proyectos de soporte técnico e infraestructura web que lo llevan a" +
                            " desplazarse a Madrid, colaborando así con empresas como Indra e " +
                            "Inditex. En 2016 se establece en Sevilla donde participa desarrolla " +
                            "en entornos .NET durante tres años consecutivos.",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Justify,
                    ),
                    modifier = Modifier
                        .width(245.dp)
                        .height(400.dp)
                        .offset(y = (-10).dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ValuesBox() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = (-120).dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image( // La imagen se muestra arriba del todo
            painter = painterResource(id = R.drawable.valores),
            contentDescription = "A picture of a robot",
            modifier = Modifier
                .size(120.dp)
                .width(119.dp)
                .height(220.dp)
                .offset(y = (135).dp)
        )

        Text( // El texto se muestra entre la caja y la imagen
            text = "VALORES",
            style = TextStyle(
                fontSize = 25.76.sp,
                lineHeight = 18.89.sp,
                fontFamily = FontFamily(Font(R.font.bebasneue)),
                fontWeight = FontWeight(400),
                color = Color(0xFFFFCB14),
                textAlign = TextAlign.Center,
                letterSpacing = 1.07.sp,
            ),
            modifier = Modifier
                .width(123.14343.dp)
                .height(39.dp)
                .offset(y = (130).dp)
        )

        Image(painter = painterResource(id = R.drawable.coheteflechareves),
            contentDescription = "A rocket working as an arrow",
            modifier = Modifier
                .size(35.dp)
                .offset(x = (-165).dp, y = 350.dp )
        )

        Box( // La caja se muestra debajo del texto objetivo, y bien en el centro
            modifier = Modifier
                .padding(horizontal = 50.dp)
                .width(285.dp)
                .height(500.dp)
                .offset(y = 90.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color(0xFF48194D), Color(0x8A221A47)),
                        startY = 0.0f,
                        endY = Float.POSITIVE_INFINITY
                    ),
                    shape = RoundedCornerShape(1.dp) // Ajustar este valor para cambiar la redondez de las esquinas
                )
                .border(
                    width = 2.dp,
                    color = Color(0xFF7C1DF5),
                    shape = RoundedCornerShape(10.dp) // la forma del borde me debe coincidir con la forma del fondo
                )
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    text = "Agus Rodríguez es un profesional cuyos valores fundamentales han guiado su camino",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontFamily = FontFamily(Font(R.font.interbold)),
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF),
                    ),
                    modifier = Modifier
                        .padding(top = 30.dp, bottom = 10.dp)
                        .width(248.dp)
                        .offset(y = (-20).dp)
                )
                Text(
                    text = "La integridad y la dedicación son pilares esenciales que han marcado su" +
                            " enfoque en cada proyecto y colaboración a lo largo de los años. La " +
                            "transparencia y la ética son valores fundamentales. Siendo consciente" +
                            " de la responsabilidad que conlleva el desarrollo de software, se " +
                            "esfuerza por mantener la claridad en todas las etapas del proceso." +
                            " Desde el diseño inicial hasta la implementación y el mantenimiento," +
                            " busca la transparencia y la honestidad para construir soluciones " +
                            "tecnológicas robustas y confiables. Esta perseverancia se traduce en " +
                            "una mentalidad de aprendizaje continuo, buscando siempre expandir sus " +
                            "conocimientos y mantenerse al día con las últimas tendencias " +
                            "tecnológicas.",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Justify,
                    ),
                    modifier = Modifier
                        .width(245.dp)
                        .height(400.dp)
                        .offset(y = (-20).dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.arrowgoodinv),
                    contentDescription = "A yellow arrow",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .height(40.dp)
                )
            }
        }
    }
}