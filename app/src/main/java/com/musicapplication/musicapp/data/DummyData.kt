package com.musicapplication.musicapp.data

import com.musicapplication.musicapp.R
import com.musicapplication.musicapp.model.Artis
import com.musicapplication.musicapp.model.Song
import com.musicapplication.musicapp.model.Genre

object DummyData {
    val AllArtists = listOf(
        Artis(
            id = 1,
            name = "Taylor Swift",
            listener = 114027209,
            genre = "Pop",
            photo = R.drawable.taylordelicate
        ),
        Artis(
            id = 2,
            name = "Ariana Grande",
            listener = 86759073,
            genre = "Pop",
            photo = R.drawable.ariana
        ),
        Artis(
            id = 3,
            name = "Charlie Puth",
            listener = 36026140,
            genre = "Pop",
            photo = R.drawable.charlie
        ),
        Artis(
            id = 4,
            name = "James Arthur",
            listener = 339914938,
            genre = "Pop",
            photo = R.drawable.james
        ),
        Artis(
            id = 5,
            name = "NIKI",
            listener = 11393643,
            genre = "Pop",
            photo = R.drawable.niki
        ),
        Artis(
            id = 6,
            name = "Olivia Rodrigo",
            listener = 56316542,
            genre = "Pop",
            photo = R.drawable.olivia
        ),
        Artis(
            id = 7,
            name = "ROSÉ",
            listener = 3202525,
            genre = "K-Pop",
            photo = R.drawable.rose
        ),
        Artis(
            id = 8,
            name = "IU",
            listener = 6844067,
            genre = "K-Pop",
            photo = R.drawable.iu
        ),
        Artis(
            id = 9,
            name = "TAEYON",
            listener = 3912745,
            genre = "K-Pop",
            photo = R.drawable.taeyon
        ),
        Artis(
            id = 10,
            name = "HEIZE",
            listener = 2840288,
            genre = "K-Pop",
            photo = R.drawable.heizee
        )
    )


    val AllSongs = listOf(
        Song(
            id = 1,
            name = "Delicate",
            singer = "Taylor Swift",
            durasi = "3:52",
            photo = R.drawable.taylordelicate
        ),
        Song(
            id = 2,
            name = "Into You",
            singer = "Ariana Grande",
            durasi = "4:04",
            photo = R.drawable.arianaintoyou
        ),
        Song(
            id = 3,
            name = "Dangerously",
            singer = "Charlie Puth",
            durasi = "3:19",
            photo = R.drawable.charliedangerously
        ),
        Song(
            id = 4,
            name = "Say You Won't Let Go",
            singer = "Taylor Swift",
            durasi = "3:31",
            photo = R.drawable.jamessayyouwontletgo
        ),
        Song(
            id = 5,
            name = "Good 4 You",
            singer = "Olivia Rodrigo",
            durasi = "2:58",
            photo = R.drawable.oliviagoodforyou
        ),
        Song(
            id = 6,
            name = "BackBurner",
            singer = "NIKI",
            durasi = "3:56",
            photo = R.drawable.nikibackburner
        ),
        Song(
            id = 7,
            name = "Gone",
            singer = "ROSÉ",
            durasi = "3:27",
            photo = R.drawable.rosegone
        ),
        Song(
            id = 8,
            name = "On Rainy Days",
            singer = "HEIZE",
            durasi = "3:50",
            photo = R.drawable.heizeonrainydays
        ),
        Song(
            id = 9,
            name = "Lilac",
            singer = "IU",
            durasi = "3:34",
            photo = R.drawable.iulilac
        ),
        Song(
            id = 10,
            name = "Four Season",
            singer = "Taeyon",
            durasi = "3:08",
            photo = R.drawable.taeyonfourseason
        )
    )

    val AllGenres = listOf(
        Genre(
            id = 1,
            name = "Pop",
            photo = R.drawable.pop
        ),
        Genre(
            id = 2,
            name = "Jazz",
            photo = R.drawable.jazz
        ),
        Genre(
            id = 3,
            name = "RnB",
            photo = R.drawable.rnb
        ),
        Genre(
            id = 4,
            name = "Podcast",
            photo = R.drawable.podcast
        ),
        Genre(
            id = 5,
            name = "Made for You",
            photo = R.drawable.madeforyou
        ),
        Genre(
            id = 6,
            name = "Hiphop",
            photo = R.drawable.hiphop
        ),
        Genre(
            id = 7,
            name = "Rock",
            photo = R.drawable.rock
        ),
        Genre(
            id = 8,
            name = "Mood",
            photo = R.drawable.mood
        ),
        Genre(
            id = 9,
            name = "New Release",
            photo = R.drawable.newrelease
        ),
        Genre(
            id = 10,
            name = "Indie",
            photo = R.drawable.indie
        ),
        Genre(
            id = 11,
            name = "Charts",
            photo = R.drawable.charts
        ),
        Genre(
            id = 12,
            name = "Folk",
            photo = R.drawable.folk
        ),
        Genre(
            id = 13,
            name = "K-Pop",
            photo = R.drawable.kpop
        ),
        Genre(
            id = 14,
            name = "At Home",
            photo = R.drawable.athome
        ),
        Genre(
            id = 15,
            name = "Blues",
            photo = R.drawable.blues
        ),
        Genre(
            id = 16,
            name = "Dance and Electric",
            photo = R.drawable.dance
        )
    )

}