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
    @Headers("Authorization: token 47d74b38f294e08b653f8ced3b8537d8e407fd52")
    fun getSearchUsers(
        @Query ("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 271838d1cde9389ea39b4c0edaf0fa883293b83c")
    fun getUserDetail(
            @Path ("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 271838d1cde9389ea39b4c0edaf0fa883293b83c")
    fun getFollowers(
            @Path ("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 271838d1cde9389ea39b4c0edaf0fa883293b83c")
    fun getFollowing(
            @Path ("username") username: String
    ): Call<ArrayList<User>>

}