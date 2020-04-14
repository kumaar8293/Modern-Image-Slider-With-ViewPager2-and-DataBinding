package com.mukesh.modernimageslider

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso


@BindingAdapter("image")
fun loadImage(view: ImageView, url: String) {
    Picasso.get()
        .load(url)
        .into(view)
}