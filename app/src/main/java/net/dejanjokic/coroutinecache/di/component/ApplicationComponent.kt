package net.dejanjokic.coroutinecache.di.component

import dagger.Component
import net.dejanjokic.coroutinecache.di.module.ApplicationModule
import net.dejanjokic.coroutinecache.di.module.DatabaseModule
import net.dejanjokic.coroutinecache.di.module.NetworkModule
import net.dejanjokic.coroutinecache.di.module.ViewModelModule
import net.dejanjokic.coroutinecache.di.scope.ApplicationScope
import net.dejanjokic.coroutinecache.ui.MainActivity

@ApplicationScope
@Component(modules = [
    ApplicationModule::class, DatabaseModule::class, NetworkModule::class, ViewModelModule::class
])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)
}