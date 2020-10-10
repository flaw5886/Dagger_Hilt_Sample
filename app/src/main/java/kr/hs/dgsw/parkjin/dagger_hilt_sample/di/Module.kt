package kr.hs.dgsw.parkjin.dagger_hilt_sample.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import kr.hs.dgsw.parkjin.dagger_hilt_sample.repository.NameRepository
import kr.hs.dgsw.parkjin.dagger_hilt_sample.repositoryImpl.NameRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNameRepository(nameRepositoryImpl: NameRepositoryImpl): NameRepository = nameRepositoryImpl
}