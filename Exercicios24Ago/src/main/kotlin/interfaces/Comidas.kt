package interfaces

abstract class Comidas(
    val nome:String,
    val tempoDePreparo:Int
) {

    abstract fun iniciandoPreparo()

    override fun toString(): String {
        return "Comida: $nome, tempo de preparação: $tempoDePreparo minutos"
    }
}