package jp.techacademy.takumi.sakurai.kotolinlog

import android.util.Log

class Cat(var name: String, var age: Int) {
    init {

    }

    fun say() {
        Log.d(MY_TAG, this.name + "(" + this.age + "歳)" + "　「ニャー」")
    }
}
