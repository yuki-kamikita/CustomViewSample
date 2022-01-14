package com.example.customviewsample

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.Drawable
import android.text.TextPaint
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.customviewsample.databinding.SampleMyViewBinding

class CustomView(context: Context, attributeSet: AttributeSet) : ConstraintLayout(context, attributeSet) {
    private val binding = SampleMyViewBinding.inflate(LayoutInflater.from(context), this, true)

    // 共通で使う処理はあらかじめinitで定義
    init {
        binding.centerButton.visibility = View.INVISIBLE

        binding.bottomButton.text = "aa"
        binding.bottomButton.setOnClickListener {
            Log.d("progress","bottom")
        }
    }

    // topボタンにクリックイベントを設定する
    fun setTopClickListener(listener: OnClickListener?) {
        binding.topButton.setOnClickListener(listener)
    }

    // この関数呼び出した時のみ表示
    fun setCenterClickListener(text: String, listener: OnClickListener?) {
        binding.centerButton.visibility = View.VISIBLE
        binding.centerButton.text = text
        binding.centerButton.setOnClickListener(listener)
    }

    // これ動かしたらinitのは上書きされる
    fun setBottomClickListener(listener: OnClickListener?) {
        binding.bottomButton.setOnClickListener(listener)
    }
}