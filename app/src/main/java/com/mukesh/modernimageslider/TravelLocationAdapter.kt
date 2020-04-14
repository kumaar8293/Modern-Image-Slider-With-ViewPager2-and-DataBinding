package com.mukesh.modernimageslider

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.mukesh.modernimageslider.databinding.ItemContainerBinding

class TravelLocationAdapter(private val locations: List<TravelLocation>) :
    RecyclerView.Adapter<TravelLocationAdapter.TravelLocationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        TravelLocationViewHolder(
            DataBindingUtil.inflate<ItemContainerBinding>
                (
                LayoutInflater.from(parent.context),
                R.layout.item_container,
                parent,
                false
            )
        )

    override fun onBindViewHolder(
        holder: TravelLocationViewHolder,
        position: Int
    ) {
        holder.itemContainerBinding.locationModel = locations[position]
    }

    override fun getItemCount(): Int {
        return locations.size
    }

    inner class TravelLocationViewHolder(
        val itemContainerBinding: ItemContainerBinding
    ) :
        RecyclerView.ViewHolder(itemContainerBinding.root)


}