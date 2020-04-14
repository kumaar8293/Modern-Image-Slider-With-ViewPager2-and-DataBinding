package com.mukesh.modernimageslider

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var baseURL = "https://www.infinityandroid.com/images/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setDataToAdapter()
    }

    fun setDataToAdapter() {

        val locationList = ArrayList<TravelLocation>()

        val travelLocationEiffelTower = TravelLocation(
            "France",
            "Eiffel Tower",
            baseURL + "france_eiffel_tower.jpg",
            4.8f
        )
        locationList.add(travelLocationEiffelTower)
        val travelLocationMountainView = TravelLocation(
            "Indonesia",
            "Mountain View",
            baseURL + "indonesia_mountain_view.jpg",
            4.5f
        )
        locationList.add(travelLocationMountainView)
        val travelLocationTajMahal = TravelLocation(
            "India",
            "Taj Mahal",
            baseURL + "india_taj_mahal.jpg",
            4.3f
        )
        locationList.add(travelLocationTajMahal)
        val travelLocationLakeView = TravelLocation(
            "Canada",
            "Lake View",
            baseURL + "canada_lake_view.jpg",
            4.25f
        )
        locationList.add(travelLocationLakeView)

        locationViewPager.adapter = TravelLocationAdapter(locationList)

        addCompositePageTransformer()
    }

    fun addCompositePageTransformer() {
        locationViewPager.clipToPadding = false
        locationViewPager.clipChildren = false
        locationViewPager.offscreenPageLimit = 3
        locationViewPager.getChildAt(0).overScrollMode =
            RecyclerView.OVER_SCROLL_NEVER


        val compositePageTransformer = CompositePageTransformer()
        compositePageTransformer.addTransformer(MarginPageTransformer(40))
        compositePageTransformer.addTransformer(
            ViewPager2.PageTransformer { page: View, position: Float ->
                val r = 1 - Math.abs(position)
                page.scaleY = 0.95f + r * 0.05f
            })
        locationViewPager.setPageTransformer(compositePageTransformer)
    }
}
