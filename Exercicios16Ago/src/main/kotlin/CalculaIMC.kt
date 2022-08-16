import kotlin.math.pow

fun main(){

    println("BEM VINDO A CALCULADORA DE IMC!")
    print("Informe o seu peso: ")
    val peso = readln().toDouble()

    print("Informe sua altura: ")
    val altura = readln().toDouble()

    val imc = peso/altura.pow(2)
    println("IMC: ${"%.2f".format(imc)}")

    if(imc < 18.5){
        println("Abaixo do peso")
    } else if(imc in 18.5..24.9){
        println("Peso ideal")
    } else if(imc > 24.9 && imc <= 29.9){
        println("Levemente acima do peso")
    } else if(imc > 29.9 && imc <= 34.9){
        println("Obesidade grau I")
    } else if(imc > 34.9 && imc <= 39.9){
        println("Obesidade grau II")
    } else{
        println("Obesidade III")
    }


}