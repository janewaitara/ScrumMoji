package com.manuflowers.scrummoji

import com.squareup.moshi.Json

class GetSprintsResponse(
    @field:Json(name = "maxResults") val maxResults: Int,
    @field:Json(name = "startAt") val startAt: String,
    @field:Json(name = "isLast") val isLast: Boolean,
    @field:Json(name = "values") val values: List<SprintModelResponse>
)

data class SprintModelResponse(
    @field:Json(name = "id") val id: Int,
    @field:Json(name = "self") val self: String,
    @field:Json(name = "state") val state: String,
    @field:Json(name = "name") val name: String,
    @field:Json(name = "originBoardId") val originBoardId: Int
)