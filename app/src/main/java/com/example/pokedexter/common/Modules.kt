package com.example.pokedexter.common

import com.example.pokedexter.common.utils.BASE_URL
import org.koin.dsl.module
import retrofit2.Retrofit

val networkModule = module {

  fun provideRetrofit(): Retrofit {
    return Retrofit.Builder()
      .baseUrl(BASE_URL)
      .build()
  }

}