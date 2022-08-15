import java.text.DecimalFormat

fun main(){
    //Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele

    print("Digite um diâmetro em centimetros: ")
    val diametro = readln().toDouble()

    val pi = 3.14

    val dec = DecimalFormat("#,###.0000")


    println("A area do circulo eh de: ${dec.format(pi*((diametro/2)*(diametro/2)))}cm")
    println("O perimetro do circulo eh de: ${dec.format(2*pi*(diametro/2))}cm")
}