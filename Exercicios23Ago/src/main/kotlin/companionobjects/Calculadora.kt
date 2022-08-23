package companionobjects

class Calculadora {

    companion object{
        fun soma(a:Int, b:Int):String{
            return "Soma $a + $b = ${a+b}"
        }
    }

}