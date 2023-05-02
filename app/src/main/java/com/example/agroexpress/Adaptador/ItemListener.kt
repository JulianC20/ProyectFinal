package com.example.agroexpress.Adaptador

import org.json.JSONObject
import java.text.FieldPosition

interface ItemListener {
    fun onItemClicked(campesinos: JSONObject, position: Int)
}