package com.jujare.mvvm.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jujare.mvvm.data.api.ApiHelper
import com.jujare.mvvm.data.repository.MainRepository
import com.jujare.mvvm.ui.main.viewmodel.MainViewModel

/**
 * Factory class for MainViewModel class
 */
class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}
