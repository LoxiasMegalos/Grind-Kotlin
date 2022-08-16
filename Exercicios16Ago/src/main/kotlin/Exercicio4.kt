import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
     /*
     Faça um programa em que permita a entrada de um número qualquer e exiba se este
     número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
     ímpar exiba o número elevado ao quadrado.
      */
     print("Informe um numero: ")
     val numero = readln().toInt()

     if(numero % 2 != 0){
         println("$numero : ${numero*numero}")
     } else{
         val numeroDouble = numero.toDouble()
         if(numeroDouble >= 0){
             println("$numero : ${"%.2f".format(sqrt(numeroDouble))}")
         } else{
             println("$numero : ${"%.2f".format((-1 * numeroDouble).pow(0.5))}")
         }

     }
 }