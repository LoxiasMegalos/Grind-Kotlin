class ContaBanco (
    var titular: String,
    var agencia: String,
    var conta: Int,
    var saldo:Double
        )
{

    var limite = false
    var saldoLimite = 0.0

    //Construtor Secundario

    constructor(
        titular: String,
        agencia: String,
        conta: Int,
        saldo: Double,
        limite: Boolean,
    ): this (titular, agencia, conta, saldo) {
        this.limite = limite;
    }

    constructor(
        titular: String,
        agencia: String,
        conta: Int,
        saldo: Double,
        limite: Boolean,
        saldoLimite: Double
    ): this(titular, agencia, conta, saldo, limite){
        this.saldoLimite = saldoLimite
    }

    //Atributos - nome, agencia, conta, saldo
    //Métodos - consultar saldo, sacar, depositar

    fun consultarSaldo(){
        println("O saldo da conta $conta é $saldo R$")
    }

    fun saque(valor:Double){
        if(saldo - valor >= 0){
            println("Saque bem sucedido!")
            saldo -= valor
            return
        }
        println("Saque nao realizado!")
    }

    fun deposita(valor:Double){
        if(valor > 0){
            println("$valor R$ depositado com sucesso na conta $conta")
            saldo += valor
            return
        }
        println("$valor R$ impossivel de ser depositado na conta $conta")
    }

    fun transfere(valor:Double, outraConta:ContaBanco){
        if(saldo - valor >= 0){
            println("transferencia bem sucedida!")
            saldo -= valor
            outraConta.deposita(valor)
            return
        }
        println("Transferencia nao realizada!")
    }


}

//Construtores Secundarios, pegar as infos do construtor primario e adicionar as variaveis a mais necessarias.