package br.com.senai.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cidade implements Serializable {

	private static final long serialVersionUID = -1194548848448725327L;

	private Integer id;
	private Date cadastroCidade = new Date();
	private String nomeCidade;
	private Estado estadoCidade;
	private boolean active = true;
	private Date lastUpdae = new Date();

	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getCadastroCidade() {
		return cadastroCidade;
	}

	public void setCadastroCidade(Date cadastroCidade) {
		this.cadastroCidade = cadastroCidade;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public Estado getEstadoCidade() {
		return estadoCidade;
	}

	public void setEstadoCidade(Estado estadoCidade) {
		this.estadoCidade = estadoCidade;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getLastUpdae() {
		return lastUpdae;
	}

	public void setLastUpdae(Date lastUpdae) {
		this.lastUpdae = lastUpdae;
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
		Cidade other = (Cidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cidade [id=" + id + ", cadastroCidade=" + cadastroCidade + ", nomeCidade=" + nomeCidade
				+ ", estadoCidade=" + estadoCidade + ", active=" + active + ", lastUpdae=" + lastUpdae + "]";
	}
	
	

}
