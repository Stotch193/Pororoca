package br.com.senai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.senai.model.Estoque;

public class EstoqueDAO {

	public void salvar(Estoque estoque) {
		EntityManager entityManager = JPAUtil.getEntityManager();

		entityManager.getTransaction().begin();

		entityManager.merge(estoque);

		entityManager.getTransaction().commit();

		entityManager.close();
	}

	@SuppressWarnings("unchecked")
	public List<Estoque> listarestoques() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query query = entityManager.createQuery("from Estoque Order By produtoEstoque");
		return query.getResultList();
	}

}
