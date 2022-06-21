package br.com.alurabruno.orgs.dao

import br.com.alurabruno.orgs.model.Produto

class ProdutosDAO {

    fun adicionarProduto(produto: Produto) {
        produtos.add(produto)
    }

    fun buscaTodos() : List<Produto> {
        return produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>()
    }
}