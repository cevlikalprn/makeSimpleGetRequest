package com.cevlikalprn.makesimplegetrequest.modal

import com.google.gson.annotations.SerializedName

data class Dog(
  @SerializedName("message") val message: String?,
  @SerializedName("status") val status: String?
)
