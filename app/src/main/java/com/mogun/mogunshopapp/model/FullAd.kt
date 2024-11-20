package com.mogun.mogunshopapp.model

data class FullAd (
    val title: String,
    val imageUrl: String,
    val button: String? = null,
): ListItem {
    override val viewType: ViewType
        get() = ViewType.FULL_AD
}