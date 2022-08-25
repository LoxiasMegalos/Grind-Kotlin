class Calculadora {

    companion object{

        fun soma (n1:Int, n2:Int):Int{
            return n1+n2
        }

        fun subtrai (n1:Int, n2:Int):Int{
            return n1-n2
        }

        fun multiplica (n1:Int, n2:Int):Int{
            return n1*n2
        }

        fun divide (n1:Int, n2:Int):Int{
            return n1/n2
        }


        fun opcoes(){
            println("Calculadora:")
            println("Soma int + int")
            println("Subtrai int - int")
            println("Multiplica int * int")
            println("Divide int / int")
        }

    }

}