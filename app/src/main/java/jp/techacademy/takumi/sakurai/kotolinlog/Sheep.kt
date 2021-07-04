package jp.techacademy.takumi.sakurai.kotolinlog

import android.util.Log

class Sheep (var name: String, var age: Int){
    companion object{
        const val to_jp = "羊"
        fun introduce(){
            Log.d(MY_TAG, "これは羊クラスです")
        }
    }
    fun say() {
        Log.d(MY_TAG, this.name + "(" + this.age + "歳)" + "「メー」")
    }
}