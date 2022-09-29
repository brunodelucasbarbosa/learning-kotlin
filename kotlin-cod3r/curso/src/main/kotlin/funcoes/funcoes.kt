fun main() {

  fun printName(name: String) {
    print("My name is $name")
  }

  fun soma(x: Int, y: Int): Int {
    return x + y
  }

//  printName("John")
//  print(soma(2, 3))

  print("O valor é ${if (soma(2, 3) > 4) "maior" else "menor"} que 4")
  parametroNomeado(nome = "Bruno", sobrenome = "Barbosa")
}

fun parametroNomeado(nome: String, sobrenome: String) {
  print("Meu nome é $nome $sobrenome")
}