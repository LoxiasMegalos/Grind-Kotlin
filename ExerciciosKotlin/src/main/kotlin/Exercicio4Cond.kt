fun main(){

    var inteiro = readLine()!!.toInt()

    if(inteiro > 0){
        if(inteiro % 2 == 0){
            println("Positivo e par")
        }else{
            println("Positivo e impar")
        }
    } else if(inteiro < 0){
        if(inteiro % 2 != 0){
            println("Negativo e impar")
        } else{
            println("Negativo e par")
        }
    } else{
        println("zerooo")
    }
}