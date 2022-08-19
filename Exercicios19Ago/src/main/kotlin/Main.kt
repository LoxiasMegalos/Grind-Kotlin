fun main(args: Array<String>) {
    println("Collections")

    /*
    Collections - Variávies(ou tipos) que podem armazenar mais de um valor

    Arrays
    List
    Set
    Map

     */

    /*
    Arrays - Tamanho Fixo a partir do momento que foi inicializado, armazena diversos valores e tem uma tamanho fixo
     */

    /*
    val nomesIniciais = arrayOf("Murillo","Raissa","Julia")

    //Delcarando Array apenas com tamanho definido
    val convidados = Array(3){""}

    val alunos = arrayOfNulls<String>(15)

    for(nome in nomesIniciais){
        println(nome)
    }

    var cont = 0
    for(i in convidados){
        convidados[cont] = readln()
        cont++
    }

    cont = 0

    for(i in convidados){
        println(convidados[cont])
        cont++
    }

    //iterando sobre um array da forma mais complexa
    var n = 5
    val presentes = Array(n){""}
    for(i in 0 until n){
        presentes[i] = readln()
    }

    //iterando de uma forma legal - for each
    for(nomes in nomesIniciais){
        println(nomes)
    }

    nomesIniciais.forEach {
        println(it)
    }

    */
    /*
     val pessoas = Array<String>(5){""}

    for (i in 0 until 5){
        pessoas[i] = readln()
    }

    pessoas.forEach {
        println(it)
    }

    pessoas[2] = "xytzoloas"

    pessoas.forEach {
        println(it)
    }
    */

}