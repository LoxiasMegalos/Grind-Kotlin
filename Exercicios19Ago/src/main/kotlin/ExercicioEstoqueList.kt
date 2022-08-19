fun main(){
    //clear
    /*
    Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:

    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list.
     */

    while(true){

        println("(1) - Cadastrar um produto")
        println("(2) - Remover um produto")
        println("(3) - Atualizar um produto")
        println("(4) - Apresentar estoque")
        println("(0) - Sair")
        print("Selecione: ")

        when(readln().toInt()){
            1 -> {
                println("Cadastrando produtos!")
                print("Informe o nome do produto: ")
                val produto = readln()
                print("Informe a quantidade do produto: ")
                val quantidade = readln().toInt()
                print("Informe o valor unitário do produto: ")
                val valor = readln().toDouble()
                cadastraProdutoLista(produto, quantidade, valor)
            }
            2 -> {
                println("Removendo produtos!")
                print("Informe o nome do produto: ")
                val produto = readln()
                removeProdutoLista(produto)
            }
            3 -> {
                println("Atualizando produtos!")
                print("Informe o nome do produto: ")
                val produto = readln()
                atualizaProdutoLista(produto)
            }
            4 -> {
                println("Listando produtos: ")
                listaProdutosLista()
            }
            0 -> {
                println("Obrigado por utilizar!")
                break
            }
            else -> {
                println("Opção inválida")
            }
        }

    }

}







