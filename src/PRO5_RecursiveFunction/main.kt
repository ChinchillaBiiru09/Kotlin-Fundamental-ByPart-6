package PRO5_RecursiveFunction

fun main() {
    //RECURSIVE FUNCTION
//    => function yang memanggil dirinya sendiri, cara kerjanya akan seperti looping
//    namun dalam bentuk function
//    Terkadang dalam suatu project, menggunakan recursive function lebih mudah
//    daripada menggunakan looping
//    Contoh penggunaannya adalah dalam program menghitung factorial

    //    Contoh program factorial dengan looping
    fun factorialLoop(numb:Int):Int{
        var result = 1
        for (i in numb downTo 1){
            result *= i
        }
        return result
    }

    val facLoop = factorialLoop(5)
    println("Program Factorial dengan Loop = $facLoop")


    //    Contoh program factorial dengan recursive
    fun factorialRecursive(number: Int):Int{
        return when (number){
            1 -> 1
            else -> number * factorialRecursive(number - 1) //-> simbol disamping number-line adalah simbol untuk recursive call
        }
    }

    val facRec = factorialRecursive(5)
    println("Program Factorial dengan Recursive = $facRec")
}

//By Venonymous