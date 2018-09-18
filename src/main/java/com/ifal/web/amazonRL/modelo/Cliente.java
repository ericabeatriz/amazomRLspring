package com.ifal.web.amazonRL.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente {

	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String email;
	private double senha;
	
	public Cliente() {
		
	}
	
	public Cliente(String Nome, String Email, double Senha) {
		super();
		this.nome = Nome;
		this.email = Email;
		this.senha = Senha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String Nome) {
		this.nome = Nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String Email) {
		this.email = Email;
	}

	public double getSenha() {
		return senha;
	}

	public void setSenha(double Senha) {
		this.senha = Senha;
	}

	public void adicionarProdutoAoCarrinho() {
		
	}
	
	public void removerProdutoDoCarrinho() {
		
	}
	
	public void cancelarPedido() {
		
	}	
	
	public void comprarProduto() {
		
	}
	
	public void pagarProduto() {
		
	}
	
	public void listarPrdutosComprados() {
		
	}
	public void Boleto() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(senha);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
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
		if (Double.doubleToLongBits(senha) != Double.doubleToLongBits(other.senha))
			return false;
		return true;
	}
}
