package model

class Endereco(
    val logradaouro: String = "",
    val numero: Int = 0,
    val bairro: String = "",
    val cidade: String = "",
    val estado: String = "",
    val cep: String = "",
    val complemento: String = "",
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Endereco

        if (logradaouro != other.logradaouro) return false
        if (numero != other.numero) return false
        if (bairro != other.bairro) return false
        if (cidade != other.cidade) return false
        if (estado != other.estado) return false
        if (cep != other.cep) return false
        if (complemento != other.complemento) return false

        return true
    }

    override fun hashCode(): Int {
        var result = logradaouro.hashCode()
        result = 31 * result + numero
        result = 31 * result + bairro.hashCode()
        result = 31 * result + cidade.hashCode()
        result = 31 * result + estado.hashCode()
        result = 31 * result + cep.hashCode()
        result = 31 * result + complemento.hashCode()
        return result
    }
}
