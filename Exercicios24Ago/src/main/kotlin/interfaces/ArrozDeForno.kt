package interfaces

class ArrozDeForno(
    nome:String,
    tempoDePreparo:Int,
    temperoEspecial:String,
    override val temperaturaFogo: Int
) : Comidas(nome, tempoDePreparo), FogoAlto {

    override fun iniciandoPreparo() {
        println("Preparando um delicioso arroz de forno")
    }

    override fun cozinhando() {
        println("Cozinhando um arroz de forno a $temperaturaFogo graus fahrenheit")
    }
}