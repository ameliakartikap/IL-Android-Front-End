package com.musicapplication.musicapp.presentation


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.musicapplication.musicapp.R
import com.musicapplication.musicapp.data.DummyData
import com.musicapplication.musicapp.model.Artis
import com.musicapplication.musicapp.model.Song
import com.musicapplication.musicapp.navigation.Screen
import com.musicapplication.musicapp.presentation.component.SongItem
import com.musicapplication.musicapp.presentation.component.ArtisItem
import com.musicapplication.musicapp.presentation.component.shareItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    artists: List<Artis> = DummyData.AllArtists,
    songs: List<Song> = DummyData.AllSongs
) {
    val context = LocalContext.current
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Home Screen Music App") },
                actions = {
                    IconButton(onClick = { shareItem(context) }) {
                        Icon(
                            imageVector = Icons.Default.Share,
                            contentDescription = stringResource(
                                id = R.string.menu_share
                            )
                        )
                    }

                }
            )
        }
    ) {contentPadding ->
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = modifier
                .padding(contentPadding)
        ) {
            item {
                Text(
                    text = "Artis yang Kamu Ikuti",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Left,
                    modifier = Modifier
                        .padding(16.dp)
                )
                LazyRow(
                    contentPadding = PaddingValues(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = modifier
                ) {
                    items(artists, key = { it.id }) {
                        ArtisItem(artis = it) { artisId ->
                            navController.navigate(Screen.DetailArtis.route + "/$artisId")
                        }
                    }
                }
                Text(
                    text = "Rekomendasi Musikmu",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Left,
                    modifier = Modifier
                        .padding(16.dp)
                )
            }
            items(songs, key = { it.id }) {
                SongItem(song = it, modifier = Modifier.padding(horizontal = 16.dp))
            }
        }
    }
}