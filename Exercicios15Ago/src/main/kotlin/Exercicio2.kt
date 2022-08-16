import java.lang.Math.*
import java.text.DecimalFormat
import java.text.Format
import kotlin.math.pow

fun main(){
    //Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele

    print("Digite um diâmetro em centimetros: ")
    val diametro = readln().toDouble()

    val pi = 3.14

    val piM = PI

    val dec = DecimalFormat("#,###.00")

    println("A area do circulo eh de: ${"%.2f".format(pi*((diametro/2)*(diametro/2)))}cm")
    println("O perimetro do circulo eh de: ${dec.format(2*pi*(diametro/2))}cm")

    println(piM)

    var valor = 2.0
    val n = 23
    println("Valor $valor elevado a $n = ${valor.pow(n)}")
}