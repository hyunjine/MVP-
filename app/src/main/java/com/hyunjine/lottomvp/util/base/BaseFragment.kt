package com.hyunjine.lottomvp.util.base

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.viewbinding.ViewBinding
import com.hyunjine.lottomvp.R



 abstract class BaseFragment<T : ViewBinding> : Fragment() {
//    /**
//     * onCreate()
//     */
//    protected open fun setClient() { }
//
//    /**
//     * onCreateView()
//     */
//    private var _binding : T? = null
//    protected val binding
//        get() = _binding!!
//    protected lateinit var navController : NavController
//
//    /**
//     * onViewCreated()
//     */
//    abstract fun initialize()
//    abstract fun viewEvent()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        setClient()
//        setRepository()
//        setViewModel()
//    }
//
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        _binding = DataBindingUtil.inflate(inflater, layoutResourceId, container,false)
//        binding.lifecycleOwner = viewLifecycleOwner
//
//        return binding.root
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        navController = Navigation.findNavController(binding.root)
//        viewInitialize()
//    }
//
//    override fun onResume() {
//        super.onResume()
//        viewEvent()
//    }
//
//    override fun onDestroyView() {
//        _binding = null
//        super.onDestroyView()
//    }
//
//    protected fun backStack() = navController.popBackStack()
}
