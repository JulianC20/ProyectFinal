package com.example.agroexpress.Adaptador

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.agroexpress.Modelos.Producto
import com.example.agroexpress.R
import org.json.JSONArray
import org.json.JSONObject

class ProductoAdaptador (private val ProductoListener: ProductoListener) : RecyclerView.Adapter<ProductoAdaptador.ViewHolder>(){
    val  listProducto = ArrayList<Producto>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int)= ViewHolder(LayoutInflater.from(parent.context).inflate(
        R.layout.fragment_com_productos, parent,false))


    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val product =listProducto[position]

        try{
            holder.tvNombreP.text= product.Pro_Nombre
            holder.tvPrecioP.text= product.Pro_Precio
            holder.tvLoteP.text= product.Pro_Lote
            holder.itemView.setOnClickListener{
                //hola
            }
        }catch (e: Exception){
            Log.w("Productdatos", "No cargan datos")
        }

    }

    fun updateData(data:kotlin.collections.List<Producto>){
        listProducto.clear()
        listProducto.addAll(data)
        notifyDataSetChanged()
    }
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val tvNombreP=itemView.findViewById<TextView>(R.id.nombreComProducto)
        val tvPrecioP=itemView.findViewById<TextView>(R.id.precioComProducto)
        val tvLoteP=itemView.findViewById<TextView>(R.id.cantidadComProducto)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}