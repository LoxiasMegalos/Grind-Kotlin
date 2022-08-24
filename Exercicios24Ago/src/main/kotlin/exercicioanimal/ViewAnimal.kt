package exercicioanimal

var zoologico = mutableListOf<Animal>()

fun main(){

    while(true) {
        try {
            while (true) {
                println("**********************")
                println("(1) - Adicionar animal")
                println("(2) - Listar animais")
                println("(3) - Realizar ações")
                println("(4) - Emitir Sons")
                println("(5) - Remover do Zoologico")
                println("(0) - Sair")
                print("Escolha: ")

                when (readln().toInt()) {
                    1 -> {
                        var bicho: Animal

                        print("Informe o nome do animal: ")
                        val nome = readln()
                        print("Informe a idade do animal: ")
                        val idade = readln().toInt()
                        print("Informe o tipo de animal (Cachorro), (Cavalo), (Preguiça): ")
                        val escolha = readln().lowercase()

                        if (escolha == "cachorro") {
                            bicho = Cachorro(nome, idade)
                        } else if (escolha == "cavalo") {
                            bicho = Cavalo(nome, idade)
                        } else if (escolha == "preguiça") {
                            bicho = Preguica(nome, idade)
                        } else {
                            throw Exception("Escolha inválida!")
                        }
                        zoologico.add(bicho)
                    }
                    2 -> {
                        for (animal in zoologico) {
                            println(animal.toString())
                        }
                    }
                    3 -> {
                        for (animal in zoologico) {
                            if (animal is Correr) {
                                println(animal.correr())
                            } else if (animal is EscalarArvores) {
                                println(animal.subirEmArvores())
                            }
                        }
                    }
                    4 -> {
                        for (animal in zoologico) {
                            println(animal.emitirSom())
                        }
                    }
                    5 -> {
                        print("Informe o nome do animal que quer remover: ")
                        val nomeRemover = readln()

                        for (animal in zoologico) {
                            if (nomeRemover == animal.recebeNome()) {
                                zoologico.remove(animal)
                                println("$nomeRemover removido do Zoológico!")
                                break
                            }
                        }
                    }
                    0 -> {
                        println("Obrigado por utilizar!")
                        break
                    }
                    else -> {
                        println("Opção Inválida, preste atenção!")
                    }
                }
            }
        break
        } catch (e: Exception) {
            println(e.message)
        }
    }
}