package jp.techacademy.takumi.sakurai.kotolinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log   // ここを追加

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("kotlintest", "ログへの出力テスト")    // ここを追加

        // 整数型の変数をnumという名前で作成して、10を代入する
        var num = 10
        Log.d("kotlintest", num.toString())

        // numに50を代入する
        // 変数や定数に .toString() と記述する方法もある
        num = 50
        Log.d("kotlintest", num.toString())

        val num1 = 10 + 5 - 2 * 4 / 2
        Log.d("kotlintest", "10 + 5 - 2 * 4 / 2 = " + num1)

        val flag1 = true
        val flag2 = false
        Log.d("kotlintest", "flag1 && flag2 = " + (flag1 && flag2))
        Log.d("kotlintest", "flag1 || flag2 = " + (flag1 || flag2))

        val num2 = 10
        val num3 = 20
        Log.d("kotlintest", "num2 < num3 = " + (num2 < num3))


        num = 60

        if (num >= 90) {
            Log.d("kotlintest", "優")
        } else if (num >= 75) {
            Log.d("kotlintest", "良")
        } else if (num >= 60) {
            Log.d("kotlintest", "可")
        } else {
            Log.d("kotlintest", "不可")
        }


        val drink = 1

        when (drink) {
            0 -> {
                Log.d("kotlintest", "コーヒーを注文しました")
            }
            1 -> Log.d("kotlintest", "紅茶を注文しました")
            2 -> Log.d("kotlintest", "ミルクを注文しました")
            else -> Log.d("kotlintest", "オーダーミスです")
        }


        for (i in 1 until 6) {
            Log.d("kotlintest", "for文の " + i + "回目")
        }

        num = 1 //事前にvar num の定義が残っている場合は、エラーがでるので、var を削除しましょう。

        while (num < 6) {
            Log.d("kotlintest", "while文の " + num + "回目")
            num++
        }

        // Array<Int>型の配列が作成される
        val points = arrayOf(10, 6, 15, 23, 17)

        for (i in points) {
            Log.d("kotlintest", i.toString())
        }

        val numA = 100
        val numB = 0
        var ans = 0

        try {
            ans = numA / numB
        } catch (e: Exception) {
            Log.d("kotlintest", "0で割ろうとしました")
            // 例外情報から、メッセージを表示
            Log.d("kotlintest", e.message.toString())
        } finally {
            Log.d("kotlintest", "ans = " + ans.toString())
        }


        total(12, 14)


        //オブジェクト
        val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.say()  // ポチが吠えます（ログ出力）
        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")

        val dog2 = Dog("ハチ", 10)    // 名前をハチ、年齢10歳で、Dogインスタンスを作る
        dog2.say()  // ハチが吠えます（ログ出力）
        Log.d("kotlintest", "犬の名前は" + dog2.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog2.age + "歳です。")



        val bigdog = BigDog("ヨーゼフ", 15)     // 名前をヨーゼフ、年齢15歳で、BigDogのインスタンスを作る

        bigdog.say()
        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")


        val dog_move = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        dog_move.move()


    }

    // firstとlast、2つの引数を指定する
    private fun total(first: Int, last: Int): Int {
        var sum = 0
        for (i in first..last) {
            sum += i
        }
        Log.d("kotlintest", sum.toString())
        return sum
    }


}