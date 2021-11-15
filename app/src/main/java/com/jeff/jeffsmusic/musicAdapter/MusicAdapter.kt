package com.jeff.jeffsmusic.musicAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jeff.jeffsmusic.databinding.SongsItemBinding
import com.jeff.jeffsmusic.model.MusicData

class MusicAdapter(val musicData: ArrayList<MusicData>): RecyclerView.Adapter<MusicAdapter.MusicViewHolder>(){

    inner class MusicViewHolder(val myItem : SongsItemBinding) : RecyclerView.ViewHolder(myItem.root){
       fun bind(song:MusicData){
           myItem.ivProfileImage.setImageResource(song.mImg)
           myItem.songArtist.text = song.mArtist
           myItem.songName.text = song.mTitle
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val item = SongsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MusicViewHolder(item)
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind(musicData[position])
    }

    override fun getItemCount(): Int {
        return musicData.size
    }

}