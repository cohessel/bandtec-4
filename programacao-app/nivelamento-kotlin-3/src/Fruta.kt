class Fruta(var nome:String?, var preco:Double?) {

    constructor():this(null, null){
        println("Criou uma Fruta vazia")
    }

    constructor(novoNome: String?):this(novoNome, null) {
        println("Criou uma fruta só com nome")
    }
}