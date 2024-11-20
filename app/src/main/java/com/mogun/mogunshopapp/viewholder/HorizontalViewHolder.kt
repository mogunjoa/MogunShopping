package com.mogun.mogunshopapp.viewholder

import com.mogun.mogunshopapp.ListAdapter
import com.mogun.mogunshopapp.databinding.ItemHorizontalBinding
import com.mogun.mogunshopapp.model.Horizontal
import com.mogun.mogunshopapp.model.ListItem

class HorizontalViewHolder(
    private val binding: ItemHorizontalBinding
): BindingViewHolder<ItemHorizontalBinding>(binding) {

    private val adapter = ListAdapter()

    init {
        binding.listView.adapter = adapter
    }

    override fun bind(item: ListItem) {
        super.bind(item)

        item as Horizontal
        binding.titleTextView.text = item.title
        adapter.submitList(item.items)
    }
}