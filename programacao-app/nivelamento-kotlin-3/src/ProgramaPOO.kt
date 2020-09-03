fun main() {
    //os atributos do construtor pode ser var ou val
    val pais1 = Pais("Canadá", 15000, 0.889)

    println(pais1.nome)
    println(pais1.populacao)
    println(pais1.idh)

    pais1.nome = "Japão"
    //pais1.populacao = 999 | não pode mudar, pois é val

    val alunoA = Aluno()
    alunoA.nome = "Lala"
    alunoA.idade = 20

    //Pais p = new Pais("Canada", 348232, 0.0)


    val frutaA = Fruta()
    val frutaB = Fruta("Jaca",12.0 )
    val frutaD = Fruta("Jaca",12.0 )
    val frutaC = Fruta("Uva" )

    var f1 = Fruta();
    println(frutaB)
    println("frutaB é igual a frutaD: ${frutaB == frutaD}")

    val cliente1 = Cliente("Zé", "123", 100.0)
    val cliente2 = Cliente("Marise", "987", 1000000.0)
    val cliente3 = Cliente("Zé", "123", 100.0)

    println("cliente2: ${cliente2}")
    println("cliente1 é igual a cliente3: ${cliente1 == cliente3}")

}