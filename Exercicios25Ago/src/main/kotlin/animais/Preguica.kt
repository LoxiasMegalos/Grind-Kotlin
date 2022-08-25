package animais

class Preguica (
    nome:String,
    idade:Int
): Animal(nome, idade), Escalar{

    override fun emitirSom(): String {
        return "O Som do Sid"
    }

    override fun escalar(): String {
        return "Escalando uma arvore!"
    }

}