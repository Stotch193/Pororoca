package br.com.senai.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.senai.dao.FornecedorDAO;
import br.com.senai.model.Estado;
import br.com.senai.model.Fornecedor;



@ManagedBean
@SessionScoped
public class FornecedorBean {

	private Fornecedor fornecedor = new Fornecedor();
	private List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
	private List<Estado> estados = Arrays.asList(Estado.values());

	public FornecedorBean() {
		fornecedores = new FornecedorDAO().listarfornecedores();
	}

	public String salvar() {
		// cidades.add(cidade);
		new FornecedorDAO().salvar(fornecedor);
		fornecedores = new FornecedorDAO().listarfornecedores();
		fornecedor = new Fornecedor();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Fornecedor salva com sucesso!"));
		return "fornecedor_list?faces-redirect=true";
	}

	public Fornecedor getCidade() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public List<Estado> getEstados() {
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

}
