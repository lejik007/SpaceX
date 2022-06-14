package com.ci.spx.ui.Launches

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ci.spx.dataclasses.Docs
import com.ci.spx.network.ApiService
import com.ci.spx.ui.appComponent
import kotlinx.coroutines.launch
import javax.inject.Inject


class LaunchesViewModel(application: Application) : AndroidViewModel(application) {

    @Inject
    lateinit var service: ApiService

    var resultMLD = MutableLiveData<List<Docs>>()

    init {
        application.appComponent.inject(this)
    }

    private fun test() {
        viewModelScope.launch {
            var queryBody: String = ""
            service.getLaunches(queryBody)
            Log.d("Request", service.toString())
        }
    }
}