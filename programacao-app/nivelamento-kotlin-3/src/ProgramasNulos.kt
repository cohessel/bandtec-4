fun main() {
    //A Kotlin tem RANçO do Nullpointer

    val cidade = null
    println("cidade: $cidade")
    println("cidade: "+cidade)

    /*
    A Situação 2: não é possivel criar variável de tipagem estática com Null

    val municipio:String = null
     */

    val bairro:String? = null //
    val idade:Int? = null
    val altura:Double? = null

    println("bairro maiusculo: ${bairro?.toUpperCase()}")

    //println("bairro maiusculo: ${bairro!!.toUpperCase()}")

}