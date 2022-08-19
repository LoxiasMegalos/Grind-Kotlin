//val convidados = mutableListOf<String>()

fun main(){

    /*
    List - é um tipo que armazena diversos valores, com um tamanho variado

    List Imutável - Lista onde nao poderemos alterar os valores e nem o tamanho

    List Mutável - Lista onde poderemos alterar todos os valores e o tamanho
     */

    /*
    //List Imutável
    val nomes = listOf("Murillo", "Raissa", "Julia")

    //nomes[0] = "xtz" - Não eh permitido

    nomes.forEach(){
        println(it)
    }

    val convidados = mutableListOf<String>()
    */
    /*
    convidados.add("lalala")
    println(convidados)
    println("Tamanho da lista: ${convidados.size}")

    for(convidado in convidados){
        print("$convidado ")
    }
    */

    /*



    while(true){

        println("Digite um nome: ")
        var nome = readln()

        if(nome != ""){
            convidados.add(nome)
            continue
        }
        break
    }

    print("Exclua alguem: ")
    var z = readln() //remove o elemento mesmo, que foi digitado

    if(convidados.contains(z)){
        println("Removendo")
        convidados.remove(z)
    } else{
        println("Usuario nao existe na lista")
    }

    //convidados.removeAt(0)



    println("Digite o nome que quer atualizar: ")
    val atualiza = readln()

    if(convidados.contains(atualiza)){
        val posicao = convidados.indexOf(atualiza)
        print("Infome o novo nome do convidado: ")
        convidados[posicao] = readln()
        println("Convidado atualizado com sucesso!")
    }

    for(c in convidados){
        println(c)
    }
    */

    while(true){
        println("1 - adiciona")
        println("2 - remove")
        println("3 - atualiza")
        println("4 - exibe")
        println("0 - sair")

        print("Opção: ")
        when(readln().toInt()){
            1 -> addConvidados()
            2 -> removeConvidado()
            3 -> updateConvidado()
            4 -> exibeConvidados()
            0 -> {
                println("Obrigado por utilizar")
                break
            }
            else -> println("Opção Inválida")
        }
    }
}


