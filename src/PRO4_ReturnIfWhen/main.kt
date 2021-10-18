package PRO4_ReturnIfWhen

fun main() {
    //RETURN IF & WHEN
//    => Memasukan nilai kembalian dari sebuah function (return) didalam block/scope if atau
//    when expression
//    Kotlin mendukung return if dan when dilakukan diluar block/scope dari expression tsb,
//    dimana fitur ini bisa mempermudah kita ketika ingin mengembalikan nilai didalam if atau when

    //    Contoh function return if
    fun sayHai(name: String = ""): String {
        return if (name == "") "Hello bro"
        else "Hello $name"
    }

    println(sayHai())
    println(sayHai("Bii"))


    //    Contoh function return when
    fun haiGuys(name: String=""):String{
        return when(name){
            "" -> "Hello Guys"
            else -> "Hello $name"
        }
    }

    println(haiGuys())
    println(haiGuys("Mii"))

}

//By Venonymous