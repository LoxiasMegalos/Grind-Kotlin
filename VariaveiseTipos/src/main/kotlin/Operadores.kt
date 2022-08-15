fun main(){

    var teste = Teste()
    teste.Teste("Testando")
    teste.imprima()
    println(teste)

    print("Informe o salario: ")
    val salario = readln().toDouble()

    print("Digite a porcentagem de aumento: ")
    val aumento = readln().toDouble()

    val salarioAumentado = salario * (1 + (aumento / 100))

    println("O aumento de $aumento% no salario do funcionario, ficaria: R$$salarioAumentado")
}

class Teste{
    var teste:String = ""

    fun Teste(teste:String){
        this.teste = teste
    }

    fun imprima(){
        println(teste)
    }
}