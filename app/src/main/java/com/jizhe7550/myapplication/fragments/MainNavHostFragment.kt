package com.jizhe7550.myapplication.fragments

import android.content.Context
import androidx.fragment.app.FragmentFactory
import androidx.navigation.fragment.NavHostFragment
import com.jizhe7550.myapplication.BaseApplication
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.InternalCoroutinesApi
import javax.inject.Inject

@ExperimentalCoroutinesApi
@InternalCoroutinesApi
class MainNavHostFragment : NavHostFragment(){

    private val TAG: String = "AppDebug"

    @Inject
    lateinit var mainFragmentFactory: FragmentFactory

    override fun onAttach(context: Context) {
        (activity?.application as BaseApplication).appComponent
            .inject(this)
        childFragmentManager.fragmentFactory = mainFragmentFactory
        super.onAttach(context)
    }

}