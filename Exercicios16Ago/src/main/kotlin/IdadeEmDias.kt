fun main(){
    //Faça um sistema que leia a idade de uma pessoa expressa em anos,
    // meses e dias e mostre-a expressa apenas em dias.
    print("Digite os anos: ")
    var anos = readln().toInt()
    print("Digite os meses: ")
    var meses = readln().toInt()
    print("Digite os dias: ")
    var dias = readln().toInt()

    println("Sua idade em dias é: ${(anos*365)+(meses*30)+dias}")

}