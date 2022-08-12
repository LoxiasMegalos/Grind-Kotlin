fun main(){

    var soma = 0

    for(i in 0..500){
        if(i % 2 == 1 && i % 3 == 0){
            soma += i
        }
    }

    println(soma)
}