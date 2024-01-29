package com.arodmar432p.portfoliomovil.phoneapp.ui

import android.media.tv.TvContract.PreviewPrograms
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview
@Composable
fun ScrollScreen() {

    // Las tarjetas que representan los certificados junto a un scroll
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