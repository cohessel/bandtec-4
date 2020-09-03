import javax.print.attribute.standard.PrinterInfo

fun main() {
cumprimentar()

    val oloko = cumprimentar();
    //se colocar entre chaves, "guarda a função

    println(calcularDescontoVT(2000.0))
    println(montarFrase("Zé Ruela", 77))

}

fun cumprimentar() {
    println("Boa noite, galera!")
}

//O retorno está em ():Double
//Função com 1 argumento com o tipo Double
// Any  para qualquer coisa
//
fun calcularDescontoVT(salario:Double):Double {
    return salario * 0.06
}

fun montarFrase(nome:String, idade:Int):String{
    return "Você se chama $nome e tem $idade anos"
}