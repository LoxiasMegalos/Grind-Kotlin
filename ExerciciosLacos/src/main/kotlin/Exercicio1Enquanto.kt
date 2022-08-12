fun main(){

    var n = 0.0; var soma = 0.0; var quantidade = 0

    while(n >= 0){
        soma += n
        quantidade += 1

        println("Digite um numero: ")
        n = readln().toDouble()
    }
    var media = soma / quantidade
    println("Somatorio: $soma\nMédia: $media\nTotal de valores lidos: $quantidade")
}