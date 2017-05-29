package br.com.senai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.senai.model.Produto;

public class ProdutoDAO {

	public void salvar(Produto produto) {
		EntityManager entityManager = JPAUtil.getEntityManager();

		entityManager.getTransaction().begin();

		entityManager.merge(produto);

		entityManager.getTransaction().commit();

		entityManager.close();
	}

	@SuppressWarnings("unchecked")
	public List<Produto> listarprodutos() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query query = entityManager.createQuery("from Produto Order By nomeProduto");
		return query.getResultList();
	}
	
	public void excluir(Produto produto) {
		EntityManager entityManager = JPAUtil.getEntityManager();

		entityManager.getTransaction().begin();

		produto = entityManager.merge(produto);
		
		entityManager.remove(produto);

		entityManager.getTransaction().commit();

		entityManager.close();
	}
}
