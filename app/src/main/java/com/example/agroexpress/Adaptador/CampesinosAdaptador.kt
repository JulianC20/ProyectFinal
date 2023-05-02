package com.example.agroexpress.Adaptador

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.agroexpress.Modelos.Campesinos
import com.example.agroexpress.R
import org.json.JSONObject
import kotlin.jvm.internal.Intrinsics.Kotlin

class CampesinosAdaptador  (private val CampesinosListner: ArrayList<JSONObject>, private val itemListener: ItemListener) : RecyclerView.Adapter<CampesinosAdaptador.ViewHolder>(){

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        var imagen: ImageView = view.findViewById(R.id.IV_imagen_campesino)
        var nombre: TextView = view.findViewById(R.id.tvnombres_campesino)
        var apellido: TextView = view.findViewById(R.id.TV_apellidos_campesino)
        var ciudad: TextView = view.findViewById(R.id.TV_ciudad_campesino)
        var telefono: TextView = view.findViewById(R.id.TV_telefono_campesino)

        fun bind(campesinos: JSONObject){
            nombre.text = campesinos.getString("nombre")
            apellido.text = campesinos.getString("apellido")
            ciudad.text = campesinos.getString("ciudad")
            telefono.text = campesinos.getString("telefono")
        }
    }

    override  fun  onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater
            .from(parent.context)
            .inflate(R.layout.fragment_admi_campesinos,parent,false)
    )
    override fun getItemCount() = this.CampesinosListner.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val campesino = CampesinosListner[position]

        try{
            Glide.with(holder.itemView.context)
                  .load(campesino.get("imagen"))
                  .into(holder.imagen)
            holder.bind(campesino)

            holder.itemView.setOnClickListener{
                itemListener.onItemClicked(campesino,position)
            }

        }catch (e : Exception){
            Log.w("Campesinosdatos", "No cargan datos")
        }
    }


}


