package cliente

val listaClientes = mutableListOf<Cliente>()
fun main(){

    while(true){
        try{
            println("************************************************")
            println("Cadastrando clientes...")
            println("(1) - Adicionar Cliente")
            println("(2) - Remover")
            println("(3) - Atualizar")
            println("(4) - Listar Clientes e compras")
            println("(5) - Adicionar itens a listas de compras")
            println("(6) - Remover itens da lista de compras")
            println("(7) - Mostra o total de clientes")
            println("(0) - Sair")
            print("Selecione: ")
            val opcao = readln().toInt()
            println("************************************************")

            when(opcao){
                1 ->{
                    println("Adicionando Clientes!")
                    print("Informe o Nome: ")
                    val nome = readln()
                    print("Informe o Endereço: ")
                    val endereco = readln()
                    print("Informe o telefone: ")
                    val telefone = readln()

                    print("Informar idade? (sim) | (nao): ")
                    var informacao = readln()
                    var verificaMaioridade = false
                    if(informacao == "sim"){
                        print("Menor de 18? (true) | (false) ")
                        verificaMaioridade = readln().toBoolean()
                    }

                    var salario = -1.0
                    print("Informar salario? (sim) | (nao): ")
                    var informacaoSalario = readln()
                    if(informacaoSalario == "sim"){
                        print("Digite o salario: ")
                        salario = readln().toDouble()
                    }

                    if(verificaMaioridade && salario > 0.0){
                        val cliente = Cliente(nome, endereco, telefone, verificaMaioridade, salario)
                        listaClientes.add(cliente)

                    } else if(verificaMaioridade && salario < 0.0){
                        val cliente = Cliente(nome, endereco, telefone, verificaMaioridade)
                        listaClientes.add(cliente)

                    } else if(salario > 0 && !verificaMaioridade){
                        val cliente = Cliente(nome, endereco, telefone, verificaMaioridade, salario)
                        listaClientes.add(cliente)

                    } else{
                        val cliente = Cliente(nome, endereco, telefone)
                        listaClientes.add(cliente)
                    }

                }
                2 ->{
                    println("Removendo clientes...")
                    print("Informe o nome do cliente que quer remover: ")
                    var nomeaRemover = readln()

                    for(cliente in listaClientes){
                        if(nomeaRemover == cliente.getNome()){
                            listaClientes.remove(cliente)
                            println("${cliente.getNome()} removido com sucesso!")
                            break
                        }
                    }
                }
                3 ->{
                    println("Atualizando cadastro...")

                    print("Informe o nome do cliente que quer atualizar: ")
                    val buscaNome = readln()
                    for(cliente in listaClientes){
                        if(cliente.getNome() == buscaNome){

                            print("Modificar nome? (sim) | (nao) ")
                            val modificaNome = readln()
                            if(modificaNome == "sim"){
                                print("Informe novo nome: ")
                                val novoNome = readln()
                                cliente.setNome(novoNome)
                            }

                            print("Modificar Endereço? (sim) | (nao) ")
                            val modificaEndereco = readln()
                            if(modificaEndereco == "sim"){
                                print("Informe novo Endereço: ")
                                val novoEndereco = readln()
                                cliente.setEndereco(novoEndereco)
                            }

                            print("Modificar Telefone? (sim) | (nao) ")
                            val modificaTelefone = readln()
                            if(modificaTelefone == "sim"){
                                print("Informe novo telefone: ")
                                val novoTelefone = readln()
                                cliente.setTelefone(novoTelefone)
                            }

                        }
                    }

                }
                4 ->{
                    println("Listando...")
                    for(cliente in listaClientes){
                        println(cliente.toString())
                        print("Itens comprados: ")
                        println(cliente.listarCompras())
                    }
                }
                5 ->{
                    println("Adicionando item a lista de um cliente")
                    print("Informe o nome do cliente que quer adicionar itens a lista: ")
                    val buscaNome = readln()
                    for(cliente in listaClientes){
                        if(cliente.getNome() == buscaNome){
                            print("Informe o item que deseja adicionar: ")
                            val itemAdicionar = readln()
                            cliente.adicionaCompras(itemAdicionar)
                            break
                        }
                    }

                }
                6 ->{
                    println("Removendo item a lista de um cliente")
                    print("Informe o nome do cliente que quer remover itens da lista: ")
                    val buscaNome = readln()
                    for(cliente in listaClientes){
                        if(cliente.getNome() == buscaNome){
                            print("Informe o item que deseja remover: ")
                            val itemRemover = readln()
                            cliente.removeItemComprado(itemRemover)
                            break
                        }
                    }
                }
                7 ->{
                    println("Verificando a quantidade de clientes criados!")
                    println(Cliente.getClientesCadastrados())
                }
                0 ->{
                    println("Obrigado por utilizar! ")
                    break
                }
            }

        } catch (e:Exception){
            println(e.message)
        }
    }

}