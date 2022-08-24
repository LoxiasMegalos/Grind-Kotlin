package classesabstratas

fun main(){

    println("Classes abstratas")

    //var animalTeste = Animal("Nome de um animal", 10.0) - Nao é permitido por conta que Animal é uma classe abstrata

    var meg = Cachorro("Canis Fofis", 20.0, "AUAUAUAU")

    var teo = Gato("Felino Dormis", 5.0, "miuauuu")

    println(meg)

    meg.informacao()

    println(teo)

    teo.informacao()

    meg.reconhece()
    teo.reconhece()

    println(teo is Animal)
}