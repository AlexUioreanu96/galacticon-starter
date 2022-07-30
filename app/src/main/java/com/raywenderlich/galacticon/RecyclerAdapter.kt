package com.raywenderlich.galacticon

import android.util.Log
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
            Log.d("RecyclerView", "CLICK!")
        }

        companion object {
            private val PHOTO_KEY = "PHOTO"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: PhotoHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = photos.size

}
