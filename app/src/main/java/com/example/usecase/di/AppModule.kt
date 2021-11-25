package com.example.usecase.di

import com.example.usecase.data.remote.CharactersApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton
import com.example.usecase.common.Constants.BASE_URL
import com.example.usecase.data.repository.CharacterRepositoryImpl
import com.example.usecase.domain.CharacterRepository
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun getRetroInstance() : CharactersApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CharactersApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCharacterRepository(api: CharactersApi) : CharacterRepository{
        return CharacterRepositoryImpl(api)
    }
}