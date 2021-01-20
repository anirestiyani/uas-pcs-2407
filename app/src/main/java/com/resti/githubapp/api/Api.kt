package com.resti.githubapp.api

import com.resti.githubapp.data.model.DetailUserResponse
import com.resti.githubapp.data.model.User
import com.resti.githubapp.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
//    @Headers("Authorization: token 4fd807b448e3ff5e54d2ded3972e2719ec2742a1")
    fun getSearchUsers(
        @Query ("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
//    @Headers("Authorization: token 4fd807b448e3ff5e54d2ded3972e2719ec2742a1")
    fun getUserDetail(
            @Path ("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
//    @Headers("Authorization: token 4fd807b448e3ff5e54d2ded3972e2719ec2742a1")
    fun getFollowers(
            @Path ("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
//    @Headers("Authorization: token 4fd807b448e3ff5e54d2ded3972e2719ec2742a1")
    fun getFollowing(
            @Path ("username") username: String
    ): Call<ArrayList<User>>

}