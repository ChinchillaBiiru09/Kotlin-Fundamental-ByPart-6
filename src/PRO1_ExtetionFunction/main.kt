package PRO1_ExtetionFunction

fun main() {
    // EXTENSION FUNCTION
//    => fitur dimana kita dapat membuat function tambahan pada tipe data yang sudah ada
//    Contoh tipe data = String, int, long, double, dll
//    Fitur ini sangat powerfull, dalam bahasa program lain, ini seperti meta programming
//    Penggunaan ext function ini harus hati2, karna jika terlalu banyak akan membuat program sulit
//    dimengerti/membingungkan, karna terlihat seperti magic(function yg tadinya tidak ada jadi
//    tiba2 muncul).
//    Cara membuat ext function cukup menggunakan .(ttk) setelah tipedata nya, lalu diikuti nama func nya
//    utk mengaskes datanya, bisa menggunakan kata kunci this

    val name : String = "Bii"

//    Cara memanggil/menggunakan ext function
    println(name.hello())
//    atau
    name.printHello()
//    atau
    "Bii".printHello()
}

// membuat extension function
fun String.hello(): String = "Hello $this"
// atau
fun String.printHello(): Unit = println("Hello $this")

//By Venonymous