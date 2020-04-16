import com.mukesh.modernimageslider.MainActivity
import com.mukesh.modernimageslider.TravelLocation

class LocationRepository {
    companion object{
        fun prepareData(): List<TravelLocation> {
            val locationList = ArrayList<TravelLocation>()

            val travelLocationEiffelTower = TravelLocation(
                "France",
                "Eiffel Tower",
                MainActivity.baseURL + "france_eiffel_tower.jpg",
                4.8f
            )
            val travelLocationMountainView = TravelLocation(
                "Indonesia",
                "Mountain View",
                MainActivity.baseURL + "indonesia_mountain_view.jpg",
                4.5f
            )
            val travelLocationTajMahal = TravelLocation(
                "India",
                "Taj Mahal",
                MainActivity.baseURL + "india_taj_mahal.jpg",
                4.3f
            )
            val travelLocationLakeView = TravelLocation(
                "Canada",
                "Lake View",
                MainActivity.baseURL + "canada_lake_view.jpg",
                4.25f
            )
            locationList.add(travelLocationEiffelTower)
            locationList.add(travelLocationMountainView)
            locationList.add(travelLocationTajMahal)
            locationList.add(travelLocationLakeView)
            locationList.add(travelLocationEiffelTower)
            locationList.add(travelLocationMountainView)
            locationList.add(travelLocationTajMahal)
            locationList.add(travelLocationLakeView)
            return locationList
        }

    }
}