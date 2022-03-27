package com.hyunjine.lottomvp.ui.main

import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.hyunjine.lottomvp.R
import com.hyunjine.lottomvp.databinding.FragmentMainBinding
import com.hyunjine.lottomvp.util.base.BaseFragment

class MainFragment: BaseFragment<FragmentMainBinding>() {

    override fun initialize() {

    }

    override fun setBinding(inflater: LayoutInflater, container: ViewGroup?) {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
    }

    override fun viewInitialize() {
        val drawable = binding.img.drawable as AnimatedVectorDrawable
        drawable.start()
    }


    override fun viewEvent() {
        binding.btn.setOnClickListener {
            Toast.makeText(requireContext(), "생성~", Toast.LENGTH_SHORT).show()
        }
    }
}