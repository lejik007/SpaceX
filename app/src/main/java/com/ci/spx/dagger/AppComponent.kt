package com.ci.spx.dagger

import com.ci.spx.ui.Launches.LaunchesViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(fragment: LaunchesViewModel)
}

