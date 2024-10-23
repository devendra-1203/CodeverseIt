package com.codeverseapp

import com.google.gson.annotations.SerializedName

data class SignInResponse(
    @SerializedName("name"     ) var name     : String? = null,
    @SerializedName("email"    ) var email    : String? = null,
    @SerializedName("mobile"   ) var mobile   : String? = null,
    @SerializedName("password" ) var password : String? = null,
    @SerializedName("username" ) var username : String? = null

)