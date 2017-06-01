package br.com.senai.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.senai.dao.VendaDAO;
import br.com.senai.model.Venda;



@ManagedBean
@SessionScoped
public class VendaBean {

	private Venda venda = new Venda();
	private List<Venda> vendas = new ArrayList<Venda>();

	public VendaBean() {
		vendas = new VendaDAO().listarvendas();
	}

	public String salvar() {
		new VendaDAO().salvar(venda);
		vendas = new VendaDAO().listarvendas();
		venda = new Venda();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Venda salva com sucesso!"));
		return "venda_list?faces-redirect=true";
	}
	
	public String editar(Venda venda) {
		this.venda = venda;
		return "venda_cad?faces-redirect=true";
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}


}
