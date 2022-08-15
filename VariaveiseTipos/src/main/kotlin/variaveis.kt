import java.util.Scanner

fun main(){
    // declaração identificador: Tipo = valor
    var idade: Int = 0

    var array:Array<Int> = Array(4, {i -> i})

    for(numero in 0 until array.size){
        array[numero] = 10
    }

    for(numero in 0 until array.size){
        print("" + array[numero] + " ")
    }

    var matriz = Array(3) {IntArray(4)}

    for( i in 0 until matriz.size){
        for( j in 0 until 4){
            matriz[i][j] = 0
        }
    }

    for( i in 0 until matriz.size){
        for( j in 0 until 4){
            print("${matriz[i][j]} ")
        }
        println()
    }

    var ferrari = Carro("Ferrari Vermelha", 300.0, 2000)
    println(ferrari.modelo)

    var mercedes = ferrari.copy()
    println(mercedes.modelo)

    var astonMartin = mercedes.copy("Mercedes Verde")

    println("${astonMartin.modelo} : ${astonMartin.velocidadeMaxima}")

    var redBull = astonMartin.copy(modelo = "redBull rapida", anoDeFabricacao = 2021, velocidadeMaxima = 315.0)

    println("${redBull.modelo} : ${redBull.velocidadeMaxima} : ${redBull.anoDeFabricacao}")

    val teclado = Scanner(System.`in`)
    print("Informe seu nome: ")
    val nome = teclado.next()

    print("Informe sua idade: ")
    val anosDeVida = teclado.nextInt()

    print("$nome : $anosDeVida\n")

    print("Informe o teste: ")
    val teste = readLine()!!
    println(teste.uppercase())


    var coelho = Animal()
    coelho.Animal("Coelho", 10)
    println(coelho.impressaoFomatada())

    print("lalalala: ")
    var lalala = readln()

    println(lalala.uppercase().lowercase())

}

data class Carro(
    var modelo: String,
    var velocidadeMaxima: Double,
    var anoDeFabricacao: Int
)

class Animal{
    var nome: String = ""
    var expectativaDeVida: Int = 0

    fun Animal(n:String, anos:Int){
        nome = n
        expectativaDeVida = anos
    }

    fun impressaoFomatada(): String {
        return "O $nome tem uma expectativa de vida de $expectativaDeVida anos!"
    }
}