package br.com.senai.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.senai.dao.EstoqueDAO;
import br.com.senai.model.Estoque;


@ManagedBean
@SessionScoped
public class EstoqueBean {

	private Estoque estoque = new Estoque();
	private List<Estoque> estoques = new ArrayList<Estoque>();

	public EstoqueBean() {
		estoques = new EstoqueDAO().listarestoques();
	}

	public String salvar() {
		// cidades.add(cidade);
		new EstoqueDAO().salvar(estoque);
		estoques = new EstoqueDAO().listarestoques();
		estoque = new Estoque();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Estoque salvo com sucesso!"));
		return "estoque_list?faces-redirect=true";
	}
	
	public String editar(Estoque estoque){
		this.estoque = estoque;
		return "estoque_cad?faces-redirect=true";
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public List<Estoque> getEstoques() {
		return estoques;
	}

	public void setEstoques(List<Estoque> estoques) {
		this.estoques = estoques;
	}
	


}
