package br.com.senai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.senai.model.Compra;

public class CompraDAO {

	public void salvar(Compra compra) {
		EntityManager entityManager = JPAUtil.getEntityManager();

		entityManager.getTransaction().begin();

		entityManager.merge(compra);

		entityManager.getTransaction().commit();

		entityManager.close();
	}

	@SuppressWarnings("unchecked")
	public List<Compra> listarcompras() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query query = entityManager.createQuery("from Compra Order By produtoCompra");
		return query.getResultList();
	}

}
