package com.ifal.web.amazonRL.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pagamento {
	
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String numeroCartao;
	@Column
	private String codigSeguranca;
	@Column
	private String boleto;
	
	public Pagamento() {
	
	}
	
	public Pagamento(String numeroCartao, String codigSeguranca,String boleto) {
		super();
		this.numeroCartao = numeroCartao;
		this.codigSeguranca = codigSeguranca;
		this.boleto = boleto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public String getCodigSeguranca() {
		return codigSeguranca;
	}

	public String getBoleto() {
		return boleto;
	}

	public void setBoleto(String boleto) {
		this.boleto = boleto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boleto == null) ? 0 : boleto.hashCode());
		result = prime * result + ((codigSeguranca == null) ? 0 : codigSeguranca.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numeroCartao == null) ? 0 : numeroCartao.hashCode());
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
		Pagamento other = (Pagamento) obj;
		if (boleto == null) {
			if (other.boleto != null)
				return false;
		} else if (!boleto.equals(other.boleto))
			return false;
		if (codigSeguranca == null) {
			if (other.codigSeguranca != null)
				return false;
		} else if (!codigSeguranca.equals(other.codigSeguranca))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numeroCartao == null) {
			if (other.numeroCartao != null)
				return false;
		} else if (!numeroCartao.equals(other.numeroCartao))
			return false;
		return true;
	}
	
	
	
	
}
