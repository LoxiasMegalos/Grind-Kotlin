import java.text.SimpleDateFormat
import java.util.*

fun main(){

    /*
    val cliente1 = Cliente("Murillo", 22, "murillo.teste@gmail.com", "40028922", true )
    val cliente2 = Cliente("Rillomu", 21, "teste@gmail.com", "40028921")

    Cliente.exibeOpcoes()

    cliente1.exibeInformacoes()

    cliente2.exibeInformacoes()
    cliente2.modificarEmail("lalala@hotmail.com")
    cliente2.exibeInformacoes()
    */



    var boieng = Aviao(123, Date(), "azul")

    boieng.getDataDeRevisao()

    println(boieng.toString())

    val aviaoTesla = Aviao(999, Date(), "Branco e vermelho", true)

    println(aviaoTesla.toString())
    
}