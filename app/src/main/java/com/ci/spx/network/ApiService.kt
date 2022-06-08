package com.ci.spx.network


import com.ci.spx.dataclasses.LaunchesResponse
import com.ci.spx.dataclasses.QueryBody
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("launches")
    suspend fun getLaunches(@Body query: String): LaunchesResponse
//    suspend fun getLaunches(@Body query: QueryBody): LaunchesResponse
}