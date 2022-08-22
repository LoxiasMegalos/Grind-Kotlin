class Patinete (
    val marca:String,
    var tipoDeRoda:String,
    var cor:String,
    var preco:Double
    ) {


    //5) Crie uma classe patinete e apresente os atributos e métodos referentes
    //esta classe, em seguida crie um objeto patinete, defina as instancias deste
    //objeto e apresente as informações deste objeto no console.
        var eletrico = false
        constructor(
                marca: String,
                tipoDeRoda: String,
                cor: String,
                preco: Double,
                eletrico: Boolean
        ) : this(marca, tipoDeRoda, cor, preco){
                this.eletrico = eletrico
                if(eletrico){
                        println("Criando um patinete eletrico")
                }
        }

        fun exibeInformacoes(){
                println("Marca : $marca")
                println("Tipo de roda: $tipoDeRoda")
                println("Cor: $cor")
                println("Preço: $preco")
                println("Eletrico: $eletrico")
        }

        fun pintarPatinete(cor:String):String{
                if(this.cor == cor){
                        return "Patinete já é desta cor! Pintura não realizada"
                }
                this.cor = cor
                return "Cor do patinete modificada para $cor"
        }

        fun mudarPreco(valor:Double):String{
                if(this.preco < valor){
                        this.preco = valor
                        return "Patinete valorizado"
                }
                this.preco = valor
                return "Patinete desvalorizado"
        }

}