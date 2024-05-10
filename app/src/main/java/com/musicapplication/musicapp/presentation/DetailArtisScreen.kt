package com.musicapplication.musicapp.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.musicapplication.musicapp.R
import com.musicapplication.musicapp.data.DummyData
import com.musicapplication.musicapp.model.Artis
import com.musicapplication.musicapp.presentation.component.shareItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailArtisScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    artisId: Int?
) {
    val context = LocalContext.current
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(imageVector = Icons.Default.ArrowBackIosNew, contentDescription = "Back Button", modifier.clickable { navController.popBackStack() } )
                        Text(text = "Detail Artis Music App")
                    }},
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
        val newArtisList = DummyData.AllArtists.filter { artis ->
            artis.id == artisId
        }
        Column(
            modifier = modifier
                .padding(contentPadding)
        ) {
            DetailArtisContent(newArtisList = newArtisList)
        }
    }
}

@Composable
private fun DetailArtisContent(
    newArtisList: List<Artis>,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier.padding(16.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(data = newArtisList[0].photo)
                .build(),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(height = 250.dp, width = 170.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentDescription = "Artis Profile"
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = newArtisList[0].name,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "(${newArtisList[0].genre})",
                style = MaterialTheme.typography.titleSmall,
            )
            Text(
                text = "Monthly Listener : ${newArtisList[0].listener}",
                style = MaterialTheme.typography.titleSmall,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailArtisContentPreview() {
    DetailArtisContent(newArtisList = DummyData.AllArtists)
}