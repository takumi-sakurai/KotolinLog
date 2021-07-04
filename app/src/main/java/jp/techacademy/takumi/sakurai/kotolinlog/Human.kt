package jp.techacademy.takumi.sakurai.kotolinlog

import android.util.Log

open class Human: Animal, Thinkable {
    var hobby: String

    //コンストラクタ
    constructor(name: String, age: Int, hobby: String): super(name,age){
        this.hobby = hobby
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say(){
        Log.d(MY_TAG, "私の名前は" + this.name + "です。" + "年は" + this.age + "歳です。")
    }

    // Movableインターフェイスのメソッドをオーバーライド
    override fun think(){
        Log.d(MY_TAG, "「私は" + this.hobby + "について考える。」")
    }
}