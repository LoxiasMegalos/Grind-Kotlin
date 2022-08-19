val convidados = mutableListOf<String>()
fun addConvidados(){
    while(true){
        println("Digite um nome: ")
        var nome = readln()

        if(nome != ""){
            convidados.add(nome)
            continue
        }
        break
    }
}

fun removeConvidado(){
    while(true){
        print("Exclua alguem: ")
        var z = readln() //remove o elemento mesmo, que foi digitado

        if(convidados.contains(z)){
            println("Removendo")
            convidados.remove(z)
        } else{
            println("Usuario nao existe na lista")
        }

        print("Continuar removendo? ")
        val continua = readln()

        if(continua == ""){
            break
        }
    }
}

fun updateConvidado(){
    while(true){
        println("Digite um nome para atualizar: ")
        val nome = readln()
        if(convidados.contains(nome)){
            val posicao = convidados.indexOf(nome)
            print("Infome o novo nome do convidado: ")
            convidados[posicao] = readln()
            println("Convidado atualizado com sucesso!")
        }
        print("Continuar atualizando? ")
        val continua = readln()

        if(continua == ""){
            break
        }
    }
}

fun exibeConvidados(){
    for(convidado in convidados){
        print("$convidado ")
    }
    println()
}