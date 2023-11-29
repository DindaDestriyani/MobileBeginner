package Pertemuan3

fun main() {
    for (i in 1..5){ // .. enter buat kurang dari sama dengan, downTo buat nurunin/lebih dari sama dengan (misal dari 10 ke 5)
        println("nilai = $i")
    }

    val cars = arrayOf("volvo","BMW","ford","Mazda")
    for (x in cars){
        println(x)
    }

    var i = 0
    while (i < 5){
        println("nilai $i")
        i++
    }

    var percobaan = 1
    do {
        println("buka pintu - percobaan ke $percobaan")
        percobaan++
    }while (percobaan < 5)
}