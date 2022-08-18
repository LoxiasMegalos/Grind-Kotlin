fun main(){
    var contador = 0
    for(i in 1000..1999){
        if(i % 11 == 5){
            contador += 1
            print("$i ")
        }
    }
    println("\nquantidade = $contador")
}
