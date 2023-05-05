package com.example.agroexpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import org.imaginativeworld.whynotimagecarousel.CarouselItem
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import com.example.agroexpress.Adaptador.ItemListener
import org.json.JSONObject


class Activity_Inicio_Roles : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_roles)
    }
   /* fun buscar(view: View) {
        val intent = Intent(this, AdminCampesinosActivity::class.java).apply { }
        startActivity(intent)
    }*/
}