fun main(){
    /*
    Set - como a lista, ele também armazenará diversos valores
    também terá um tamanho variado
    porém, ignora qualquer tipo de valor duplicado!

    Set Imutável

    Set Mutavel

     */

    val setImut = setOf<String>("a", "b", "c", "a")

    for(elemento in setImut){
        print("$elemento ")
    }
    println()

    println("A letra 'b' esta no index: ${setImut.indexOf("b")}")

    val idades = mutableSetOf(1,1,1,1,1,1)
    println(idades.size)

    val setNome = mutableSetOf("Murillo", "Murillo")
    println(setNome.size)

}