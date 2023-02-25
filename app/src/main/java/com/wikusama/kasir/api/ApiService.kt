package com.wikusama.kasir.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("/user/{id_user}")
    fun getUser(
        @Path("id") id: String
    ): Call<CashierResponse>
}