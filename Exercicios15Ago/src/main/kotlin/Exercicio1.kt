import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.Year
import java.time.format.DateTimeFormatter
import java.util.Date

fun main(){
    //O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.

    print("Informe a sua idade: ")
    val idade = readln().toInt()

    print("Já fez aniversario esse ano? (sim) | (nao): ")
    val aniversario = readln()
    val nascimento:Int

    //val padrao = Regex("[0-9]{4}")
    //val resultado = padrao.findAll(Date().toString())
    //val verificacao = resultado.map{it.groupValues[0]}.joinToString().toInt()

    //var formataData = SimpleDateFormat("yyyy")
    //var anoAtual = formataData.format(SimpleDateFormat("yyyy")).toInt()

    var anoAtual = LocalDate.now().year

    if(aniversario == "sim"){
        nascimento = anoAtual - idade
    } else{
        nascimento = anoAtual - (idade+1)
    }

    println("Ano - $anoAtual : Idade - $idade : Nasceu em - $nascimento")

    //var ano = LocalDate.now().year
}