package com.example.mapservice.mapservice.map.model

import com.google.gson.annotations.SerializedName


data class LocationSearchResponse(
    val meta: Meta,
    val documents: List<Document>
) {
    data class Meta(
        @SerializedName("total_count")
        val totalCount: Int,
        @SerializedName("pageable_count")
        val pageableCount: Int,
        @SerializedName("is_end")
        val isEnd: Boolean,
        @SerializedName("same_name")
        val sameName: SameName
    )

    data class SameName(
        val region: List<String>,
        val keyword: String,
        @SerializedName("selected_region")
        val selectedRegion: String

    )

    data class Document(
        @SerializedName("address_name")
        val addressName: String,
        @SerializedName("category_group_code")
        val categoryGroupCode: String,
        @SerializedName("category_group_name")
        val categoryGroupName: String,
        @SerializedName("category_name")
        val categoryName: String,
        val distance: String,
        val id: String,
        val phone: String,
        @SerializedName("place_name")
        val placeName: String,
        @SerializedName("place_url")
        val placeUrl: String,
        @SerializedName("road_address_name")
        val roadAddressName: String,
        @SerializedName("y")
        val longtitude: String,
        @SerializedName("x")
        val latitude: String
    )
}