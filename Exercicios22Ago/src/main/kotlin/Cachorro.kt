class Cachorro (
    private var raca:String,
    var nome:String
    )
{
    override fun toString():String{
        return "Cachorro $nome é da raça: $raca!"
    }
}

