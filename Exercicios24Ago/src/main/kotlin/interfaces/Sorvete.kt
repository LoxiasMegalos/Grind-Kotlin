package interfaces

class Sorvete(
    nome:String,
    tempoDePreparo:Int,
    val sabor:String,
    override val temperaturaDeCongelamento: Int
):Comidas(nome, tempoDePreparo ),Congelamento {

    override fun iniciandoPreparo() {
        println("Fazendo um sorvetinho de $sabor")
    }

    override fun congelandoComida() {
        println("Congelando sorvetinho a $temperaturaDeCongelamento graus kelvin")
    }

}