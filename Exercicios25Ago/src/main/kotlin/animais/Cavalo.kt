package animais

class Cavalo (
    nome:String,
    idade:Int
): Animal(nome, idade), Correr{

    override fun emitirSom(): String {
        return "Relinchando como um Cavalo!"
    }

    override fun correr(): String {
        return "Trotando loucamente"
    }

}