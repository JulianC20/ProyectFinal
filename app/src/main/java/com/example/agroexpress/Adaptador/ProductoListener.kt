package com.example.agroexpress.Adaptador

import com.example.agroexpress.Modelos.Producto
import org.json.JSONObject
import java.text.FieldPosition

interface ProductoListener {

    fun onProductoCliked(producto: JSONObject, position: Int)

}