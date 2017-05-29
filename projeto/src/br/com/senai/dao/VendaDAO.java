package br.com.senai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.senai.model.Venda;

public class VendaDAO {

	public void salvar(Venda venda) {
		EntityManager entityManager = JPAUtil.getEntityManager();

		entityManager.getTransaction().begin();

		entityManager.merge(venda);

		entityManager.getTransaction().commit();

		entityManager.close();
	}

	@SuppressWarnings("unchecked")
	public List<Venda> listarvendas() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query query = entityManager.createQuery("from Venda Order By produtoVenda");
		return query.getResultList();
	}

}
