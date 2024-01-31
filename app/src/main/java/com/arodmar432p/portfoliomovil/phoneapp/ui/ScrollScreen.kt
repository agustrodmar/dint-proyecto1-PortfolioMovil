package com.arodmar432p.portfoliomovil.phoneapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


/**
 * A composable that could allow the user to scroll between the
 * differents screens in the project.
 */
@Preview
@Composable
fun ScrollScreen() {

    // A column that includes all different Screens.
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = 200.dp),
        verticalArrangement = Arrangement.Center
    ) {
        item { PreviewAboutMe() }
        item { PreviewAboutMe() }
        item { PreviewTechnologies() }
        item { PreviewCertificates() }
        item { PreviewCProjects() }
        item { PreviewContact() }
    }
}