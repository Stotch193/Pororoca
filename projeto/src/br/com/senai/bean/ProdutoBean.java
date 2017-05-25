package br.com.senai.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.senai.dao.ProdutoDAO;
import br.com.senai.model.Cidade;
import br.com.senai.model.Produto;



@ManagedBean
@SessionScoped
public class ProdutoBean {

	private Produto produto = new Produto();
	private List<Produto> produtos = new ArrayList<Produto>();

	public ProdutoBean() {
		produtos = new ProdutoDAO().listarprodutos();
	}

	public String salvar() {
		new ProdutoDAO().salvar(produto);
		produtos = new ProdutoDAO().listarprodutos();
		produto = new Produto();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Produto salvo com sucesso!"));
		return "produto_list?faces-redirect=true";
	}
	
	public String editar(Produto produto) {
		this.produto = produto;
		return "produto_cad?faces-redirect=true";
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProduto(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
