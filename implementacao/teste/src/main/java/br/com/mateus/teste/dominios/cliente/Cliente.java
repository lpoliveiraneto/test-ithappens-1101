package br.com.mateus.teste.dominios.cliente;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Cliente
 */
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cliente;

    @Column(nullable = false)
    private String nome_cliente;

    @Column(nullable = false)
    private String endereco_cliente;

    @Column(nullable = false)
    private String telefone_cliente;

	public String getTelefone_cliente() {
		return this.telefone_cliente;
	}

	public void setTelefone_cliente(String telefone_cliente) {
		this.telefone_cliente = telefone_cliente;
	}


	public String getEndereco_cliente() {
		return this.endereco_cliente;
	}

	public void setEndereco_cliente(String endereco_cliente) {
		this.endereco_cliente = endereco_cliente;
	}

	public String getNome_cliente() {
		return this.nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}


	public int getId_cliente() {
		return this.id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}


    
    
}