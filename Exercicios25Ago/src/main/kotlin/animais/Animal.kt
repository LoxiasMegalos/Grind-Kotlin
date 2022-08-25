package animais

abstract class Animal(
    private var nome: String,
    private var idade: Int
) {

    abstract fun emitirSom():String

     override fun toString(): String {
        return "Animal $nome, Idade $idade anos"
    }

    init{
        if(nome.isBlank()){
            throw Exception ("O nome não pode ser vazio!")
        }
    }
}