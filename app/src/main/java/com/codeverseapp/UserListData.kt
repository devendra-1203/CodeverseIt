package com.codeverseapp

import com.google.gson.annotations.SerializedName

data class UserListData(
    @SerializedName("_id"         ) var Id          : String?           = null,
    @SerializedName("name"        ) var name        : String?           = null,
    @SerializedName("username"    ) var username    : String?           = null,
    @SerializedName("email"       ) var email       : String?           = null,
    @SerializedName("mobile"      ) var mobile      : Int?              = null,
    @SerializedName("isActive"    ) var isActive    : Boolean?          = null,
    @SerializedName("isPending"   ) var isPending   : String?           = null,
    @SerializedName("isBlock"     ) var isBlock     : String?           = null,
    @SerializedName("isDeleted"   ) var isDeleted   : Boolean?          = null,
    @SerializedName("permissions" ) var permissions : ArrayList<String> = arrayListOf(),
    @SerializedName("status"      ) var status      : String?           = null,
    @SerializedName("lastActive"  ) var lastActive  : String?           = null,
    @SerializedName("createdAt"   ) var createdAt   : String?           = null,
    @SerializedName("updatedAt"   ) var updatedAt   : String?           = null


)
