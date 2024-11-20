package com.mogun.mogunshopapp.remote.repository

import androidx.paging.PagingData
import com.mogun.mogunshopapp.model.ListItem
import kotlinx.coroutines.flow.Flow

interface MainRepository {

    fun loadList(): Flow<PagingData<ListItem>>
}