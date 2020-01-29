package net.dejanjokic.coroutinecache

import android.app.Application
import net.dejanjokic.coroutinecache.di.component.ApplicationComponent
import net.dejanjokic.coroutinecache.di.component.DaggerApplicationComponent
import net.dejanjokic.coroutinecache.di.module.ApplicationModule

class App : Application() {

    private lateinit var appComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }

    fun component() = appComponent
}