fun main(){
    var numero = 233

    do{
        if(numero >= 300 && numero <= 400){
            println("$numero : 5")
            numero += 5
        }else{
            println("$numero : 3")
            numero += 3
        }
    }while(numero <= 456)
}
