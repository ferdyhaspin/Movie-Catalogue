package app.ferdyhaspin.moviecatalogue.data.model

import com.google.gson.annotations.SerializedName

/**
 * Created by ferdyhaspin on 25/10/20.
 * Copyright (c) 2020 Movie Catalogue All rights reserved.
 */

data class BaseResponse<T>(
    @field:SerializedName("page")
    val page: Int? = null,

    @field:SerializedName("total_pages")
    val totalPages: Int? = null,

    @field:SerializedName("results")
    val results: List<T>? = null,

    @field:SerializedName("total_results")
    val totalResults: Int? = null
)