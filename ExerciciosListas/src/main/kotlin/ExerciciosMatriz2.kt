fun main(){
    var matriz3x3 = Array(3){IntArray(3)}; var somaDiagonal = 0

    for(linha in 0 until 3){
        for(coluna in 0 until 3) {
            print("Informe o valor da matriz da posicao: Linha[" + (linha + 1) + "] - Coluna[" + (coluna + 1) + "] = ")
            matriz3x3[linha][coluna] = readln().toInt()
            if(linha == coluna){
                somaDiagonal += matriz3x3[linha][coluna]
            }
        }
    }

    for(linha in 0 until 3){
        for(coluna in 0 until 3){
            print(""+matriz3x3[linha][coluna] + " ")
        }
        println()
    }

    for(linha in 0 until 3){
        for(coluna in 0 until 3){
            if(linha == coluna){
                print(matriz3x3[linha][coluna])
            } else{
                print(" ")
            }
        }
        println()
    }
    print("A soma da diagonal eh: $somaDiagonal")
}