import kotlin.math.pow
import kotlin.math.sqrt

fun opcoesCalculadora():Int {
    println("(1) Soma")
    println("(2) Subtrai")
    println("(3) Divide")
    println("(4) Multiplica")
    println("(5) Potencia")
    println("(6) Raiz Quadrada")
    println("(0) Sair")
    print("Insira: ")
    return readln().toInt()
}

fun somaNumeros():Double {
    print("Insira quantidade de numeros somados: ")
    var n = readln().toInt()

    var numeros = Array<Double>(n,{i->i.toDouble()})

    for(i in 0 until n){
        print("valor ${i+1}: ")
        numeros[i] = readln().toDouble()
    }
    var soma = 0.0

    for(i in 0 until n){
        soma += numeros[i]
    }

    return soma
}

fun subtraiNumeros(): Double {
    print("Insira quantidade de numeros subtraidos: ")
    var n = readln().toInt()

    var numeros = Array<Double>(n,{i->i.toDouble()})

    for(i in 0 until n){
        print("valor ${i+1}: ")
        numeros[i] = readln().toDouble()
    }
    var sub = 0.0

    for(i in 0 until n){
        if(i == 0){
            sub = numeros[0]
        } else{
            sub -= numeros[i]
        }
    }

    return sub
}

fun divideNumeros(): Double {
    var n1:Double; var n2:Double
    print("Insira o valor do dividendo: ")
    n1 = readln().toDouble()
    print("Insira o valor do divisor: ")
    n2 = readln().toDouble()

    return n1/n2
}

fun multiplicaNumeros(): Double {
    print("Insira quantidade de numeros multiplicados: ")
    var n = readln().toInt()

    var numeros = Array<Double>(n,{i->i.toDouble()})

    for(i in 0 until n){
        print("valor $i: ")
        numeros[i] = readln().toDouble()
    }
    var mult = 1.0

    for(i in 0 until n){
        mult *= numeros[i]
    }

    return mult
}

fun raizQuadrada(): Double {

    print("Insira o numero que quer saber a raiz: ")
    var n = readln().toDouble()

    return sqrt(n)
}

fun potencia(): Double {

    print("Insira qual numero quer saber a potencia: ")
    var n = readln().toDouble()

    print("Insira qual potencia quer descobrir: ")
    var x = readln().toInt()

    return n.pow(x)
}