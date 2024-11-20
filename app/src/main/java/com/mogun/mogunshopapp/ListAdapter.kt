package com.mogun.mogunshopapp

import android.view.ViewGroup
import com.mogun.mogunshopapp.model.ListItem
import com.mogun.mogunshopapp.viewholder.BindingViewHolder
import com.mogun.mogunshopapp.viewholder.ViewHolderGenerator

class ListAdapter :
    androidx.recyclerview.widget.ListAdapter<ListItem, BindingViewHolder<*>>(DiffCallback()) {
    override fun getItemViewType(position: Int): Int {
        val item = getItem(position)
        return item?.viewType?.ordinal ?: -1
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BindingViewHolder<*> {
        return ViewHolderGenerator.get(parent, viewType)
    }

    override fun onBindViewHolder(
        holder: BindingViewHolder<*>,
        position: Int
    ) {
        val item = getItem(position)
        if (item != null) {
            holder.bind(item)
        }
    }
}