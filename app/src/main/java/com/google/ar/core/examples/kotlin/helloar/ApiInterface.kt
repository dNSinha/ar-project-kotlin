package com.google.ar.core.examples.kotlin.helloar

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("{company}/2021-08-10?adjusted=true&apiKey=K_uvxiIJ3gA2k0pXMCF3PJ95496oMEN2")
    fun getData(@Path("company") company: String): Call<StocksData>
}