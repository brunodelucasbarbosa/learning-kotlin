package model

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if(admin.autentica(senha)) {
            println("autenticô")
        }

        println("Falhô")
    }

}