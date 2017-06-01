package br.com.senai.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Compra implements Serializable {

	private static final long serialVersionUID = -63990587387499082L;
	
	private Integer id;
	private String produtoCompra;
	private String valorUnidadeCompra;
	private String valorTotalCompra;
	private String quantidadeCompra;
	private Date cadastroCompra = new Date();
	private boolean active = true;
	private Date lastUpdate = new Date();
	
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getProdutoCompra() {
		return produtoCompra;
	}
	public void setProdutoCompra(String produtoCompra) {
		this.produtoCompra = produtoCompra;
	}
	public String getValorUnidadeCompra() {
		return valorUnidadeCompra;
	}
	public void setValorUnidadeCompra(String valorUnidadeCompra) {
		this.valorUnidadeCompra = valorUnidadeCompra;
	}
	public String getValorTotalCompra() {
		return valorTotalCompra;
	}
	public void setValorTotalCompra(String valorTotalCompra) {
		this.valorTotalCompra = valorTotalCompra;
	}
	public String getQuantidadeCompra() {
		return quantidadeCompra;
	}
	public void setQuantidadeCompra(String quantidadeCompra) {
		this.quantidadeCompra = quantidadeCompra;
	}
	public Date getCadastroCompra() {
		return cadastroCompra;
	}
	public void setCadastroCompra(Date cadastroCompra) {
		this.cadastroCompra = cadastroCompra;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compra other = (Compra) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Venda [id=" + id + ", produtoCompra=" + produtoCompra + ", valorUnidadeCompra=" + valorUnidadeCompra
				+ ", valorTotalCompra=" + valorTotalCompra + ", quantidadeCompra=" + quantidadeCompra
				+ ", cadastroCompra=" + cadastroCompra + ", active=" + active + ", lastUpdate=" + lastUpdate + "]";
	}
	

}
