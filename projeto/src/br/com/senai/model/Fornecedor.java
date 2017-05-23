package br.com.senai.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fornecedor implements Serializable {

	private static final long serialVersionUID = 4218573019122278677L;

	@Id
	@GeneratedValue
	private Long id;
	private Date cadastroFornecedor = new Date();
	private String fantasiaFornecedor;
	private String emailFornecedor;
	private String foneaFornecedor;
	private String enderecoFornecedor;
	private String cidadeFornecedor;
	private boolean active = true;
	private Date lastUpdate = new Date();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCadastroFornecedor() {
		return cadastroFornecedor;
	}

	public void setCadastroFornecedor(Date cadastroFornecedor) {
		this.cadastroFornecedor = cadastroFornecedor;
	}

	public String getFantasiaFornecedor() {
		return fantasiaFornecedor;
	}

	public void setFantasiaFornecedor(String fantasiaFornecedor) {
		this.fantasiaFornecedor = fantasiaFornecedor;
	}


	public String getEmailFornecedor() {
		return emailFornecedor;
	}

	public void setEmailFornecedor(String emailFornecedor) {
		this.emailFornecedor = emailFornecedor;
	}

	public String getFoneaFornecedor() {
		return foneaFornecedor;
	}

	public void setFoneaFornecedor(String foneaFornecedor) {
		this.foneaFornecedor = foneaFornecedor;
	}

	public String getEnderecoFornecedor() {
		return enderecoFornecedor;
	}

	public void setEnderecoFornecedor(String enderecoFornecedor) {
		this.enderecoFornecedor = enderecoFornecedor;
	}


	public String getCidadeFornecedor() {
		return cidadeFornecedor;
	}

	public void setCidadeFornecedor(String cidadeFornecedor) {
		this.cidadeFornecedor = cidadeFornecedor;
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
		Fornecedor other = (Fornecedor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", cadastroFornecedor=" + cadastroFornecedor + ", fantasiaFornecedor=" + fantasiaFornecedor + ", emailFornecedor="
				+ emailFornecedor + ", foneaFornecedor=" + foneaFornecedor + ", enderecoFornecedor="
				+ enderecoFornecedor + ", cidadeFornecedor=" + cidadeFornecedor + ", active=" + active + ", lastUpdate="
				+ lastUpdate + "]";
	}
}