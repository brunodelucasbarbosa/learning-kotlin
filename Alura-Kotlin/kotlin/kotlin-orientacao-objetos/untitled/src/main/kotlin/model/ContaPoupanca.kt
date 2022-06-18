package model

class ContaPoupanca(
    titular: Cliente,
    numero: Int) : Conta(titular, numero) {

    override fun sacar(valor: Double): Boolean {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

}