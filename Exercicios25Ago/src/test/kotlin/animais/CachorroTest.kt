package animais

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll

internal class CachorroTest {

   var meg = Cachorro("Meg", 10)

    @Test
    fun emitirSom() {
        assertEquals("Latindo como uma cachorro!", meg.emitirSom())
    }

    @Test
    fun correr() {
        assertEquals("Correndo com a lingua pra fora" ,meg.correr())
    }

    @Test
    fun toStringTest(){
        assertEquals("Animal Meg, Idade 10 anos" ,meg.toString())
    }

    @Test
    fun iniciaComNomeVazioTest(){

        var verifica = false

        try{
            var cachorro = Cachorro("", 10)
        }catch (erro: Exception){
            verifica = true
        }

        assertTrue(verifica)
    }
}