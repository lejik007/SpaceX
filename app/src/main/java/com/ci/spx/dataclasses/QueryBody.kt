package com.ci.spx.dataclasses

import com.google.gson.annotations.SerializedName

data class QueryBody(
    @SerializedName("query")
    val query: List<Date_Utc>,
    @SerializedName("options")
    val options: List<Options>
)

data class Date_Utc(
    @SerializedName("date_utc")
    val date_utc: List<Details>
)

data class Details(
    @SerializedName("\$gt")
    val greaterThan: String?
)

data class Options(
    @SerializedName("sort")
    val sort: List<SortOptions>,
    @SerializedName("page")
    val page: Int?,
    @SerializedName("limit")
    val limit: Int?
)

data class SortOptions(
    val date_utc: Int?
)

/*
{
    "query": {
        "date_utc": {
            "$gt": "2021-01-01T00:00:00.000Z"
        }
    },
    "options": {
        "sort": {
            "date_utc": -1
        },
        "page":1,
        "limit": 10
    }
}*/
