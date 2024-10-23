package com.codeverseapp

import com.google.gson.annotations.SerializedName

data class GetUserResponse(
    @SerializedName("status"     ) var status     : Boolean?        = null,
    @SerializedName("statusCode" ) var statusCode : Int?            = null,
    @SerializedName("message"    ) var message    : String?         = null,
    @SerializedName("data"       ) var data       : List<UserListData>

)