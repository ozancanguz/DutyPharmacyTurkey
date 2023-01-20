package com.ozancanguz.dutypharmacyturkey.data.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.dutypharmacyturkey.R
import com.ozancanguz.dutypharmacyturkey.data.model.Pharmacy
import kotlinx.android.synthetic.main.rv.view.*

class PharmacyAdapter:RecyclerView.Adapter<PharmacyAdapter.PharmacyViewHolder>() {

    var pharmacyList= emptyList<com.ozancanguz.dutypharmacyturkey.data.model.Result>()

    fun setData(newData:Pharmacy){
        this.pharmacyList=newData.result
        notifyDataSetChanged()
    }

    class PharmacyViewHolder(view: View):RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PharmacyViewHolder {
       val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.rv,parent,false)
        return  PharmacyViewHolder(view)
    }

    override fun onBindViewHolder(holder: PharmacyViewHolder, position: Int) {
       val currentPharmacy=pharmacyList[position]
        holder.itemView.iltextview.text=currentPharmacy.name +" ECZANESİ"
        holder.itemView.image_view.setImageResource(R.drawable.pharmacy)

    }

    override fun getItemCount(): Int {
        return pharmacyList.size
    }
}