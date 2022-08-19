fun main(){

    /*
    Map (ou Dicionário) - Trabalha com chave e valor
    (código de funcionario : funcionario | 1 = Murillo | 2 = Fulano)

    Pair<K, V> - Key , Value
    Pair<Int codigo, String nome>

    Map mutavel
    Map imutavel

     */

    val funcionarios = mutableMapOf<Int, String>(
        1 to "Murillo",
        52 to "Raissa",
        123 to "Julia"
    )

    for(values in funcionarios.values){
       print("${values} ")
    }
    println()
    for(key in funcionarios.keys){
        print("${key} ")
    }
    println()

    for(key in funcionarios.keys){
        print("${funcionarios[key]} ")
    }
    println()

    funcionarios.forEach{ k,v ->
        println("Código: ${k}, Nome: ${v}")
    }

    //print("Digite o codigo do funcionario que queremos cadastrar: ")


    print("Digite o nome do funcionario que queremos cadastrar: ")
    var name = readln()
    var cod = (1..500).random()
    //val num = (1..500).random()
    //funcionarios.put(cod, name)

    if(funcionarios.containsKey(cod)){
        println("Cadastro evitado, chave ja no sistema")
    } else{
        funcionarios[cod] = name
    }



    funcionarios[500] = "lalala"

    funcionarios.forEach{
        println("Código: ${it.key}, Nome: ${it.value}")
    }

}