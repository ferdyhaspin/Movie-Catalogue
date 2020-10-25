package app.ferdyhaspin.moviecatalogue.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import app.ferdyhaspin.moviecatalogue.R
import app.ferdyhaspin.moviecatalogue.ui.main.movie.MovieFragment
import app.ferdyhaspin.moviecatalogue.ui.main.tv.TvShowFragment

/**
 * Created by ferdyhaspin on 25/10/20.
 * Copyright (c) 2020 Movie Catalogue All rights reserved.
 */
class MainViewModel @ViewModelInject constructor(

) : ViewModel() {

    private lateinit var fragmentManager: FragmentManager

    private val movieFragment by lazy { MovieFragment() }
    private val tvShowFragment by lazy { TvShowFragment() }

    private var activeFragment: Fragment = movieFragment

    fun init(fragmentManager: FragmentManager) {
        this.fragmentManager = fragmentManager
        addFragment(activeFragment)
    }

    private fun addFragment(fragment: Fragment) {
        if (fragmentManager.findFragmentByTag(fragment.javaClass.name) == null) {
            fragmentManager.commit {
                add(R.id.container, fragment, fragment.javaClass.name)
                show(fragment)
            }
        }
        fragmentManager.commit {
            hide(activeFragment)
            show(fragment)
        }
        activeFragment = fragment
    }

    fun toMovieFragment() {
        addFragment(movieFragment)
    }

    fun toTvShowFragment() {
        addFragment(tvShowFragment)
    }
}