fun main(args: Array<String>) {
    println("Funções")

    /*
    Funções - blocos de códigos capazes de serem chamados em diversos pontos do programa

    Funções com retorno - retorno de valor após a chamada de uma função, que pode ser armazenado em outro variavel

    Funções sem retorno - fazem um cálculo especifico ou realizam algum tipo de saída.
     */
    /*
    //Exemplo de função sem retorno:
    println("Printando na tela...")

    //Exemplo de função com retorno:
    var x = 1
    println(x)
    x = x.inc()
    println(x)

    print("Digite: ")
    var z = readln().toInt()

     */

    //Declarando as nossas proprias funções
    var opcao = -1
    var vida = 10
    var soma = 0
    while(opcao != 0){

        print("Ganhou ou perdeu vida? (1) (0): ")
        val escolha = readln().toInt()

        if(escolha == 1){
            print("Insira a vida ganha: ")
            soma = readln().toInt()
            vida = aumentaVida(vida, soma)
        }
        if(escolha == 0){
            print("Insira a vida perdida: ")
            soma = readln().toInt()
            vida = diminuiVida(vida, soma)
        }
        println("A vida dessa rodada eh: $vida")
        verifica_vida(vida)

        print("Continuar? (1) sim (0) nao: ")
        opcao = readln().toInt()

        if(opcao == 0){
            obrigadoPorJogar()
        }
    }


    for(i in 1..10){
        printarOi()
    }
    println()

    var n = "murillo"
    n = printarNomeMaiusculo(n)
    println(n)

    var a = 5
    var b = 3

    var somatoria = soma(a,b)
    println(somatoria)

    var num = -10.0
    num = raisOuPotencia(num)
    println(num)
}





