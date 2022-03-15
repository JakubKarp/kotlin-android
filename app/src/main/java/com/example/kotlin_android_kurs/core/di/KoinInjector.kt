package com.example.kotlin_android_kurs.core.di

import org.koin.core.module.Module

val koinInjector: List<Module> = listOf(
    networkModule,
    databaseModule
)