val nomesProdutos = mutableListOf<String>()
val quantidadesProdutos = mutableListOf<Int>()
val valoresUnitarios = mutableListOf<Double>()
val valoresTotais = mutableListOf<Double>()

fun cadastraProdutoLista(produto: String, quantidade: Int, valor: Double) {
    nomesProdutos.add(produto)
    quantidadesProdutos.add(quantidade)
    valoresUnitarios.add(valor)
    valoresTotais.add(valor*quantidade)

    println("$produto cadastrado com sucesso!")
}

fun removeProdutoLista(produto: String) {

    if(nomesProdutos.contains(produto)){
        var posicao = nomesProdutos.indexOf(produto)
        nomesProdutos.remove(produto)
        quantidadesProdutos.removeAt(posicao)
        valoresUnitarios.removeAt(posicao)
        valoresTotais.removeAt(posicao)
        println("$produto removido com sucesso!")
    } else{
        println("Produto nao encontrado no estoque!")
    }
}

fun atualizaProdutoLista(produto: String) {

    if(nomesProdutos.contains(produto)){
        var posicao = nomesProdutos.indexOf(produto)

        print("Modificar nome, (sim) (nao) :")
        var resp = readln()
        if(resp == "sim"){
            print("Infome o novo nome: ")
            val novoNome = readln()
            nomesProdutos[posicao] = novoNome
        }

        print("Modificar quantidade, (sim) (nao) :")
        resp = readln()
        if(resp == "sim"){
            print("Infome o novo nome: ")
            val novoQuant = readln().toInt()
            quantidadesProdutos[posicao] = novoQuant
        }

        print("Modificar preço unitario, (sim) (nao) :")
        resp = readln()
        if(resp == "sim"){
            print("Infome o novo preço: ")
            val novoPreco = readln().toDouble()
            valoresUnitarios[posicao] = novoPreco
            valoresTotais[posicao] = novoPreco * quantidadesProdutos[posicao]
        }

        println("$produto atualizado com sucesso!")
    } else{
        println("Produto nao encontrado no estoque!")
    }
}

fun listaProdutosLista() {
    for(i in 0 until nomesProdutos.size){
        println("Produto: ${nomesProdutos[i]} Quantidade: ${quantidadesProdutos[i]} " +
                "Valor unitário: ${valoresUnitarios[i]}R$ Total em estoque: ${valoresTotais[i]}R$")
    }
}