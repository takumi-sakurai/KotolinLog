package jp.techacademy.takumi.sakurai.kotolinlog

import android.util.Log

class Cat: Animal {
    constructor(name: String, age: Int): super(name,age){
    }

    override fun say() {
        Log.d(MY_TAG, this.name + "(" + this.age + "歳)" + "　「ニャー」")
    }
}
