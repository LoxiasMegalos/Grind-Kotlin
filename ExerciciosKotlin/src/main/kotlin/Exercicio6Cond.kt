fun main(){

    var idade = readln().toInt()

    if(idade >= 5 && idade <= 7){
        println("infantil A")
    } else if(idade >= 8 && idade <= 11){
        println("infantil B")
    }else if(idade >= 12 && idade <= 13){
        println("Juv A")
    }else if(idade >= 14 && idade <= 17){
        println("Juv A")
    }else if(idade >= 18){
        println("Adultos")
    }else{
        println("Sem categoria")
    }
}