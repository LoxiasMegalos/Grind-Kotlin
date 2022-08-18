fun main(){

    var numero = 1

    var pessoasCalmas = 0
    var mulheresNervosas = 0
    var homensAgressivos = 0
    var outrosCalmos = 0
    var nervosoMaior40 = 0
    var calmoMenosDe18 = 0

    //val rnds = (1..3).random()

    while(numero <= 5){


        var idade = 0
        do{
            print("Idade entrevistado numero $numero: ")
            idade = readln().toInt()
        } while(idade !in 1..100)
        //val idade = (1..100).random()

        var sexo = 0
        do{
            print("Sexo entrevistado numero $numero: ")
            sexo = readln().toInt()
        } while(sexo !in 1..3)
        //val sexo = (1..3).random()

        var psico = 0
        do{
            print("Psicológico entrevistado numero $numero: ")
            psico = readln().toInt()
        } while(psico !in 1..3)
        //val psico = (1..3).random()


        if(psico == 1){
            pessoasCalmas += 1
            if(idade < 18){
                calmoMenosDe18 += 1
            }
            if(sexo == 3){
                outrosCalmos += 1
            }
        }

        if(psico == 2){
            if(sexo == 1){
                mulheresNervosas += 1
            }
            if(idade > 40){
                nervosoMaior40 += 1
            }
        }

        if(psico == 3 && sexo == 2){
            homensAgressivos += 1
        }
        numero += 1
    }

    println("Quantidade pessoas calmas: $pessoasCalmas")
    println("Quantidade mulheres nervosas: $mulheresNervosas")
    println("Quantidade homens agressivos: $homensAgressivos")
    println("Quantidade outros calmas: $outrosCalmos")
    println("Quantidade nervosos maiores de 40: $nervosoMaior40")
    println("Quantidade calmos menos de 18: $calmoMenosDe18")
}