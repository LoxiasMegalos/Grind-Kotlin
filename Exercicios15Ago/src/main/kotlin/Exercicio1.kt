import java.util.Date

fun main(){
    //O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.

    print("Informe a sua idade: ")
    val idade = readln().toInt()

    print("Já fez aniversario esse ano? (sim) | (nao): ")
    val aniversario = readln()
    val nascimento:Int

    val padrao = Regex("[0-9]{4}")
    val resultado = padrao.findAll(Date().toString())
    val verificacao = resultado.map{it.groupValues[0]}.joinToString().toInt()

    if(aniversario == "sim"){
        nascimento = verificacao - idade
    } else{
        nascimento = verificacao - (idade+1)
    }

    println("Ano: $verificacao : Idade: $idade : Nasceu em: $nascimento")
}