package com.ci.spx.dataclasses

import com.ci.spx.dagger.AppModule
import com.google.gson.annotations.SerializedName

data class LaunchesResponse(
    val docs: List<Docs>
    )

data class Docs(
    @SerializedName("links")
    val links: List<Links>,
    @SerializedName("success")
    val success: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("date_utc")
    val date_utc: String?,
    @SerializedName("cores")
    val cores: List<Cores>
    )

data class Links(
    @SerializedName("patch")
    val patch: List<Patch>
    )

data class Cores(
    @SerializedName("flight")
    val flight: Int?
)

data class Patch(
    @SerializedName("small")
    val small: String?
    )

/*
"docs": {
    "links": {
        "patch": {
            "small": null
        }
    },
    "success": null,
    "name": "USSF-44",
    "date_utc": "2022-07-01T00:00:00.000Z",
    "cores": {
        "flight": null
    }
}*/
