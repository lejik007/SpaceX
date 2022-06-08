package com.ci.spx.ui

import android.app.Application
import android.content.Context
import com.ci.spx.dagger.AppComponent
import com.ci.spx.dagger.DaggerAppComponent

class MainApp : Application() {
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}

val Context.appComponent: AppComponent
    get() = when (this) {
        is MainApp -> appComponent
        else -> this.applicationContext.appComponent
    }
