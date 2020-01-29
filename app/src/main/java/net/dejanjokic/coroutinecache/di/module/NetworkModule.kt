package net.dejanjokic.coroutinecache.di.module

import dagger.Module
import dagger.Provides
import net.dejanjokic.coroutinecache.core.Constants.BASE_URL
import net.dejanjokic.coroutinecache.data.network.QuoteService
import net.dejanjokic.coroutinecache.di.scope.ApplicationScope
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
object NetworkModule {

    @ApplicationScope
    @Provides
    fun provideOkHttpClient(): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().also { it.level = HttpLoggingInterceptor.Level.BODY })
            .build()

    @ApplicationScope
    @Provides
    fun provideRetrofit(client: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

    @ApplicationScope
    @Provides
    fun provideQuoteService(retrofit: Retrofit): QuoteService =
        retrofit.create(QuoteService::class.java)
}