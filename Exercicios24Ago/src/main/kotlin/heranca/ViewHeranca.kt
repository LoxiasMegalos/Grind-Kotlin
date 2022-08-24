package heranca

fun main(){

    var pessoa = Pessoa("Murillo", "123", 22)
    pessoa.correr()

    var func = Funcionario("Raissa", "999", 23, 314)

    func.correr()
    func.calcularSalario(2.0)
    println("O salario de ${func.nome} é: ${func.getSalario()}R$")

    var estudante = Estudante("Julia", "489123124", 18, "24334", 7.0)
    println(estudante.getNota())

    estudante.alterarNota(10.0)
    println(estudante.getNota())

    try{
        estudante.alterarNota(-5.0)
    } catch ( e: Exception){
        println(e.message)
    }

}