fun main(){

    var pessoasMaior50 = 0
    var pessoasMenos21 = 0
    var totalPessoas = 0

    var idade = 0

    while(idade != -99){
        print("Informe sua idade: ")
        idade = readln().toInt()

        if(idade in 0..20){
            pessoasMenos21 += 1
            totalPessoas += 1
        } else if(idade > 50){
            pessoasMaior50 += 1
            totalPessoas += 1
        } else if(idade >= 0) {
            totalPessoas += 1
        }
    }

    println("Total de pessoas consideradas: $totalPessoas | Total menores de 21: $pessoasMenos21 | Total maiores que 50: $pessoasMaior50")
}