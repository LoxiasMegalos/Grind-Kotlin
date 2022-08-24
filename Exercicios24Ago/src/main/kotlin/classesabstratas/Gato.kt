package classesabstratas

class Gato(
    nomeCientifico:String,
    peso:Double,
    val som:String
) : Animal(nomeCientifico, peso) {

    override fun informacao() {
        println("Sou um gato e faço $som")
    }

    override fun toString(): String {
        return "Gatinho: $nomeCientifico,\n" +
                "Peso: $peso,\n" +
                "Som emitido: $som"
    }

    fun arranhar(){
        println("Gato arranhando")
    }
}