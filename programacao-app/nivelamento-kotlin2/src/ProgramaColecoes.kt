fun main() {
    val paises = listOf("Alemanha","Brasil","Canadá", "Hungria","México")

    //forEach: para cada valor
    //it: nome automático n
    paises.forEach{println(it)}

    //para nomear a variavel it
    paises.forEach{pais -> print(pais)}

    paises.forEach{ pais ->

        println("O país é $pais")
        if (pais.length>6){
            println("Nossa, que nome grande!")
        }
    }

    //count {<teste lógico>} -> Conta quantos elementos dão true
    val quantosPaisesMaisDeSeisLetras = paises.count{ it.length > 6}
    println(quantosPaisesMaisDeSeisLetras)

    //Paises com R
    val paisesComR = paises.filter { it.contains("r") }
    println(paisesComR)

}