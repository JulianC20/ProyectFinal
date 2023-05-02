package com.example.agroexpress


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.agroexpress.R
import android.widget.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MasOpcionesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MasOpcionesFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mas_opciones, container, false)


    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bottomCamp:Button=view.findViewById(R.id.btnCampesinos)
        bottomCamp.setOnClickListener {
            val intent=Intent(getActivity(),AdminCampesinosActivity::class.java)
            startActivity(intent)
        }


        super.onViewCreated(view, savedInstanceState)
        val bottomProd:Button=view.findViewById(R.id.btnProducto)
        bottomProd.setOnClickListener {
            val intent=Intent(getActivity(),AdminCampesinosActivity::class.java)
            startActivity(intent)
        }

    }



}