fun main(){
    var estacoes:Array<String> = arrayOf("Verao","Primavera","Outono","Inverno")

    var infoEstacoes:Array<String> = arrayOf("Quente","Meio Quente","Meio Frio","Frio")

    var opcao = -1

    while(opcao != 0){
        println("Saiba mais sobre:\n(1) Verao\n(2) Primavera\n(3) Outono\n(4) Inverno\n(0) Sair")
        opcao = readln().toInt()

        when(opcao){
            1 ->{
                println(estacoes[0]+" "+infoEstacoes[0])
            }
            2 ->{
                println(estacoes[1]+" "+infoEstacoes[1])
            }
            3 ->{
                println(estacoes[2]+" "+infoEstacoes[2])
            }
            4 ->{
                println(estacoes[3]+" "+infoEstacoes[3])
            }
            0 -> {
                println("Obrigado")
            }
        }
    }
}

