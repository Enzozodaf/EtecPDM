// Aula 1: Primeiro contato

fun main() {
    println("1. Olá, mundo!")

    print("2. Enzzo Joaquim")
    print(" ")
    print("Joaquim")

    println()

    var nome = "3. Enzzo Joaquim\nZoZo\nJoaquim"
    println(nome)

    // var nome = "Não posso redeclarar uma variável"
    nome = "Enzzo" // mas posso reatribuir um novo valor
    print("4. Olá, " + nome + "\n")

    var sobrenome = "Joaquim"
    println("5. Como vai, $nome $sobrenome?")

    val variavelEstatica = "Bom dia"
    // variavelEstatica = "Não posso reatribuir um novo valor!"

    val nomeCompleto = "6. " + nome + " ZoZo " + sobrenome
    println(nomeCompleto)
    println("7. $variavelEstatica, ${nomeCompleto}!")
}