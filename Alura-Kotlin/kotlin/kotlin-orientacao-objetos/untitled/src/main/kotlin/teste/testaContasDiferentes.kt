package teste

import model.Cliente
import model.ContaCorrente
import model.ContaPoupanca
import model.Endereco

fun testaContasDiferentes() {
        val contaCorrente = ContaCorrente(
            Cliente("Fran", "3513.531.513.51", 123, Endereco("rua 1", 13, "sete",
                "sal")),
            1000
        )

        val contaPoupanca = ContaPoupanca(
            Cliente("Fran", "3513.531.513.51", 123, Endereco("rua 1", 13, "sete",
                "sal")),
            1001
        )

        contaCorrente.deposita(1000.0)
        contaPoupanca.deposita(1000.0)

        println("saldo corrente ${contaCorrente.saldo}")
        println("saldo poupança ${contaPoupanca.saldo}")

        contaCorrente.sacar(100.0)
        contaPoupanca.sacar(100.0)

        println("saldo corrente ${contaCorrente.saldo}")
        println("saldo poupança ${contaPoupanca.saldo}")

        contaCorrente.transfere(100.0, contaPoupanca)

        println("saldo corrente ${contaCorrente.saldo}")
        println("saldo poupança ${contaPoupanca.saldo}")
    }
