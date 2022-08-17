fun main(){

    var quantidadeMultiploDe3 = 0.0
    var somaMultiplosDe3 = 0.0
    val mediaMultiplosDe3:Double

    do{
        print("Digite um numero: ")
        val digitado = readln().toInt()

        if(digitado % 3 == 0 && digitado != 0){
            quantidadeMultiploDe3 += 1
            somaMultiplosDe3 += digitado
        }

    }while(digitado != 0)

    mediaMultiplosDe3 = somaMultiplosDe3 / quantidadeMultiploDe3

    println("Multiplos de 3 digitados: $quantidadeMultiploDe3 | Media: ${"%.2f".format(mediaMultiplosDe3)}")

}