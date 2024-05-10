package com.musicapplication.musicapp.presentation

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.musicapplication.musicapp.R
import com.musicapplication.musicapp.data.DummyData
import com.musicapplication.musicapp.model.Genre
import com.musicapplication.musicapp.presentation.component.GenreItem
import com.musicapplication.musicapp.presentation.component.shareItem
import com.musicapplication.musicapp.ui.theme.MusicAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GenreScreen(
    modifier: Modifier = Modifier,
    genres: List<Genre> = DummyData.AllGenres
) {
    val context = LocalContext.current
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Genre Music App") },
                actions = {
                    IconButton(onClick = { shareItem(context) }) {
                        Icon(
                            imageVector = Icons.Default.Share, contentDescription = stringResource(
                                id = R.string.menu_share
                            )
                        )
                    }
                }
            )
        }
    ) { contentPadding ->
        Column(
            modifier = modifier
                .padding(contentPadding)
        ) {
            Text(
                text = "Temukan Playslist Favoritmu Sekarang",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .padding(16.dp)
            )
            LazyVerticalGrid(
                contentPadding = contentPadding,
                verticalArrangement = Arrangement.spacedBy(4.dp),
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                columns = GridCells.Fixed(2)
            ) {
                items(genres, key = { it.id }) {
                    GenreItem(genre = it)
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun GenreScreenPreview() {
    MusicAppTheme {
        GenreScreen(genres = DummyData.AllGenres)
    }
}