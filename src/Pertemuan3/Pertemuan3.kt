package Pertemuan3

fun main() {

    // operator aritmatika
    val plus = 5 + 5
    val minus = 5 - 5
    val kali = 5 * 5
    val bagi = 5 / 5
    val mod = 5 % 5

    println(" 5 + 5 = $plus")
    println(" 5 - 5 = $minus")
    println(" 5 * 5 = $kali")
    println(" 5 / 5 = $bagi")
    println(" 5 % 5 = $mod")

    // operator perbandingan
    val a = 10
    val b = 5

    val lebihdari = a > b
    val kurangdari = a < b
    val lebihdariSamadengan = a >= b
    val kurangdariSamadengan = a <= b
    val samadengan = a == b
    val tidakSamadengan = a != b

    println(lebihdari)
    println(kurangdari)
    println(lebihdariSamadengan)
    println(kurangdariSamadengan)
    println(samadengan)
    println(tidakSamadengan)

    // operator logika
    val and = 10 >= 10 && 12 > 11 // dua steatment harus true (konjungsi)
    println(and)
    val or = 10 > 10 || 12 > 11 // salah satu dari 2 steatment harus true (disjungsi)
    println(or)
    val negasi = !true // kebalikan (negasi)
    println(negasi)

}