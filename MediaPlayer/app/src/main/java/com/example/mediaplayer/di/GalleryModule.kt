package com.example.mediaplayer.di

import android.content.ContentResolver
import android.content.Context
import com.example.mediaplayer.data.repository.GalleryRepository
import com.example.mediaplayer.data.source.GalleryDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object GalleryModule {

    @Provides
    @Singleton
    fun provideContentResolver(@ApplicationContext context:Context): ContentResolver = context.contentResolver

    @Provides
    @Singleton
    fun provideGalleryDataSource(contentResolver: ContentResolver): GalleryDataSource = GalleryDataSource(contentResolver)

    @Provides
    @Singleton
    fun provideGalleryRepository(galleryDataSource: GalleryDataSource) = GalleryRepository(galleryDataSource)
}