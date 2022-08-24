package polimorfismo

import kotlin.math.pow

fun main(){
    /*
    Sobrecarga de metodos, metodos com o mesmo nome, porém como parametros diferentes, que vao consequentemente
    executar outras funções

    Sobrescrista de metodos dentro de classes filhas
     */

    println(4.0.pow(0.5))

    var x = InimigoComum()
    x.reconhecimento()
    x.identificacao()

    var y = Goblin()
    y.reconhecimento()
    y.identificacao()

    println(x)
    println(y)

}

fun soma(n1:Int, n2:Int):Int{
    return n1 + n2
}

fun soma(n1:Double, n2:Double): Double{
    return n1+n2
}