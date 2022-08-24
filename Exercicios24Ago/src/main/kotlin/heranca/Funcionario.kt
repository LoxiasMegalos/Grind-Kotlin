package heranca

class Funcionario(
    nome: String,
    cpf: String,
    idade:Int,
    val registro: Int
) : Pessoa(nome, cpf, idade)
{
    override fun correr(){
        println("Funcionario Correndo!")
    }

    private val piso = 1500.0
    private var salario = 0.0

    fun calcularSalario(bonus: Double){
        salario = piso + (bonus * piso)
    }

    fun getSalario() : Double{
        return salario
    }
}