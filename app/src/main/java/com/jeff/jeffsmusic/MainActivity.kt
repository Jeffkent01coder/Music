package com.jeff.jeffsmusic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jeff.jeffsmusic.databinding.ActivityMainBinding
import com.jeff.jeffsmusic.model.MusicData
import com.jeff.jeffsmusic.musicAdapter.MusicAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    lateinit var musicAdapter : MusicAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

         musicAdapter = MusicAdapter(musicData())
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = musicAdapter

    }
        fun musicData():  ArrayList<MusicData>{
           return arrayListOf<MusicData>(
                MusicData(R.drawable.x, "1. Sad:", "XXX tentacion"),
                MusicData(R.drawable.t, "2. Suicide:", "XXX tentacion"),
                MusicData(R.drawable.x, "3. Moonlight:", "XXX tentacion"),
                MusicData(R.drawable.t, "4. Look at me: ", "XXX tentacion"),
                MusicData(R.drawable.x, "5. Hope:", "XXX tentacion"),
                MusicData(R.drawable.t, "6. Leave Me: ", "XXX tentacion"),
                MusicData(R.drawable.x, "7. Jocelyne flores: ", "XXX tentacion"),
                MusicData(R.drawable.t, "8. Changes: ", "XXX tentacion"),
                MusicData(R.drawable.x, "9. Lean :", "XXX tentacion"),
                MusicData(R.drawable.t, "10. Don't leave:", "XXX tentacion")
            )
        }
}
