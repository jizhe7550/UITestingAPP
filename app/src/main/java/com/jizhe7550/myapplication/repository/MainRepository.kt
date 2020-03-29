package com.jizhe7550.myapplication.repository

import com.jizhe7550.myapplication.util.StateEvent
import com.jizhe7550.myapplication.ui.viewmodel.state.MainViewState
import com.jizhe7550.myapplication.util.DataState
import kotlinx.coroutines.flow.Flow

interface MainRepository{

    fun getBlogs(stateEvent: StateEvent, category: String): Flow<DataState<MainViewState>>

    fun getAllBlogs(stateEvent: StateEvent): Flow<DataState<MainViewState>>

    fun getCategories(stateEvent: StateEvent): Flow<DataState<MainViewState>>
}