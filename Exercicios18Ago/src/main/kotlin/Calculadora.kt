fun main(){
    var resultado:Double = 0.0

    var operacao:String = ""
    var opcao = -1
    while(opcao != 0){

        opcao = opcoesCalculadora()

        when(opcao){
            1 -> {
                resultado = somaNumeros()
                operacao = "Soma"
            }
            2 -> {
                resultado = subtraiNumeros()
                operacao = "Subtracao"
            }
            3 -> {
                resultado = divideNumeros()
                operacao = "Divisao"
            }
            4 -> {
                resultado = multiplicaNumeros()
                operacao = "Multiplicacao"
            }
            5 -> {
                resultado = potencia()
                operacao = "Potenciação"
            }
            6 -> {
                resultado = raizQuadrada()
                operacao = "Raiz Quadrada"
            }
            0 -> {
                println("Saindo da calculadora...")
                continue
            }

        }

        println("O resultado da $operacao é: $resultado")
    }
}










