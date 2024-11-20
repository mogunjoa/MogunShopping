package com.mogun.mogunshopapp.remote.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.mogun.mogunshopapp.remote.MainPagingSource
import com.mogun.mogunshopapp.remote.MainService
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val mainService: MainService,
): MainRepository {
    override fun loadList() = Pager(
        config = PagingConfig(
            pageSize = 20,
            enablePlaceholders = false
        ),
        pagingSourceFactory = {
            MainPagingSource(mainService)
        }
    ).flow
}