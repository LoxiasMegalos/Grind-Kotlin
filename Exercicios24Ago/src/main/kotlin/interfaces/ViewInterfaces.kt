package interfaces

fun main(){
    println("Interfaces - Contratos para classes!")

    val arroz = ArrozDeForno("Arroz da mamae", 60, "Amor", 500)

    println(arroz is Comidas)

    println(arroz)
    arroz.cozinhando()
    arroz.iniciandoPreparo()


    val sorveteDeMenta = Sorvete("Sorvete da sorveteria", 120, "Menta", -20)
    println(sorveteDeMenta is Comidas)
    println(sorveteDeMenta)
    sorveteDeMenta.iniciandoPreparo()
    sorveteDeMenta.congelandoComida()
}