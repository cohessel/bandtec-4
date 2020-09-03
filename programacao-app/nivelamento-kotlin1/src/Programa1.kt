//métodos main em Kotlin são declarados com "fun" (abrev. de function)
// E aqui costuma chamar métodos de função
fun main() {
    println("É nois na Kotlin!")
    //Command+D: Duplica
    println("Ai sim, mano")

    //criação com Tipagem DINAMICA
    val cidade = "São Paulo"
    val habitantes = 15000
    val capital = true

    //criação com tipagem ESTÁTICA
    val pais:String = "Canadá" //Alfanumérico ou texto
    val idh:Double = 0.877 // Numero real
    val populacao:Int = 50000 //Numero inteiro
    val eMonarquia:Boolean = true // boleano ou lógico

    println()
    //Para interporlar apenas um valor, basta $
    val frase1 = "Na cidade de $cidade moram $habitantes habitantes"
    println(frase1)

    //Para interpolar o resultado de uma função, usamos ${} (como no JS)
    val frase2 = "Na cidade de ${cidade.toUpperCase()} moram ${habitantes.plus(1000)} habitantes"
    println(frase2)

    //Em Kotlin existem vários métodos de conversão de tipos Embarcados
    val pesoTexto = "77.54"
    println("Peso em Double: ${pesoTexto.toDouble()}")
    println("Peso em Double x2: ${pesoTexto.toDouble()*2}")

    val idadeTexto= "55"
    val idade:Int = idadeTexto.toInt()

    //No JS: var, let -> permitem retribuição
    //No JS: const -> Não permite (constante)
    //Java: final <tipo> -> não permite (constante)
    //Kotlin: val -> constante

    //CRIEM COM VAL VAL VAL VAL VAL VAL

    //listOf()-> Cria uma lista imutável (somente leitura)
    val frutas = listOf("abacate","pera")

    //para lista mutável
    val bairros = mutableListOf("Saúde","Vila Prudente", "Tatuapé")
    bairros.add("Imirim")
    bairros.removeAt(0)//Tirando o primeiro

}
