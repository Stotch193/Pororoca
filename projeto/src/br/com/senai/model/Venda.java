package br.com.senai.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Venda implements Serializable {

	private static final long serialVersionUID = -63990587387499082L;
	
	private Integer id;
	private String produtoVenda;
	private String valorUnidadeVenda;
	private String valorTotalVenda;
	private String quantidadeVenda;
	private Date cadastroVenda = new Date();
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
	public String getProdutoVenda() {
		return produtoVenda;
	}
	public void setProdutoVenda(String produtoVenda) {
		this.produtoVenda = produtoVenda;
	}
	public String getValorUnidadeVenda() {
		return valorUnidadeVenda;
	}
	public void setValorUnidadeVenda(String valorUnidadeVenda) {
		this.valorUnidadeVenda = valorUnidadeVenda;
	}
	public String getValorTotalVenda() {
		return valorTotalVenda;
	}
	public void setValorTotalVenda(String valorTotalVenda) {
		this.valorTotalVenda = valorTotalVenda;
	}
	public String getQuantidadeVenda() {
		return quantidadeVenda;
	}
	public void setQuantidadeVenda(String quantidadeVenda) {
		this.quantidadeVenda = quantidadeVenda;
	}
	public Date getCadastroVenda() {
		return cadastroVenda;
	}
	public void setCadastroVenda(Date cadastroVenda) {
		this.cadastroVenda = cadastroVenda;
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
		Venda other = (Venda) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Venda [id=" + id + ", produtoVenda=" + produtoVenda + ", valorUnidadeVenda=" + valorUnidadeVenda
				+ ", valorTotalVenda=" + valorTotalVenda + ", quantidadeVenda=" + quantidadeVenda + ", cadastroVenda="
				+ cadastroVenda + ", active=" + active + ", lastUpdate=" + lastUpdate + "]";
	}
	


}
