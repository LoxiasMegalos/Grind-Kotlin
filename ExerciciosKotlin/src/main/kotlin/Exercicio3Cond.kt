import java.lang.Math.*
import java.util.*
import kotlin.math.pow

fun main(){

    var teclado = Scanner(System.`in`)

    var n1 = teclado.nextLine().toDouble()
    var n2 = teclado.nextLine().toDouble()
    var n3 = teclado.nextLine().toDouble()
    var n4 = teclado.nextLine().toDouble()

    if(n3*n3 >= 1000){
        println(n3)
    }else{
        println(""+n1 +" : " + n1*n1+"\n"+n2 + " : " + n2*n2+"\n"+n3 + " : " + n3*n3+"\n"+ n4 + " : " + n4*n4)
    }
}