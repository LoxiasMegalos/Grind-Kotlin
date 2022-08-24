package exercicioanimal

class Cavalo(
    nome:String,
    idade:Int
) : Animal(nome, idade), Correr
{

    override fun emitirSom():String {
        return "$nome relinchando como um cavalo, irraaa"
    }

    override fun correr(): String {
        return "Cavalo $nome galopando em um lindo pasto"
    }

    override fun toString(): String {
        return "Cavalo: $nome, Idade $idade"
    }
}