package com.example.kotlin_application_project.model

import com.google.gson.annotations.SerializedName

data class ItemModel (
    @SerializedName("TITLE")
    var TITLE: String,
    @SerializedName("MAIN_IMG_NORMAL")
    var MAIN_IMG_NORMAL: String
)