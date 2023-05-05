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

class CampesinosAdaptador  (private val CampesinosListener: ArrayList<JSONObject>, private val itemListener: ItemListener) : RecyclerView.Adapter<CampesinosAdaptador.ViewHolder>(){

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        var imagen: ImageView = view.findViewById(R.id.IV_imagen_campesino)
        var nombre: TextView = view.findViewById(R.id.tvnombres_campesino)
        var apellido: TextView = view.findViewById(R.id.TV_apellidos_campesino)
        var ciudad: TextView = view.findViewById(R.id.TV_ciudad_campesino)
        var telefono: TextView = view.findViewById(R.id.TV_telefono_campesino)

        fun bind(campesinos: JSONObject){
            nombre.text = campesinos.getString(" Cam_Nombre")
            apellido.text = campesinos.getString("Cam_Apellido")
            ciudad.text = campesinos.getString("Cam_Ciudad")
            telefono.text = campesinos.getString("Cam_Telefono")
        }
    }

    override  fun  onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater
            .from(parent.context)
            .inflate(R.layout.fragment_admi_campesinos,parent,false)
    )
    override fun getItemCount() = this.CampesinosListener.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val Campesinos = CampesinosListener[position]

        try{
            Glide.with(holder.itemView.context)
                  .load(Campesinos.get("imagen"))
                  .into(holder.imagen)
            holder.bind(Campesinos)

            holder.itemView.setOnClickListener{
                itemListener.onItemClicked(Campesinos,position)
            }

        }catch (e : Exception){
            Log.w("Campesinosdatos", "No cargan datos")
        }
    }


}


