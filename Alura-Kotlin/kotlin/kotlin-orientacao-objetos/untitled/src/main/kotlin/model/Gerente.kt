package model

class Gerente(
    nome:String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(nome, cpf, salario, senha) {

    override val getBonificacao: Double get() = salario


}