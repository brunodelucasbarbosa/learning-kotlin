package model

class ContaCorrente(
    titular: Cliente,
    numero: Int) : Conta(titular, numero) {

    override fun sacar(valor: Double): Boolean {
        val valorComTaxa = valor + 0.1;
        if(this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa;
            return true;
        }

        return false;
    }
}