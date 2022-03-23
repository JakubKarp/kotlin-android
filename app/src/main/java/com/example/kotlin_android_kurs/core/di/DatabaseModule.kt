package com.example.kotlin_android_kurs.core.di

import androidx.room.Room
import org.koin.android.ext.koin.androidContext
import com.example.kotlin_android_kurs.features.data.RickAndMortyDB
import org.koin.dsl.module


val databaseModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            RickAndMortyDB::class.java,
            "rickAndMorty-database"
        ).build()
    }
}
