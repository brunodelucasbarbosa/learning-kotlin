package br.com.alurabruno.orgs.ui.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.alurabruno.orgs.R
import br.com.alurabruno.orgs.dao.ProdutosDAO
import br.com.alurabruno.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaProdutosActivity : AppCompatActivity(R.layout.ativity_lista_produtos) {

    private val produtosDAO = ProdutosDAO()
    private val adapter = ListaProdutosAdapter(this, produtosDAO.buscaTodos())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configurarRecyclerView()
        configurarFab()
        Toast.makeText(this, "Bem-Vindx!", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        adapter.atualiza(produtosDAO.buscaTodos())

    }

    private fun configurarRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = adapter
    }

    private fun configurarFab() {
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            val intent = Intent(this, FormularioProdutoActivity::class.java)
            startActivity(intent)
        }
    }
}