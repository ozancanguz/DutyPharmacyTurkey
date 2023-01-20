package com.ozancanguz.dutypharmacyturkey.data.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.dutypharmacyturkey.R
import com.ozancanguz.dutypharmacyturkey.data.model.kktc.KktcPharmacy
import kotlinx.android.synthetic.main.kktc_rv.view.*

class KktcAdapter:RecyclerView.Adapter<KktcAdapter.KKTCViewHolder>() {

    var kktcList= emptyList<com.ozancanguz.dutypharmacyturkey.data.model.kktc.KktcResult>()

    fun setData(newData:KktcPharmacy){
        this.kktcList=newData.kktcResult
        notifyDataSetChanged()
    }

    class KKTCViewHolder(view: View):RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KKTCViewHolder {
        val inflater= LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.kktc_rv,parent,false)
        return KKTCViewHolder(view)
    }

    override fun onBindViewHolder(holder: KKTCViewHolder, position: Int) {

        var currentKktcPharmacy=kktcList[position]
        holder.itemView.kktciltextview.text=currentKktcPharmacy.name
        holder.itemView.kktcimage_view.setImageResource(R.drawable.pharmacy)
    }

    override fun getItemCount(): Int {
        return kktcList.size
    }
}