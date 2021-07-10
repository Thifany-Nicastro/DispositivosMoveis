package com.thifany.usergithubretrofit.domain


import com.thifany.usergithubretrofit.data.model.Github
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {
    @GET("{githubInserido}")
    suspend fun buscarGithub(
        @Path("githubInserido") github: String
    ) : Response<Github>
}