package com.example.agroexpress.Adaptador

import org.json.JSONObject

interface CampesinosListener {

    fun onUsuariosClicked(usuarios: JSONObject, position: Int)
}