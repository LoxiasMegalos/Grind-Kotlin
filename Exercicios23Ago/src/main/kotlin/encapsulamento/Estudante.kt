package encapsulamento

class Estudante(var nome:String, val ra: Int) {

    private var nota = 0.0
    private val listaMaterias = mutableListOf<String>()

    //Init executa na hora da istanciação
    init{
        checarDados()
    }


    fun quantidadeDeMaterias():String{
        val quantidade = listaMaterias.size
        return "O aluno $nome, ra: $ra está matriculado em $quantidade matérias"
    }

    fun alterarNota(valor:Double){
        if(valor >= 0 && valor <= 10){
            nota = valor
            println("Nota alterada com sucesso")
            return
        }
        println("Nota Inválida")
        return
    }


    fun checarDados(){
        if(nome == "" && ra <= 1000){
            throw Exception("Estudante Invalido")
        }
    }
}