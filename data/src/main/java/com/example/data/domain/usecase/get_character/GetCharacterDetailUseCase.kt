package com.example.data.domain.usecase.get_character

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
class GetCharacterDetailUseCase @Inject constructor(private val characterRepository: CharacterRepository) {

    operator fun invoke(id : Int) : Flow<Resource<Characters>> = flow {
        try {
            emit(Resource.Loading<Characters>())
            val characters = characterRepository.getCharactersById(id).toCharacters()
            emit(Resource.Success<Characters>(characters))

        } catch (e : HttpException){
            emit(Resource.Error<Characters>(e.localizedMessage ?: "UnExpected error"))

        } catch (e : IOException){
            emit(Resource.Error<Characters>(e.localizedMessage ?: "Internet connect problem"))
        }
    }
}