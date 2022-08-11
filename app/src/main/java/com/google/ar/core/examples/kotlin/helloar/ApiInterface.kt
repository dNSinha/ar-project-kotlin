package com.google.ar.core.examples.kotlin.helloar

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

//https://api.polygon.io/v1/open-close/IBM/2021-08-10?adjusted=true&apiKey=K_uvxiIJ3gA2k0pXMCF3PJ95496oMEN2
//const val BASE_URL = "https://api.polygon.io/v1/open-close/"
//const val API_KEY = "K_uvxiIJ3gA2k0pXMCF3PJ95496oMEN2"

interface ApiInterface {
    @GET("{company}/2021-08-10?adjusted=true&apiKey=K_uvxiIJ3gA2k0pXMCF3PJ95496oMEN2")
    fun getStocks(@Path("company") company: String): Call<StocksData>
}