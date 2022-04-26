package com.ci.spx.network


import com.ci.spx.dataclasses.LaunchesResponse
import retrofit2.Response
import retrofit2.http.POST

interface APIService {
    @POST("./v4/launches")
    fun getLaunches(): Response<LaunchesResponse>
}