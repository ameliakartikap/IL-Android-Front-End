package com.musicapplication.musicapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.musicapplication.musicapp.R
import com.musicapplication.musicapp.presentation.component.shareItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailProfileContent(
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "My Profile Music App") },
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
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = modifier
                .padding(16.dp)
                .padding(contentPadding)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.amel),
                    contentDescription = "My Profile",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .clip(CircleShape)
                        .size(200.dp)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    text = "Nama: ",
                    style = MaterialTheme.typography.titleSmall,
                    textAlign = TextAlign.Left
                )
                Text(
                    text = "Amelia Kartika Putri",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Left,
                    modifier = Modifier
                        .border(3.dp, Color.Gray, RoundedCornerShape(10))
                        .fillMaxWidth()
                        .padding(5.dp)
                )
                Text(
                    text = "Email: ",
                    style = MaterialTheme.typography.titleSmall,
                    textAlign = TextAlign.Left
                )
                Text(
                    text = "ameliakartikaputri11@gmail.com",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Left,
                    modifier = Modifier
                        .border(3.dp, Color.Gray, RoundedCornerShape(10))
                        .fillMaxWidth()
                        .padding(5.dp)
                )
                Text(
                    text = "Universitas: ",
                    style = MaterialTheme.typography.titleSmall,
                    textAlign = TextAlign.Left
                )
                Text(
                    text = "Universitas Pembangunan Nasional 'Veteran' Yogyakarta",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Left,
                    modifier = Modifier
                        .border(3.dp, Color.Gray, RoundedCornerShape(10))
                        .fillMaxWidth()
                        .padding(5.dp)
                )
                Text(
                    text = "Program Studi: ",
                    style = MaterialTheme.typography.titleSmall,
                    textAlign = TextAlign.Left
                )
                Text(
                    text = "Informatika",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Left,
                    modifier = Modifier
                        .border(3.dp, Color.Gray, RoundedCornerShape(10))
                        .fillMaxWidth()
                        .padding(5.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailProfileContentPreview() {
    DetailProfileContent()
}

