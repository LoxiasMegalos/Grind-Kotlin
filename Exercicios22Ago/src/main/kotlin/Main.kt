var contas = mutableListOf<ContaBanco>()

fun main(args: Array<String>) {
    println("Programação Orientada a objetos")

    var meg = Cachorro("Border Collie", "Meg")
    println(meg.toString())

    var pessoinha = Pessoa()
    println("$pessoinha")
    println("${pessoinha.nome}")
    pessoinha.nome = "Murillo"
    println("${pessoinha.nome}")
    pessoinha.definirSexo("Masculino")
    println("${pessoinha.sexo}")

    val contaDoMurillo = ContaBanco("Murillo", "Sp123", 12345, 900.0, true, 1000.0)

    println("${contaDoMurillo.agencia}")

    contaDoMurillo.saque(800.0)
    contaDoMurillo.consultarSaldo()
    contaDoMurillo.saque(9000.0)
    contaDoMurillo.consultarSaldo()

    contaDoMurillo.deposita(1000.0)
    contaDoMurillo.consultarSaldo()

    val contaDaRaissa = ContaBanco("Raissa", "Sp123", 12344, 900.0)

    contaDoMurillo.transfere(3000.0, contaDaRaissa)
    contaDaRaissa.consultarSaldo()
    contaDoMurillo.transfere(300.0, contaDaRaissa)
    //contaDoMurillo.consultarSaldo()
    //contaDaRaissa.consultarSaldo()

    contas.add(contaDoMurillo)
    contas.add(contaDaRaissa)

    for(conta in contas){
        conta.consultarSaldo()
    }

    val contaDaJulia = ContaBanco("Julia", "Sp123", 12343, 500.0, true)
    println("${contaDaJulia.limite} : ${contaDaJulia.saldoLimite}")

    val contaDaEdna = ContaBanco("Edna", "Sp123", 12342, 300.0, true, 50000.0)
    println("${contaDaEdna.limite} : ${contaDaEdna.saldoLimite}")
}