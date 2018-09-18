package com.ifal.web.amazonRL.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String nome;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Produto> produtos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produto) {
		produtos = produto;
	}

	public byte byteValue() {
		return id.byteValue();
	}

	public short shortValue() {
		return id.shortValue();
	}

	public int intValue() {
		return id.intValue();
	}

	public long longValue() {
		return id.longValue();
	}

	public float floatValue() {
		return id.floatValue();
	}

	public double doubleValue() {
		return id.doubleValue();
	}

	public String toString() {
		return id.toString();
	}

	public int compareTo(Integer anotherInteger) {
		return id.compareTo(anotherInteger);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Categoria other = (Categoria) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}

