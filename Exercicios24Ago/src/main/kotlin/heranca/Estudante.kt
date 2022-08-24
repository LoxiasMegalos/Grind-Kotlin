package heranca

class Estudante (
    nome:String,
    cpf:String,
    idade:Int,
    val ra: String
) : Pessoa(nome, cpf, idade){

    private var nota = 0.0

    constructor(
        nome: String,
        cpf: String,
        idade: Int,
        ra: String,
        notaInicial: Double
    ): this(nome, cpf, idade, ra){
        nota = notaInicial
    }

    fun alterarNota(valor: Double){
        if(valor in 0.0..10.0){
            nota = valor
            return
        }
        throw Exception ("Falha ao tentar atribuir nota menor que zero ou maior que 10")
    }

    fun getNota():String{
        return "$nome tirou, $nota na prova!"
    }
}