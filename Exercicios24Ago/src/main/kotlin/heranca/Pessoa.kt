package heranca

open class Pessoa (
    var nome: String,
    val cpf: String,
    var idade: Int
    ) {
    var corDaPele = "Não especificado"
    var corDoCabelo = "Não Especificado"


    open fun correr(){
        println("Correndo!")
    }

    fun andar(){
        println("Andando!")
    }
}