import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.BeforeTest

internal class CalculadoraTest{

    /*
    Assertions - Verifica se o teste retorna de fato o valor esperado.

    @Test - anotação que vai indicar que o método será um teste
     */
    var n1 = 10
    var n2 = 5

    @Test
    fun testaSoma(){
        assertEquals(15, Calculadora.soma(n1, n2))
    }

    @Test
    fun subtraiTest(){
        assertEquals(5, Calculadora.subtrai(n1,n2))
    }

    @Test
    fun multiplicaTest(){
        assertEquals(50, Calculadora.multiplica(n1,n2))
    }

    @Test
    fun divideTeste(){
        assertEquals(2, Calculadora.divide(n1,n2))
    }
}