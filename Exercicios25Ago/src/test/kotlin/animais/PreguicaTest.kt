package animais

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PreguicaTest {

    var sid = Preguica("Sid", 10)

    @Test
    fun emitirSom() {
        assertEquals("O Som do Sid", sid.emitirSom())
    }

    @Test
    fun correr() {
        assertEquals("Escalando uma arvore!" ,sid.escalar())
    }

    @Test
    fun toStringTest(){
        assertEquals("Animal Sid, Idade 10 anos" ,sid.toString())
    }

    @Test
    fun iniciaComNomeVazioTest(){

        var verifica = false

        try{
            var sid = Preguica("", 10)
        }catch (erro: Exception){
            verifica = true
        }

        assertTrue(verifica)
    }
}