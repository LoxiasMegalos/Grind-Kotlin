package cliente

class Cliente(
    private var nome:String,
    private val cpf:Int,
    private var email:String,
    private var telefone:String
) {

    init{
        checarDados()
    }

    private fun checarDados() {
        if(nome == ""){
            throw Exception ("Erro ao criar um cliente com novo vazio")
        }
    }

    private val _listaCompras = mutableListOf<String>()
    val listaCompras: List<String> = _listaCompras

    fun getNome():String{
        return nome
    }

    override fun toString(): String {
        return "$nome, $cpf, $email, $telefone"
    }

    fun correr():String{
        return "$nome correndo!"
    }

    fun addCompra(compra: String){
        _listaCompras.add(compra)
    }

    fun removeCompra(compraR: String){
        for(compra in _listaCompras){
            if(compra == compraR){
                _listaCompras.remove(compra)
                break
            }
        }
    }

    fun listaCompras():String{
        var lista = ""
        for (compra in _listaCompras){
            lista += compra + " "
        }
        return lista
    }
}