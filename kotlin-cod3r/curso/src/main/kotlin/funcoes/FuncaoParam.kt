package funcoes

class FuncaoParam {
  fun somar(a: Int, b: Int): Int {
    return a + b
  }
}

fun somar(a: Int, b: Int): Int {
  return a + b
}

fun calc(a: Int, b: Int, funcao: (Int, Int) -> Int): Int {
  return funcao(a, b)
}

fun main() {
  val nomes = listOf("Ana", "Pedro", "Maria", "João")
  println(filtrar(nomes, ::comTresLetras))
}

fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E> {
  val listaFiltrada = ArrayList<E>()
  for (e in lista) {
    if (filtro(e)) {
      listaFiltrada.add(e)
    }
  }
  return listaFiltrada
}

fun comTresLetras(nome: String): Boolean {
  return nome.length == 3
}