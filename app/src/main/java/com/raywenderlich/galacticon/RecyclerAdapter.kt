package com.raywenderlich.galacticon

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val photos: ArrayList<Photo>) :
    RecyclerView.Adapter<RecyclerAdapter.PhotoHolder>() {


    class PhotoHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        private var view: View = v
        private var photo: Photo? = null


        init {
            v.setOnClickListener(this)
        }


        override fun onClick(v: View) {
            val context = itemView.context
            val showPhotoIntent = Intent(context, PhotoActivity::class.java)
            showPhotoIntent.putExtra(PHOTO_KEY, photo)
            context.startActivity(showPhotoIntent)
            Log.d("RecyclerView", "CLICK!")
        }

        companion object {
            private val PHOTO_KEY = "PHOTO"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoHolder {
        return PhotoHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.recyclerview_item_row, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PhotoHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = photos.size

}
