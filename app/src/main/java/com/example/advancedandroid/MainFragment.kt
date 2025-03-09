package com.example.advancedandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = findNavController()

        view.findViewById<Button>(R.id.btn_intents).setOnClickListener {
            navController.navigate(R.id.intentsFragment)
        }

        view.findViewById<Button>(R.id.btn_foreground_service).setOnClickListener {
            navController.navigate(R.id.foregroundServiceFragment)
        }

        view.findViewById<Button>(R.id.btn_background_service).setOnClickListener {
            navController.navigate(R.id.backgroundServiceFragment)
        }

        view.findViewById<Button>(R.id.btn_content_provider).setOnClickListener {
            navController.navigate(R.id.contentProviderFragment)
        }
    }
}
