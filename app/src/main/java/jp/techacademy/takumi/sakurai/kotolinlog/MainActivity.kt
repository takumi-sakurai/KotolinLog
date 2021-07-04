package jp.techacademy.takumi.sakurai.kotolinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log   // ここを追加

// パッケージレベルに定義した関数
fun formatMyTag(): String {
    return "[" + MY_TAG + "]"
}

// パッケージレベルに定義した定数
const val MY_TAG = "kotlintest"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mother = Human("ミサエ", 32, "裁縫")
        val father = Human("ヒロシ", 36, "サーフィン")

        mother.say()
        mother.think()
        father.say()
        father.think()
    }
}