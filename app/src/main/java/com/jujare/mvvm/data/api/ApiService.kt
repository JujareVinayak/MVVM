package com.jujare.mvvm.data.api

import com.jujare.mvvm.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}