package br.com.senai.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Estoque implements Serializable {

	private static final long serialVersionUID = -63990587387499082L;

	private Integer id;
	private String produtoEstoque;
	private String quantidadeEstoque;
	private Date cadastroEstoque = new Date();
	private boolean active = true;
	private Date lastUpdate = new Date();

	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public Date getCadastroEstoque() {
		return cadastroEstoque;
	}

	public void setCadastroEstoque(Date cadastroEstoque) {
		this.cadastroEstoque = cadastroEstoque;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProdutoEstoque() {
		return produtoEstoque;
	}

	public void setProdutoEstoque(String produtoEstoque) {
		this.produtoEstoque = produtoEstoque;
	}

	public String getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(String quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
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
	public String toString() {
		return "Estoque [id=" + id + ", produtoEstoque=" + produtoEstoque + ", quantidadeEstoque=" + quantidadeEstoque
				+ ", cadastroEstoque=" + cadastroEstoque + ", active=" + active + ", lastUpdate=" + lastUpdate + "]";
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
		Estoque other = (Estoque) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
