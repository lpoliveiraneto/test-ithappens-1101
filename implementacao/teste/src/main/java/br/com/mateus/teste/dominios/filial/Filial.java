package br.com.mateus.teste.dominios.filial;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Filial
 */
@Entity
public class Filial {

    @Id
    private int id_filial;

    @Column(nullable = false)
    private String nome_filial;

    @Column(nullable = false)
    private String cidade;

	public String getNome_filial() {
		return this.nome_filial;
	}

	public void setNome_filial(String nome_filial) {
		this.nome_filial = nome_filial;
	}


    
}