fun main(){
    // 変数の宣言
    var text :String = "Hello! Kotlin!"
    println(text)
    text = firstFunc()
    println(text)
}

fun firstFunc(): String{
    var text :String = "returnStr"
    return text
}