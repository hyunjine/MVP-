package com.hyunjine.lottomvp.util.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<T : ViewBinding> : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialize()
    }

    /**
     * onCreate()
     */
    abstract fun initialize()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        setBinding(inflater, container)
        return binding.root
    }

    /**
     * onCreateView()
     */
    abstract fun setBinding(inflater: LayoutInflater, container: ViewGroup?)

    protected var _binding : T? = null
    protected val binding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(binding.root)
        viewInitialize()
    }

    protected open fun viewInitialize() {}

    /**
     * onViewCreated()
     */
    protected lateinit var navController : NavController

    override fun onResume() {
        super.onResume()
        viewEvent()
    }

    /**
     * onResume()
     */
    abstract fun viewEvent()

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    protected fun backStack() = navController.popBackStack()
}
