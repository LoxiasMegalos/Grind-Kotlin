package cliente

class Cliente (
    private var nome:String,
    private var endereco:String,
    private var telefone:String,

    )
{
    private var menorDeIdade = false
    private var salario = 0.0
    private var itensComprados = mutableListOf<String>()

    constructor(
        nome: String,
        endereco: String,
        telefone: String,
        menorDeIdade: Boolean
    ):this(nome, endereco, telefone){
        this.menorDeIdade = menorDeIdade
    }

    constructor(
        nome: String,
        endereco: String,
        telefone: String,
        menorDeIdade: Boolean,
        salario: Double
    ):this(nome, endereco, telefone, menorDeIdade){
        this.salario = salario
    }

    init{
        validaInicio()
    }

    private fun validaInicio(){
        if(nome == ""){
            throw Exception ("Cliente não cadastrado, nome não pode ser vazio")
        }
    }

    fun adicionaCompras(item:String){
        if(item == ""){
            throw Exception("Nome inválido para item")
        }
        itensComprados.add(item)
    }

    fun removeItemComprado(item:String){
        for(compra in itensComprados){
            if(compra == item){
                itensComprados.remove(item)
                println("$item removido com sucesso da sua lista")
                break
            }
        }
    }

    fun listarCompras(): String {

        var itens = ""

        for (item in itensComprados) {
            itens += item
            itens += " "
        }

        if(itens != ""){
            return itens
        }

        return "Nenhum item foi adicionado ainda"
    }
    override fun toString(): String {

        if(menorDeIdade && salario > 0){
            return "Cliente: $nome\nEndereço: $endereco\nTelefone: $telefone\nCliente Menor de Idade\nSalario: $salario"
        } else if(menorDeIdade){
            return  "Cliente: $nome\nEndereço: $endereco\nTelefone: $telefone\nCliente Menor de Idade"
        } else if(salario > 0){
            return "Cliente: $nome\nEndereço: $endereco\nTelefone: $telefone\nCliente Maior de Idade\nSalario: $salario"
        }
        return return "Cliente: $nome\nEndereço: $endereco\nTelefone: $telefone"
    }

    fun getNome():String{
        return nome
    }

    fun setNome(novoNome:String){
        nome = novoNome
    }
    fun setEndereco(novoEndereco:String){
        endereco = novoEndereco
    }
    fun setTelefone(novoTel:String){
        telefone = novoTel
    }
}