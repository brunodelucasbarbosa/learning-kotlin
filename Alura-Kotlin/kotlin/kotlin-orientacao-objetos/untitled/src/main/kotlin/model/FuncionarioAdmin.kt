package model

abstract class FuncionarioAdmin(
    nome:String,
    cpf: String,
    salario: Double, val senha: Int) : Funcionario(nome, cpf, salario) {

    abstract override val getBonificacao: Double

    fun autentica(senha: Int): Boolean {
        if(senha == this.senha) {
            return true
        }
        return false
    }

}