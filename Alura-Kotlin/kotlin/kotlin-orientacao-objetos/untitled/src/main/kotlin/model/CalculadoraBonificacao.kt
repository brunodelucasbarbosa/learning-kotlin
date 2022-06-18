package model

class CalculadoraBonificacao {

    var total: Double = 0.0
    private set;

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.getBonificacao;
    }

//    fun registra(gerente: model.Gerente) {
//        this.total += gerente.getBonificacao;
//    }
//
//    fun registra(diretor: model.Diretor) {
//        this.total += diretor.getBonificacao;
//    }
}