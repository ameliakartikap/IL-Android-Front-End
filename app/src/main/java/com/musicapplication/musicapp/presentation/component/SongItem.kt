package com.musicapplication.musicapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.musicapplication.musicapp.R
import com.musicapplication.musicapp.model.Song
import com.musicapplication.musicapp.ui.theme.MusicAppTheme

@Composable
fun SongItem(
    song: Song,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.fillMaxWidth()

    ) {
        Image(
            painter = painterResource(id = song.photo),
            contentDescription = song.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .size(80.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = song.name, style = MaterialTheme.typography.titleMedium)
            Row {
                Text(text = song.singer, color = MaterialTheme.colorScheme.tertiary, style = MaterialTheme.typography.titleSmall)
                Text(text = " . ${song.durasi}", textAlign = TextAlign.Right,color = MaterialTheme.colorScheme.tertiary, style = MaterialTheme.typography.titleSmall)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MentorItemPreview() {
    MusicAppTheme {
        SongItem(
            song = Song(
                1,
                "Delicate",
                "Taylor Swift",
                "3:52",
                R.drawable.taylordelicate
            )

        )
    }
}