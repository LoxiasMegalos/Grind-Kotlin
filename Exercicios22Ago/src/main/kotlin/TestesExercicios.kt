import java.text.SimpleDateFormat
import java.util.*

fun main(){


    val cliente1 = Cliente("Murillo", 22, "murillo.teste@gmail.com", "40028922", true )
    val cliente2 = Cliente("Rillomu", 21, "teste@gmail.com", "40028921")

    Cliente.exibeOpcoes()

    cliente1.exibeInformacoes()

    cliente2.exibeInformacoes()
    cliente2.modificarEmail("lalala@hotmail.com")
    cliente2.exibeInformacoes()


    var boieng = Aviao(123, Date(), "azul")

    boieng.getDataDeRevisao()

    println(boieng.toString())

    val aviaoTesla = Aviao(999, Date(), "Branco e vermelho", true)

    println(aviaoTesla.toString())

    val patineteMurillo = Patinete("Caloi", "Borracha", "Azul", 100.0)
    val patineteEnzo= Patinete("Caloi", "Metal", "Vermelho", 250.0, true)

    patineteMurillo.exibeInformacoes()
    patineteEnzo.exibeInformacoes()

    println(patineteEnzo.pintarPatinete("Vermelho"))
    println(patineteMurillo.pintarPatinete("Preto"))

    println(patineteEnzo.mudarPreco(500.0))
    println(patineteMurillo.mudarPreco(90.0))

}