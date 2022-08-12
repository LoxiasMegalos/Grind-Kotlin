fun main(){
    var base = readln().toDouble()
    var altura = readln().toDouble()
    var area = 0.0

    if(base > 0 && altura > 0){
        area = (base*altura)/2
        println(area)
    } else {
        println("Invalido")
    }
}