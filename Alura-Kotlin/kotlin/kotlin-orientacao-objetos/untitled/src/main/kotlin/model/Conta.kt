package model

abstract class Conta(
  var titular: Cliente,
  val numero: Int) {

  var saldo = 0.0
    protected set;


  fun deposita(valor: Double) {
    this.saldo += valor;
  }

  abstract fun sacar(valor: Double): Boolean

  fun transfere(valor: Double, destino: Conta): Boolean {
    if (saldo >= valor) {
      saldo -= valor;
      destino.deposita(valor);
      return true;
    }

    return false;
  }


}