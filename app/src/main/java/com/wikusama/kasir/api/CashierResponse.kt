package com.wikusama.kasir.api

import com.google.gson.annotations.SerializedName

data class CashierResponse(
    @field:SerializedName("user")
    val user: String
)
