package exercicioanimal

abstract class Animal(
    protected val nome:String,
    protected var idade:Int
) {

    abstract fun emitirSom(): String

    fun recebeNome():String{
        return nome
    }
}