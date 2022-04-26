package com.ci.spx.dataclasses

import com.google.gson.annotations.SerializedName

data class LaunchesResponse(val items: List<QuestListItem>) {

}

data class QuestListItem(
    @SerializedName("links")
    val links: Links,
    @SerializedName("name")
    val name: String?,
    @SerializedName("cores")
    val cores: Int?,
    @SerializedName("date_utc")
    val date_utc: String?,
    @SerializedName("success")
    val success: String?
)

data class Links(
    @SerializedName("patch")
    val patch: List<Patch>){

}

data class Patch(
    @SerializedName("small")
    val small: String?,
    @SerializedName("large")
    val large: String?
)