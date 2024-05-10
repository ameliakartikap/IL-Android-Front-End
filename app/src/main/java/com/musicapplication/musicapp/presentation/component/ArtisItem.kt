package com.musicapplication.musicapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.musicapplication.musicapp.R
import com.musicapplication.musicapp.model.Artis
import com.musicapplication.musicapp.ui.theme.MusicAppTheme

@Composable
fun ArtisItem(
    artis: Artis,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(artis.id)
        }
    ) {
        Image(
            painter = painterResource(id = artis.photo),
            contentDescription = artis.name, modifier = Modifier
                .clip(CircleShape)
                .size(120.dp)
        )
        Text(
            text = artis.name,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(140.dp),
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ArtisItemHorizontalPreview() {
    MusicAppTheme {
        ArtisItem(
            artis = Artis(
                1,
                "Taylor Swift",
                114027209,
                "Pop",
                R.drawable.taylor
            ),
            onItemClicked = {
                artisId ->
                println("Mentor Id : $artisId")
            }
        )
    }
}