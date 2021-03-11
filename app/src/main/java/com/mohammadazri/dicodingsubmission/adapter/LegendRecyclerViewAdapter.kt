package com.mohammadazri.dicodingsubmission.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mohammadazri.dicodingsubmission.R
import com.mohammadazri.dicodingsubmission.model.Legend


class LegendRecyclerViewAdapter(
    val legends: ArrayList<Legend>,
    val onItemClickCallback: LegendRecyclerViewAdapterInterface
) :
    RecyclerView.Adapter<LegendRecyclerViewAdapter.viewHolder>() {

    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvTitle: TextView = itemView.findViewById(R.id.tv_item_title)
        val imgLegend: ImageView = itemView.findViewById(R.id.img_item_legend)
        val imgRole: ImageView = itemView.findViewById(R.id.img_item_role)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val layout: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_legend, parent, false)

        return viewHolder(layout)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val legend = legends[position]

        holder.tvName.text = legend.name
        holder.tvTitle.text = legend.title
        holder.imgLegend.setImageResource(legend.image)
        holder.imgRole.setImageResource(legend.roleImage)

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(legend)
        }
    }

    override fun getItemCount(): Int {
        return legends.size
    }

    interface LegendRecyclerViewAdapterInterface {
        fun onItemClicked(legend: Legend)
    }
}

