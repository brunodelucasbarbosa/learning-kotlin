package model

class Diretor(
    nome:String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(nome, cpf, salario, senha), Autenticavel {

    override val getBonificacao: Double get() = salario + plr;

}