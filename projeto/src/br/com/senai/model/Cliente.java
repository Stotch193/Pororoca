package br.com.senai.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {

	private static final long serialVersionUID = -63990587387499082L;
	
	private Integer id;
	private String nomeCliente;
	private String emailCliente;
	private String telefoneCliente;
	private String rgCliente;
	private Estado estadoCliente;
	private Date cadastroCliente = new Date();
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
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEmailCliente() {
		return emailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public String getTelefoneCliente() {
		return telefoneCliente;
	}
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	public String getRgCliente() {
		return rgCliente;
	}
	public void setRgCliente(String rgCliente) {
		this.rgCliente = rgCliente;
	}
	public Estado getEstadoCliente() {
		return estadoCliente;
	}
	public void setEstadoCliente(Estado estadoCliente) {
		this.estadoCliente = estadoCliente;
	}
	public Date getCadastroCliente() {
		return cadastroCliente;
	}
	public void setCadastroCliente(Date cadastroCliente) {
		this.cadastroCliente = cadastroCliente;
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
		return "Cliente [id=" + id + ", nomeCliente=" + nomeCliente + ", emailCliente=" + emailCliente
				+ ", telefoneCliente=" + telefoneCliente + ", rgCliente=" + rgCliente + ", estadoCliente="
				+ estadoCliente + ", cadastroCliente=" + cadastroCliente + ", active=" + active + ", lastUpdate="
				+ lastUpdate + "]";
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
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
