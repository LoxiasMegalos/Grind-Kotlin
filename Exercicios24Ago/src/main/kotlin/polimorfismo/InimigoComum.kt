package polimorfismo

open class InimigoComum (){

    open fun reconhecimento(){
        println("Sou um inimigo comum!")
    }

    open fun identificacao(){
        println("Sou um personagem de um jogo")
    }

    override fun toString(): String {
        return "Nao retorno mais caracteres estranhos!"
    }
}