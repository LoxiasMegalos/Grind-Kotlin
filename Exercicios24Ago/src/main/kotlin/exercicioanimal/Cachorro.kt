package exercicioanimal

class Cachorro(
    nome:String,
    idade:Int
) : Animal(nome, idade), Correr
{

    override fun emitirSom():String {
        return "$nome latindo como um cachorro, auaua"
    }

    override fun correr():String {
        return "Cachorro $nome correndo com a lingua pra fora!"
    }

    override fun toString(): String {
        return "Cachorro: $nome, Idade $idade"
    }
}