fun main() {

    val idade = 16;

    //if, if else e etc é tudo igual
    if (idade >= 16) {
        println("Você já pode votar")
    } else {
        println("Você NÃO pode votar")
    }

    // Não existe operador ternário em java
    //if else valor imediato
    val resultado = if (idade >= 16) "Você já pode votar" else "Você ainda não pode votar"

    var frase = when (idade){
        0 -> "Muito bebezinho"
        2 -> "Já deve estar falando um pouco"
        3,4,5 -> "Nossa, que esperto!"
        in 6..13 -> "Esse tem futuro"
        14,15,17 -> "Já dá dor de cabeça para os pais"
        in Int.MIN_VALUE..-1-> "Idade inválida"
        in 96.. Int.MAX_VALUE -> "Matusalém"
        else -> "Idade padrão"
    }

    println(frase)
}