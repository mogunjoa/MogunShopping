package com.mogun.mogunshopapp.di

import com.mogun.mogunshopapp.remote.MainService
import com.mogun.mogunshopapp.remote.repository.MainRepository
import com.mogun.mogunshopapp.remote.repository.MainRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object MainRepositoryModule {
    @ViewModelScoped
    @Provides
    fun provideMainRepository(
        mainService: MainService
    ): MainRepository = MainRepositoryImpl(mainService)
}