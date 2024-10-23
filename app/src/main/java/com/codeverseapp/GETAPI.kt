package com.codeverseapp

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface GETAPI {

//    @POST("/api/v1/userRouter/signUp")
//    suspend fun signup(@Body request: SignupRequest): Response<SignupResponse>

    @POST("/api/v1/userRouter/login")
    suspend fun login(@Field("email") email: String,
                      @Field("passowrd") password: String) : SignInResponse

    @GET("/api/v1/userRouter/userList/")
    suspend fun getUsers(@Query("userId") userid : String ,@Header("Authorization") authHeader : String): GetUserResponse
}