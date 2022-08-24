package classesabstratas

class Cachorro (
    nomeCientifico:String,
    peso:Double,
    var som:String
) : Animal(nomeCientifico, peso)
{
    override fun informacao() {
        println("Sou um cachorro e faço $som")
    }

    override fun toString(): String {
        return "Cachorro: $nomeCientifico,\n" +
                "Peso: $peso,\n" +
                "Som emitido: $som"
    }

    fun abanarRabo(){
        println("Cachorro abanando rabinho")
    }
}