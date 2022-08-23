import companionobjects.Calculadora
import companionobjects.Estoque
import encapsulamento.Estudante

fun main(args: Array<String>) {

    println("Companion Objects")
    println("Objetos Anônimos")
    println("Encapsulamento")
    println("Exceção")

    println(Estoque)
    Estoque.addProdutos("Bala")
    Estoque.addProdutos("Legumes")
    Estoque.addProdutos("Sorvete")

    Estoque.exibirProdutos()
    println(Calculadora())
    println(Calculadora.soma(1,99))

    val murilloAluno = Estudante("Murillo", 243334)
    println(murilloAluno.quantidadeDeMaterias())

    murilloAluno.alterarNota(-5.5)
    murilloAluno.alterarNota(7.0)

    /*
    Tratamento de erros Try Catch

    try{
        Bloco que o prog tentará executar
    } catch(variavel: erroEsperado){
        Tratar o erro capturado
    }

     */

    try{
        val num = 10/0
    }catch (e: ArithmeticException){
        println("Não pode dividir por zero")

    }



    while(true){
        try{
            val num = readln().toInt()
            break
        } catch (erro: Exception){
            println(erro.message)
        }
    }

    /*
    Jogar exceções no programa

    throw Exception(mensagem do erro)
     */

    //throw Exception("O código deu erro pq sim")

    val raissaEstudante = Estudante("",1)

}