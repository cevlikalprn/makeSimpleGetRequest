package com.cevlikalprn.makesimplegetrequest.api

import com.cevlikalprn.makesimplegetrequest.modal.Dog
import retrofit2.http.GET

interface DogService {

    @GET("/api/breeds/image/random")
    suspend fun getDog(): Dog
}