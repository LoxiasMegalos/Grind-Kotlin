fun main(){
    //Faça um programa que entre com três números e coloque em ordem crescente.

    println("Infome o primeiro numero: ")
    val n1 = readln().toInt()

    println("Infome o segundo numero: ")
    val n2 = readln().toInt()

    println("Infome o terceiro numero: ")
    val n3 = readln().toInt()

    if(n1 >= n2 && n2 >= n3){
        println("$n3 $n2 $n1")
    }else if( n1 >= n3 && n3 >= n2){
        println("$n2 $n3 $n1")
    } else if( n2 >= n1 && n1 >= n3){
        println("$n3 $n1 $n2")
    }else if( n2 >= n3 && n3 >= n1){
        println("$n1 $n3 $n2")
    }else if( n3 >= n1 && n1 >= n2){
        println("$n2 $n1 $n3")
    }else{
        println("$n1 $n2 $n3")
    }
}