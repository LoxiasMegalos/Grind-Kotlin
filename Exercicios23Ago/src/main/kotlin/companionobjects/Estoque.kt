package companionobjects

object Estoque {

    val listaProdutos = mutableListOf<String>()

    fun addProdutos(prod:String){
        listaProdutos.add(prod)
    }

    fun exibirProdutos(){
        for(produto in listaProdutos){
            println(produto)
        }
    }
}