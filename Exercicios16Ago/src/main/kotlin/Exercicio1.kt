fun main(){

    //Faça um programa que receba três inteiros e diga qual deles é o maior.

    println("Infome o primeiro numero: ")
    val n1 = readln().toInt()

    println("Infome o segundo numero: ")
    val n2 = readln().toInt()

    println("Infome o terceiro numero: ")
    val n3 = readln().toInt()

    if(n1 > n2 && n1 > n3){
        println(n1)
    } else if( n2 > n1 && n2 > n3){
        println(n2)
    } else if( n3 > n1 && n3 > n2){
        println(n3)
    }
}