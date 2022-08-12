fun main(){
    var lista = Array(10, { i-> i})
    var valor:Int; var soma = 0; var media:Double; var maiorValor = 0; var vezesMaiorValor = 0

    for(numero in lista){
        var posicao = numero + 1
        print("Digite o resultado do $posicao lançamento: ")
        valor = readln().toInt()

        soma += valor

        if(valor > maiorValor){
            vezesMaiorValor = 0
            maiorValor = valor
        }
        if(maiorValor == valor){
            vezesMaiorValor += 1
        }

        lista[numero] = valor
    }

    media = soma / 10.0

    for(numero in lista){
        print(""+lista.get(numero) + " ")
    }
    println("\nMédia: "+media)
    println("Maior pontuacao: $maiorValor : $vezesMaiorValor Ocorrencias")
}