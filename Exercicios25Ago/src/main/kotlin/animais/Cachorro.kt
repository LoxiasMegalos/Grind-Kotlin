package animais

class Cachorro (
    nome:String,
    idade:Int
): Animal(nome, idade), Correr{

    override fun emitirSom(): String {
        return "Latindo como uma cachorro!"
    }

    override fun correr(): String {
        return "Correndo com a lingua pra fora"
    }

}