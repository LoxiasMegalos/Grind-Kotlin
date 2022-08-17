fun main(){

    var soma = 0

    do{
        print("Digite um numero: ")
        val digitado = readln().toInt()

        soma += digitado

    }while(digitado != 0)

    println("Soma dos numeros digitados: $soma")
}