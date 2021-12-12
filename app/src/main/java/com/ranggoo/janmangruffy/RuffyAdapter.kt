package com.ranggoo.janmangruffy

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ranggoo.janmangruffy.databinding.ItemJanmangBinding


interface ItemRuffyEvent {
    fun onDelete(ruffy: ItemRuffy)
}

private val itemDiffCallback = object : DiffUtil.ItemCallback<ItemRuffy>() {
    override fun areItemsTheSame(oldItem: ItemRuffy, newItem: ItemRuffy): Boolean {
        return oldItem.title == newItem.title
    }

    override fun areContentsTheSame(oldItem: ItemRuffy, newItem: ItemRuffy): Boolean {
        return oldItem.content == newItem.content
    }

}

class RuffyAdapter: ListAdapter<ItemRuffy,RuffyAdapter.JanMangViewHolder>(itemDiffCallback) {

    var clickEvent: ItemRuffyEvent? = null

    fun addClickEventListener(listener:ItemRuffyEvent){
        clickEvent = listener;
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JanMangViewHolder {
        val itemViewBinding = ItemJanmangBinding.inflate(LayoutInflater.from(parent.context), parent, false);
        val viewHolder = JanMangViewHolder(itemViewBinding)
        return viewHolder
    }

    override fun onBindViewHolder(holder: JanMangViewHolder, position: Int) {
        // 뷰홀더에 있는 아이템뷰를 셋팅해주는 부분.
        val item = getItem(position)
        holder.bind(item)
    }

//    override fun getItemViewType(position: Int): Int {
//        return super.getItemViewType(position)
//    }
//
//    override fun getItemId(position: Int): Long {
//        return super.getItemId(position)
//    }

    inner class JanMangViewHolder(val itemViewBinding: ItemJanmangBinding) : RecyclerView.ViewHolder(itemViewBinding.root) {
        fun bind(item: ItemRuffy) {
            itemViewBinding.ivRuffy.setImageDrawable(item.image)
            itemViewBinding.tvTitle.text = item.title
            itemViewBinding.tvContent.text = item.content

//            itemViewBinding.ivRuffy.setOnClickListener {
//                clickEvent?.onClick(adapterPosition)
//            }
            itemViewBinding.ivRuffy.setOnLongClickListener {
                clickEvent?.onDelete(item)
                false
            }
        }
    }

}





