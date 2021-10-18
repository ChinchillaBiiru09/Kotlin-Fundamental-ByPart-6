package PRO3_FunctionScope

fun satu(){
    println("Ini Function Satu")

//    dua() -> Error anjing! Dah tau error masih dicoba aja.
}

fun main() {
    //FUNCTION SCOPE
//    => ruang lingkup dimana function bisa diakses..(kalo versiku kawasan sebuah function yg ditandai {})
//    Saat membuat function yang sejajar dengan function main, maka secara otomatis func tsb
//    dapat di akses dari file kotlin mana pun
//    Untuk membatasi func tsb hanya bisa diakses dalam func tertentu. Maka kita bisa membuat
//    func didalam func (inner func).
//    Dikotlin func itu seperti first-class citizen, tidak sperti java yang func-nya harus
//    dibuat didalam class

    //Contoh inner func
    fun dua(){
        println("Ini Function Dua")
        satu() // -> tidak error
    }

    satu() // -> tidak error. func ini seperti func global dan func dua seperti func local
    println("========================================")
    dua() // -> tidak error juga..why?? kan func dua dalemnya scope func main tolol!
}

//By Venonymous