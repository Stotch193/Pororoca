package br.com.senai.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.senai.dao.ClienteDAO;
import br.com.senai.model.Cliente;
import br.com.senai.model.Estado;

@ManagedBean
@SessionScoped
public class ClienteBean {

	private Cliente cliente = new Cliente();
	private List<Estado> estados = Arrays.asList(Estado.values());
	private List<Cliente> clientes = new ArrayList<Cliente>();

	public ClienteBean() {
		clientes = new ClienteDAO().listarclientes();
	}

	public String salvar() {
		// cidades.add(cidade);
		new ClienteDAO().salvar(cliente);
		clientes = new ClienteDAO().listarclientes();
		cliente = new Cliente();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente salv com sucesso!"));
		return "cliente_list?faces-redirect=true";
	}
	
	public String editar(Cliente cliente){
		this.cliente = cliente;
		return "cliente_cad?faces-redirect=true";
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Estado> getEstados() {
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}
