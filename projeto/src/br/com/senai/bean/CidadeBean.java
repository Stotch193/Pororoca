package br.com.senai.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.senai.dao.CidadeDAO;
import br.com.senai.model.Cidade;
import br.com.senai.model.Estado;

@ManagedBean
@SessionScoped
public class CidadeBean {

	private Cidade cidade = new Cidade();
	private List<Estado> estados = Arrays.asList(Estado.values());
	private List<Cidade> cidades = new ArrayList<Cidade>();

	public CidadeBean() {
		cidades = new CidadeDAO().listarcidades();
	}

	public String salvar() {
		// cidades.add(cidade);
		new CidadeDAO().salvar(cidade);
		cidades = new CidadeDAO().listarcidades();
		cidade = new Cidade();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cidade salva com sucesso!"));
		return "cidade_list?faces-redirect=true";
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public List<Estado> getEstados() {
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

}
