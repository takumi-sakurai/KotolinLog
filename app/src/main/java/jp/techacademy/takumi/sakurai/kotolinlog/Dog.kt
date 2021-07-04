package jp.techacademy.takumi.sakurai.kotolinlog

import android.util.Log

open class Dog: Animal {
    //コンストラクタ
    constructor(name: String, age: Int): super(name,age){
    }

    // Animalクラスのメソッドをオーバーライド
    override fun say(){
        Log.d(MY_TAG, this.name + "(" + this.age + "歳)" + "　「ワンワン」")
    }
}