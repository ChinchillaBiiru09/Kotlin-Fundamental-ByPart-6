package PRO2_FunctionInfixNotation

fun main() {
    //FUNCTION INFIX NOTATION
//    infix notation => operasi yang biasa digunakan dalam operasi matematika, yaitu melakukan operasi
//    terhadap 2 data. hampir semua oprasi matematika adalah infix notation
//    Function infix notation => membuat function yang akan berfungsi seperti operator dalam operasi matematika(+-*/) yang digunakan
//    untuk mengoperasikan 2 buah data
//    Untuk menggunakan fun infix tidak wajib menggunakan tanda .(titik)

    //SYARAT MEMBUAT INFIX NOTATION
//    *Harus dibuat sebagai functoin member(materi OOP) atau function extension
//    *Harus memiliki 1 parameter
//    *Parameter tidak boleh varags atau tidak boleh memiliki nilai default

//    cara menggunakan infix notation -> data fun_infix data
    val result: String = "Bii" to "UP"
    print(result)

//    contoh lain yg sudah ada
    val number = 1000 downTo 1
//    bisa ditulis = 1000.downTo(1) -> tpi krn ini infix jdi tidak perlu ditulis seprti itu
}

//Contoh fun infix
infix fun String.to(value:String):String{
    if (value == "UP" || value == "Up" || value == "up"){
        return this.uppercase()
        //di JDK 16 sekarang jadi upparcase tok ya?? padahal dulu kaya punya java, toUpperCase() gitu
        //update an terbaru dari kotlin sepertinya.
    } else{
        return this.lowercase()
        //btw..pke toUpperCase atau toLowerCase masih bisa, cuma dicoret functionnya kek dibawah ini(silahkan di uncomment)
//        return this.toLowerCase()
    }
}

// By Venonymous