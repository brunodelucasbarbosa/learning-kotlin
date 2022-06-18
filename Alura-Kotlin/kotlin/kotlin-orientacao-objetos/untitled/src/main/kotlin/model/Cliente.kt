package model

class Cliente(
    val nome: String,
    val cpf: String,
    val senha: Int,
    var endereco: Endereco = Endereco(),

) : Autenticavel {


    override fun autentica(senha: Int): Boolean {
        if(senha == this.senha) {
            return true
        }
        return false
    }
}