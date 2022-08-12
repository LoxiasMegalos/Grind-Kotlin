import java.util.Scanner

fun main(){
    var entrada = Scanner(System.`in`)
    println("Informe o codigo do funcionario: ")
    var codigo = entrada.nextInt()

    println("Informe a quantidade de horas trabalhadas: ")
    var horasTrabalhadas = entrada.nextInt()

    var excesso = 0.0;
    var salario = 0.0
    var salarioE = 0.0

    if(horasTrabalhadas > 50){
        excesso = (horasTrabalhadas - 50) * 20.0
        salarioE = excesso
        salario = 500.0 + salarioE
    }else{
        salario = horasTrabalhadas * 10.0
    }

    println("Operario: "+codigo+" Trabalho: "+horasTrabalhadas+ " horas e recebeu: "+ salario +"R$ Salario em excesso: "+salarioE+"R$")
}