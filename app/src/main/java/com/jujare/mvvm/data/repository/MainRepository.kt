package com.jujare.mvvm.data.repository

import com.jujare.mvvm.data.api.ApiHelper
import com.jujare.mvvm.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}