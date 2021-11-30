package com.example.data.domain.usecase.get_characters

import com.example.common.Resource
import com.example.data.remote.dto.toCharacters
import com.example.data.domain.model.Characters
import com.example.data.domain.CharacterRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

/**
 * Created by Ahmet Bozyurt on 22.11.2021
 */
class GetCharactersUseCase @Inject constructor(private val characterRepository: CharacterRepository) {

    operator fun invoke() : Flow<Resource<List<Characters>>> = flow {
        try {
            emit(Resource.Loading<List<Characters>>())
            val characters = characterRepository.getCharacters().map { it.toCharacters() }
            emit(Resource.Success<List<Characters>>(characters))

        } catch (e : HttpException){
            emit(Resource.Error<List<Characters>>(e.localizedMessage ?: "UnExpected error"))

        } catch (e : IOException){
            emit(Resource.Error<List<Characters>>(e.localizedMessage ?: "Internet connect problem"))
        }
    }
}