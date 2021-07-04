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

        val dog = Dog("mike",8)
        dog.say()
        val cat = Cat("milk",8)
        cat.say()

        Log.d(MY_TAG, "うちの犬の名前は" + dog.name + "で猫の歳は" + cat.age + "歳です")

        val sheep = Sheep("Li",5)
        sheep.say()
        Sheep.introduce()
        Log.d(MY_TAG, Sheep.to_jp + "のクラス変数です。")

        //クラスの継承
        val bigdog = BigDog("ヨーゼフ", 15)
        bigdog.say()

    }

}