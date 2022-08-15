fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val padrao = Regex("[0-9]{4}")
    val ano = "2022"
    val resultado = padrao.findAll(ano)
    val x = resultado.map{it.groupValues[0]}.joinToString().toInt()

}