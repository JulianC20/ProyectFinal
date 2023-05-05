package com.example.agroexpress


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.agroexpress.R
import android.widget.*
import androidx.navigation.Navigation


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
    private lateinit var btnProducto: Button
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

        val ll = inflater.inflate(R.layout.fragment_mas_opciones, container, false)

        this.btnProducto =ll.findViewById(R.id.btnProducto)

        btnProducto.setOnClickListener{
            val navController = Navigation.findNavController(requireActivity(), R.id.btnProducto)
            navController.navigate(R.id.produc_RecyclerFragment)
        }
        return ll
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bottomCamp:Button=view.findViewById(R.id.btnCampesinos)
        bottomCamp.setOnClickListener {
            val intent=Intent(getActivity(),AdminCampesinosActivity::class.java)
            startActivity(intent)
        }



        super.onViewCreated(view, savedInstanceState)
        val bottomDesp:Button=view.findViewById(R.id.btnDespachos)
        bottomDesp.setOnClickListener {
            val intent=Intent(getActivity(),activity_admin_despachos::class.java)
            startActivity(intent)
        }

        super.onViewCreated(view, savedInstanceState)
        val bottomEntre:Button=view.findViewById(R.id.btnEntrega)
        bottomEntre.setOnClickListener {
            val intent=Intent(getActivity(),activity_admin_entrega::class.java)
            startActivity(intent)
        }

        super.onViewCreated(view, savedInstanceState)
        val bottomPedid:Button=view.findViewById(R.id.btnPedidos)
        bottomPedid.setOnClickListener {
            val intent=Intent(getActivity(),Activity_admin_Pedidos::class.java)
            startActivity(intent)
        }

        super.onViewCreated(view, savedInstanceState)
        val bottomSopor:Button=view.findViewById(R.id.btnSoporte)
        bottomSopor.setOnClickListener {
            val intent=Intent(getActivity(),Activity_soporte::class.java)
            startActivity(intent)
        }

        super.onViewCreated(view, savedInstanceState)
        val bottomDevo:Button=view.findViewById(R.id.btnDevolucion)
        bottomDevo.setOnClickListener {
            val intent=Intent(getActivity(),Activity_admin_devoluciones::class.java)
            startActivity(intent)
        }

        super.onViewCreated(view, savedInstanceState)
        val bottomTrans:Button=view.findViewById(R.id.btnTransportador)
        bottomTrans.setOnClickListener {
            val intent=Intent(getActivity(),Activity_admin_transportador::class.java)
            startActivity(intent)
        }
    }



}