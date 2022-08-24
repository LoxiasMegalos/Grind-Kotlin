package exercicioanimal

class Preguica(
    nome:String,
    idade:Int
) : Animal(nome, idade), EscalarArvores
{

    override fun emitirSom():String {
        return "$nome emitindo o som de uma preguiça, aaaaaa"
    }

    override fun subirEmArvores(): String {
        return "Preguiça $nome escalando em uma árvore alta!"
    }

    override fun toString(): String {
        return "Preguiça: $nome, Idade $idade"
    }
}