fun main(){

    var matrizN1 = Array(4){ IntArray(6)}; var matrizN2 = Array(4){ IntArray(6)}
    var matrizM1 = Array(4){ IntArray(6)}; var matrizM2 = Array(4){ IntArray(6)}

    for(linha in 0 until 4){
        for(coluna in 0 until 6){
            print("N1 "+(linha+1) +" : "+(coluna+1)+" = ")
            matrizN1[linha][coluna] = readln().toInt()

            print("N2 "+(linha+1) +" : "+(coluna+1)+" = ")
            matrizN2[linha][coluna] = readln().toInt()
        }
    }

    for(linha in 0 until 4){
        for(coluna in 0 until 6){
            matrizM1[linha][coluna] = matrizN1[linha][coluna] + matrizN2[linha][coluna]
            matrizM2[linha][coluna] = matrizN1[linha][coluna] - matrizN2[linha][coluna]
        }
    }

    for(linha in 0 until 4){
        for(coluna in 0 until 6){
            print(""+matrizM1[linha][coluna] + " ")
        }
        println()
    }

    for(linha in 0 until 4){
        for(coluna in 0 until 6){
            print(""+matrizM2[linha][coluna] + " ")
        }
        println()
    }
}