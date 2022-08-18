import kotlin.math.pow
import kotlin.math.sqrt

fun obrigadoPorJogar() {
    println("Obrigado por jogar!")
}

fun verifica_vida(i: Int) {

    if(i <= 0){
        println("Jogador morto")
    } else if(i <= 5){
        println("Personagem morrendo")
    } else if(i <= 9){
        println("Personagem ok")
    } else{
        println("Tudo certo!")
    }

}

fun aumentaVida( vida:Int, soma:Int):Int{
    var teste = vida
    var acrescenta = soma
    teste += acrescenta
    return teste
}

fun diminuiVida(vida: Int, soma: Int):Int{
    var vidaf = vida
    var somaf = soma
    vidaf -= somaf
    return vidaf
}

fun printarOi() {
    print("Oi ")
}

fun printarNomeMaiusculo(nome: String):String{
    //var nome = nome.uppercase()
    return nome.uppercase()
}

fun soma(n1: Int, n2: Int):Int{
    return n1 + n2
}

fun raisOuPotencia(num: Double): Double {
    return if(num < 0){
        num.pow(2)
    } else{
        sqrt(num)
    }
}