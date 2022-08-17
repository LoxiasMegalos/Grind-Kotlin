fun main(){

    var quantidadePares = 0
    var quantidadeImpares = 0

    for(i in 1..10){
        print("Digite o numero $i: ")
        val numero = readln().toInt()

        if(numero % 2 == 0){
            println("$numero é par")
            quantidadePares += 1
        } else{
            println("$numero é impar")
            quantidadeImpares += 1
        }

        print("Pares: $quantidadePares | Impares: $quantidadeImpares")
    }
}