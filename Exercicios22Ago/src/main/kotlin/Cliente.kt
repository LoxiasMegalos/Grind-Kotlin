class Cliente (
    var nome:String,
    var idade:Int,
    var email:String,
    var telefone:String
        )
{

    var comprador = false

    constructor(
        nome:String,
        idade:Int,
        email:String,
        telefone:String,
        comprador:Boolean
    ):this(nome, idade, email, telefone){
        this.comprador = comprador
        println("Criando um novo cliente comprador")
    }

    fun modificarEmail(novoEmail:String){
        email = novoEmail
    }

    fun exibeInformacoes(){
        println("Cliente: $nome")
        println("Idade: $idade")
        println("E-mail: $email")
        println("Telefone: $telefone")
        println("Comprador: $comprador")
    }

    companion object{
        fun exibeOpcoes(){
            println("Cria clientes e consulta nome, idade, email, telefone e se já comprou conosco")
        }
    }

}