package com.ranggoo.janmangruffy

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ranggoo.janmangruffy.databinding.ItemJanmangRuffyBinding

data class ItemRuffy(
    val title: String,
    val content: String,
    val image: Drawable?,
)

private var itemDiffCallback = object : DiffUtil.ItemCallback<ItemRuffy>() {
    override fun areItemsTheSame(oldItem: ItemRuffy, newItem: ItemRuffy): Boolean = oldItem.title == newItem.title
    override fun areContentsTheSame(oldItem: ItemRuffy, newItem: ItemRuffy): Boolean = oldItem == newItem
}

class RuffyAdapter : ListAdapter<ItemRuffy, RuffyAdapter.RuffyViewHolder>(itemDiffCallback) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RuffyViewHolder {
        return RuffyViewHolder(
            ItemJanmangRuffyBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RuffyViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

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







