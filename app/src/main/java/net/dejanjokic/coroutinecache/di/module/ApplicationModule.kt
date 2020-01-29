package net.dejanjokic.coroutinecache.di.module

import dagger.Module
import dagger.Provides
import net.dejanjokic.coroutinecache.App
import net.dejanjokic.coroutinecache.di.scope.ApplicationScope

@Module
class ApplicationModule(private val app: App) {

    @ApplicationScope
    @Provides
    fun provideApplication(): App = app
}