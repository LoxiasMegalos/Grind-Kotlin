fun main(){

    println("Funcionamento do When!")
    print("Digite uma opcao: ")
    val opcao = readln().toInt()

    when(opcao){
        1 -> {
            println("Opcao 1")
        }
        2 -> {
            println("Opcao 2")
        }
        else -> {
            println("Nenhuma das anteriores, mas é valido")
        }
    }

    print("Digite um mes: ")
    val mes = readln().toInt()

    when(mes){
        in (1..3) -> {
            println("Quente")
        }
        in (4..6) -> {
            println("Meio Frio")
        }
        in (7..9) -> {
            println("Frio")
        }
        in (10..12) -> {
            println("Meio Quente")
        }
        else -> {
            println("Nenhuma das anteriores, mas é valido")
        }
    }

}