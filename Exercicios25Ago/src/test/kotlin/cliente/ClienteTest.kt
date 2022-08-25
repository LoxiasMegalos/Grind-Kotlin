package cliente

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class ClienteTest {

    val cliente = Cliente("Murillo", 123456789, "teste@g.com", "40028922")


    @BeforeEach
    fun adicionarNaLista(){
        cliente.addCompra("Batata")
        cliente.addCompra("Cenoura")
        cliente.addCompra("Couve")
    }

    @Test
    fun criarClienteTest(){

        var erroNomeVazio = false
        try{val cliente = Cliente("", 123456789, "teste@g.com", "40028922")}
        catch (e: Exception){
            erroNomeVazio = true
        }

        assertTrue(erroNomeVazio)

    }

    @Test
    fun addCompraTest() {


        assertEquals("Batata", cliente.listaCompras.get(0))
        assertEquals(3, cliente.listaCompras.size)

    }

    @Test
    fun removeCompraTest() {
        cliente.removeCompra("Batata")

        assertEquals(2, cliente.listaCompras.size)
        assertFalse(cliente.listaCompras.contains("Batata"))

    }
}