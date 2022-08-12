fun main(){
    println("Teste de funcionamento")
    println(Teste.teste())
    var user1 = User("Murillo", 22)
    println(user1.nome)

    var y = Teste2()

    y.x = "Murillo"
    y.B()
}

open class Teste{
    var x: String = ""

    companion object {
        fun teste() : String = "Teste"
    }
}

class Teste2 : Teste(){
    fun B(){
        println(x)
        println("Teste Herdado")
    }
}

data class User(
    val nome: String,
    val idade: Int
)