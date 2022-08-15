import java.util.Date

fun main(){
    //O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.

    print("Informe a sua idade: ")
    val idade = readln().toInt()

    print("Já fez aniversario esse ano? (sim) | (nao): ")
    val aniversario = readln()

    val nascimento:Int

    if(aniversario == "sim"){
        nascimento = 2022 - idade
    } else{
        nascimento = 2022 - (idade+1)
    }

    println("Idade: $idade : Nasceu em: $nascimento")
}