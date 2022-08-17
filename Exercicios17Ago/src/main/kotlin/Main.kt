fun main(args: Array<String>) {
    println("Estruturas de LOOP!")

    /*
    while
    do while
    for
     */

    var cont = 0

    while(true){
        println("Programa Rodando...")
        print("Quer sair do programa? ")
        val resp = readln()

        if(resp == "1"){
            break
        }
    }

    // do while

    do{
        println("Executei uma vez!")
        break
    }while(true)

    do{
        print("Tinha o pete e o repete, o pete morreu, quem sobrou? ")
        val entrada = readln().lowercase().trim()
    }while(entrada == "repete")

    // for

    for(i in 1..3){
        print("$i ")
    }
    println()
    for(i in 10 downTo 0){
        print("$i ")
    }
    println()
    for(i in 1 until 3){
        print("$i ")
    }
    println()
    for(letra in "palavra".reversed()){
        print("$letra")
    }
    println()
    print("Informe a tabuada: ")
    val tab = readln().toInt()

    for(i in 0..10 step 2){
        println("$tab X $i = ${tab * i}")
    }

    var array = Array<String>(4,{"i -> i"})

    for(i in 0 until array.size){
        print("Informacao $i : ")
        var resp = readln()
        array[i] = resp
    }

    for(i in 0 until array.size){
        print("${array[i]} ")
    }
}