package com.ranggoo.janmangruffy

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ranggoo.janmangruffy.databinding.ItemJanmangBinding

data class ItemRuffy(
    val title: String,
    val content: String,
    val image: Drawable?,
)

interface ItemRuffyEvent {
    fun onClick(position: Int)
    fun onLongClick(position: Int)
}

class RuffyAdapter(
    val list: List<ItemRuffy>
) : RecyclerView.Adapter<RuffyAdapter.JanMangViewHolder>() {

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
        val item = list.get(position)
        holder.bind(item)
    }

    override fun getItemCount(): Int = list.size

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
                clickEvent?.onLongClick(adapterPosition)
                false
            }
        }
    }

}





