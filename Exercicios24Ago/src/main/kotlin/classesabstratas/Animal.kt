package classesabstratas

abstract class Animal(
    var nomeCientifico:String,
    val peso: Double
) {

    abstract fun informacao();

    fun reconhece(){
        println("Somos todos animais!")
    }

}