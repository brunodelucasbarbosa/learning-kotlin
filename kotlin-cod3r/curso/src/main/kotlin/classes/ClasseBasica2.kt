package classes

class Pessoa1(var nome: String)

class Pessoa2(val nome: String)

class Pessoa3(nomeInicial: String) {
  val nome: String = nomeInicial
}
