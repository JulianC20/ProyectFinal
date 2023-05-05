package com.example.agroexpress.Adaptador

import org.json.JSONObject

interface CampesinosListener {

    fun onCampesinosClicked(Campesinos: JSONObject, position: Int)
}