package funcoes

inline fun transacao(funcao: () -> Unit) {
  println("abrindo transação...")

  try {
    funcao()
  } finally {
    println("fechando transação...")
  }
}

fun main() {
  transacao {
    println("executando SQL 1...")
    println("executando SQL 2...")
    println("executando SQL 3...")
  }

  val resultado = executarComLog("somar") {
    somar(4,5)
  }
  println(resultado)
}

inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T {
  println("Entrando no método $nomeFuncao...")
  try {
    return funcao()
  } finally {
    println("Método $nomeFuncao finalizado.")
  }
}

fun somar2(a: Int, b: Int): Int {
  return a+b
}