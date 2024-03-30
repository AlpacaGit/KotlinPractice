package Models
fun main(){
    // 変数の宣言
    var text :String = "Hello! Kotlin!"
    println(text)
    text = firstFunc()
    println(text)
    // クラスの利用
    var firstClass = FirstClass("これは最初のクラスだ")
    firstClass.ShowName()
}

fun firstFunc(): String{
    var text :String = "returnStr"
    return text
}

// FirstClass
class FirstClass(val name : String){
    fun ShowName(){
        println(name)
    }
}