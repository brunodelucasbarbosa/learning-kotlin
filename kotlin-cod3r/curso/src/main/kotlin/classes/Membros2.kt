package classes

class Calculadora {
	private var resultado: Int = 0

	fun somar(vararg valores: Int): Calculadora {
		valores.forEach { resultado += it }
		return this
	}
}