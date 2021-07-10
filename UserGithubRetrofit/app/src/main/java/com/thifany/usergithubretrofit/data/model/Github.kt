package com.thifany.usergithubretrofit.data.model

import com.google.gson.annotations.SerializedName

class Github(@SerializedName("name") val name: String,
          @SerializedName("email")val email: String,
          @SerializedName("bio")val bio: String) {

    override fun toString() : String {
        return "Nome: $name\nEmail: $email\nBio: $bio"
    }

}