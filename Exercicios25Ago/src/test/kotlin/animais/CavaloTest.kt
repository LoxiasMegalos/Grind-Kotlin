package animais

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CavaloTest {

    var jessie = Cavalo("Jessie", 10)

    @Test
    fun emitirSom() {
        assertEquals("Relinchando como um Cavalo!", jessie.emitirSom())
    }

    @Test
    fun correr() {
        assertEquals("Trotando loucamente" ,jessie.correr())
    }

    @Test
    fun toStringTest(){
        assertEquals("Animal Jessie, Idade 10 anos" ,jessie.toString())
    }

    @Test
    fun iniciaComNomeVazioTest(){

        var verifica = false

        try{
            var jessie = Cavalo("", 10)
        }catch (erro: Exception){
            verifica = true
        }

        assertTrue(verifica)
    }
}