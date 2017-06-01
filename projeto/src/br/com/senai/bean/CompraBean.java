package br.com.senai.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.senai.dao.CompraDAO;
import br.com.senai.model.Compra;



@ManagedBean
@SessionScoped
public class CompraBean {

	private Compra compra = new Compra();
	private List<Compra> compras = new ArrayList<Compra>();

	public CompraBean() {
		compras = new CompraDAO().listarcompras();
	}

	public String salvar() {
		new CompraDAO().salvar(compra);
		compras = new CompraDAO().listarcompras();
		compra = new Compra();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Compra salva com sucesso!"));
		return "compra_list?faces-redirect=true";
	}
	
	public String editar(Compra produto) {
		this.compra = produto;
		return "compra_cad?faces-redirect=true";
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}
	
}
