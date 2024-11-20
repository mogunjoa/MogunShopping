package com.mogun.mogunshopapp.viewholder

import com.mogun.mogunshopapp.ListAdapter
import com.mogun.mogunshopapp.databinding.ItemViewpagerBinding
import com.mogun.mogunshopapp.model.ListItem
import com.mogun.mogunshopapp.model.ViewPager

class ViewPagerViewHolder(
    private val binding: ItemViewpagerBinding
): BindingViewHolder<ItemViewpagerBinding>(binding) {

    private val adapter = ListAdapter()

    init {
        binding.viewPager.adapter = adapter
    }

    override fun bind(item: ListItem) {
        super.bind(item)

        item as ViewPager
        adapter.submitList(item.items)
    }
}