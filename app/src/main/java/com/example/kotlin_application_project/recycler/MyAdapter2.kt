//package com.example.kotlin_application_project.recycler
//
//import android.content.Context
//import android.graphics.Bitmap
//import android.graphics.drawable.Drawable
//import android.util.Log
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.bumptech.glide.Glide
//import com.bumptech.glide.request.target.CustomTarget
//import com.bumptech.glide.request.transition.Transition
//import com.example.kotlin_application_project.databinding.ItemMainBinding
//import com.example.kotlin_application_project.model.ItemModel4
//
////부산맛집
//class MyViewHolder2(val binding: ItemMainBinding): RecyclerView.ViewHolder(binding.root)
//
//class MyAdapter2(val context: Context, val datas: List<ItemModel4>?): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
//
//    override fun getItemCount(): Int{
//        return datas?.size ?: 0
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
//            = MyViewHolder2(ItemMainBinding.inflate(LayoutInflater.from(parent.context), parent, false))
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        val binding=(holder as MyViewHolder2).binding
//
//
//        //도보 여행
//        val user = datas?.get(position)
//        binding.firstNameView.text = user?.TITLE
//        val urlImg = user?.MAIN_IMG_NORMAL
//        binding.contactView.text = user?.CNTCT_TEL
//
//        Glide.with(context)
//            .asBitmap()
//            .load(urlImg)
//            .into(object : CustomTarget<Bitmap>(200, 200) {
//                override fun onResourceReady(
//                    resource: Bitmap,
//                    transition: Transition<in Bitmap>?
//                ) {
//                    binding.avatarView.setImageBitmap(resource)
////                    Log.d("lsy", "width : ${resource.width}, height: ${resource.height}")
//                }
//
//                override fun onLoadCleared(placeholder: Drawable?) {
//                    TODO("Not yet implemented")
//                }
//            })
//
//    }
//}