package br.com.senai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.senai.model.Cliente;

public class ClienteDAO {

	public void salvar(Cliente cliente) {
		EntityManager entityManager = JPAUtil.getEntityManager();

		entityManager.getTransaction().begin();

		entityManager.merge(cliente);

		entityManager.getTransaction().commit();

		entityManager.close();
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> listarclientes() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query query = entityManager.createQuery("from Cliente Order By nomeCliente");
		return query.getResultList();
	}

}
