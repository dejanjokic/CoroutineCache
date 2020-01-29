package net.dejanjokic.coroutinecache.di.module

import dagger.Module
import dagger.Provides
import net.dejanjokic.coroutinecache.App
import net.dejanjokic.coroutinecache.data.local.QuoteDatabase
import net.dejanjokic.coroutinecache.di.scope.ApplicationScope

@Module
object DatabaseModule {

    @ApplicationScope
    @Provides
    fun provideQuoteDatabase(app: App): QuoteDatabase =
        QuoteDatabase.getDatabase(app)
}