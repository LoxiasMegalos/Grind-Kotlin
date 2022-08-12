fun main(){

    var mediaSalarial = 0.0; var mediaDeFilhos = 0.0; var maiorSalario = 0.0; var percentualAte100 = 0.0; var n = 0

    for(i in 1 until 5){
        println("Salario do "+ i + " habitante: ")
        var salario = readln().toDouble()

        println("Numero de Filhos do "+ i + " habitante: ")
        var nFilhos = readln().toDouble()

        mediaSalarial += salario
        mediaDeFilhos += nFilhos

        if(salario > maiorSalario){
            maiorSalario = salario
        }

        if(salario <= 100){
            percentualAte100 += 1.0
        }

        n += 1
    }
    mediaSalarial = mediaSalarial / n
    mediaDeFilhos = mediaDeFilhos / n
    percentualAte100 = (percentualAte100 / n) * 100

    println("Media salarial: "+mediaSalarial +"\nMedia de Filhos: "+ mediaDeFilhos +"\nMaior Salario: "+maiorSalario+"R$\nPercentual ate 100: "+percentualAte100+"%")
}