package Pertemuan2

fun main() {
    val namaDepan: String = "Dinda"
    val namaBelakang = "Destriyani"
    val usia = 17

    println("Hallo nama saya $namaDepan $namaBelakang usia saya 17") // $ merupakan String Template

    //Nullable Type
    val text: String? = null  // null itu ga ada bukan kosong
    var textLength = text?.length
    println(textLength)


    //Char
    // -- ++
    var vocal = 'A' //A = 0041 B = 0042
    println("Vocal = " + vocal++ )
    println("Vocal = " + vocal++ )
    println("Vocal = " + vocal++ )
    println("Vocal = " + vocal-- )
    println("Vocal = " + vocal-- )
    println("Vocal = " + vocal-- )
    println("Vocal = " + vocal-- )


    val integerList = listOf(4,2,1,5,1,2)
    val integerSet = setOf(4,2,1,5,1,2)
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(integerList)
    println(integerList[4])
    println(integerSet)

    println(capital)
    println(capital["Jakarta"])

    val anyList = mutableListOf('A', "Kotlin",3,true, User())

    anyList.add('D')
    anyList.add( 0,12 )
    anyList[4]=false
    anyList.removeAt(4)

    println("MutableList = $anyList")

}

fun User(){
}
