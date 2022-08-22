import java.text.SimpleDateFormat
import java.util.*

class Aviao (
    val codigoCarenagem:Int,
    private var dataDeRevisao: Date,
    var cor: String
        )
{

    var eletrico = false

    constructor(
        codigoCarenagem: Int,
        dataDeRevisao: Date,
        cor: String,
        eletrico: Boolean
    ): this(codigoCarenagem, dataDeRevisao, cor){
        this.eletrico = eletrico
        println("Criando um aviao eletrico")
    }


    fun getDataDeRevisao(){
        var formatador = SimpleDateFormat("dd/mm/yyyy")
        println(formatador.format(dataDeRevisao))
    }

    override fun toString(): String {
        var formatador = SimpleDateFormat("yyyy")
        var anoRevisao = formatador.format(dataDeRevisao)

        return "Avião $cor, revisado em $anoRevisao, carenagem código: $codigoCarenagem, eletrico: $eletrico"
    }

}