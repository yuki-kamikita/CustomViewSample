package com.example.customviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.customviewsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // 各ボタンにクリックイベントを設定する
        binding.customView.setTopClickListener {
            Toast.makeText(this, "TOPボタン", Toast.LENGTH_SHORT).show()
        }
        binding.customView.setCenterClickListener( "ボタン" ) {
            Toast.makeText(this, "CENTERボタン", Toast.LENGTH_SHORT).show()
        }
//        binding.customView.setBottomClickListener{}
    }
}

// 出典：https://qiita.com/kaleidot725/items/ff4bd7e99012438aaa42
// 出典：https://android-tech.jp/create-customview/