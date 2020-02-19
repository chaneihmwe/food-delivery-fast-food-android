package com.ceh.fastfood.ui.aboutus

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.ceh.fastfood.R

class AboutUsFragment : Fragment() {

    private lateinit var sendViewModel: AboutUsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        sendViewModel =
            ViewModelProviders.of(this).get(AboutUsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_about_us, container, false)
        return root
    }
}