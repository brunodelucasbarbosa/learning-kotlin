package br.com.alurabruno.orgs.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import br.com.alurabruno.orgs.R
import br.com.alurabruno.orgs.dao.ProdutosDAO
import br.com.alurabruno.orgs.model.Produto
import java.math.BigDecimal

class FormularioProdutoActivity : AppCompatActivity() {

    private val produtosDAO = ProdutosDAO()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_produto)
        configurarBotaoSalvar()

    }

    private fun configurarBotaoSalvar() {
        val botaoSalvar = findViewById<Button>(R.id.botao_salvar)
        botaoSalvar.setOnClickListener {
            val produtoNovo = criarProduto()
            produtosDAO.adicionarProduto(produtoNovo)
            Toast.makeText(this, "Produto adicionado!!", Toast.LENGTH_SHORT).show()
            finish()
        }
    }

    private fun criarProduto(): Produto {
        val campoNome = findViewById<EditText>(R.id.produto_item_nome)
        val nome = campoNome.text.toString()
        val campoDescricao = findViewById<EditText>(R.id.produto_item_descricao)
        val descricao = campoDescricao.text.toString()
        val campoValor = findViewById<EditText>(R.id.produto_item_valor)
        val valorEmTexto = campoValor.text.toString()
        val valor = if (valorEmTexto.isBlank()) {
            BigDecimal.ZERO
        } else {
            BigDecimal(valorEmTexto)
        }
        return Produto(nome, descricao, valor)
    }
}