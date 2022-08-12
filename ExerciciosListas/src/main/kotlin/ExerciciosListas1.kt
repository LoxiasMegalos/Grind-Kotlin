fun main(){
    var notas: MutableList<Int> = mutableListOf()
    var maiorNota = 0; var index = 1

    for(i in 0 until 5){
        print("Informe a $i º nota: ")
        notas.add(readln().toInt())
    }

    for(nota in notas){
        if(index == 1){
            maiorNota = nota
        } else{
            if(nota > maiorNota){
                maiorNota = nota
            }
        }
        println("Nota $index : " + nota)
        index += 1
    }
    println("A maior nota eh: $maiorNota")
}