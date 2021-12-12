package com.ranggoo.janmangruffy

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ranggoo.janmangruffy.databinding.ItemJanmangRuffyBinding


private var itemDiffCallback = object : DiffUtil.ItemCallback<ItemRuffy>() {
    override fun areItemsTheSame(oldItem: ItemRuffy, newItem: ItemRuffy): Boolean {
        return oldItem.id == newItem.id
    }
    override fun areContentsTheSame(oldItem: ItemRuffy, newItem: ItemRuffy): Boolean = oldItem.content == newItem.content
}

class RuffyAdapter : ListAdapter<ItemRuffy, RuffyAdapter.RuffyViewHolder>(itemDiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RuffyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemViewBinding = ItemJanmangRuffyBinding.inflate(
            layoutInflater,
            parent,
            false
        )
        return RuffyViewHolder(itemViewBinding)
    }

    override fun onBindViewHolder(holder: RuffyViewHolder, position: Int)  = holder.bind(getItem(position))

    class RuffyViewHolder(
        val binding: ItemJanmangRuffyBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ItemRuffy) {
            with(binding) {
                ivRuffy.setImageDrawable(item.image)
                tvTitle.text = item.title
                tvContent.text = item.content
            }
        }
    }

}







