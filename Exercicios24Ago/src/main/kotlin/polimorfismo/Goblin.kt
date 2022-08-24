package polimorfismo

class Goblin(

) : InimigoComum()
{
    override fun reconhecimento(){
        println("Sou um Goblin!")
    }

    override fun identificacao(){
        super.identificacao()
        println("Mas sou um goblin! hehe")
    }
}