package jp.techacademy.takumi.sakurai.kotolinlog

import android.util.Log

open class Dog {

    //プロパティ
    var name: String
    var age: Int

    //コンストラクタ
    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }

    //メソッド
    open fun say(){
        Log.d(MY_TAG, this.name + "(" + this.age + "歳)" + "　「ワンワン」")
    }
}