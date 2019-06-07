package br.com.mateus.teste.dominios.produto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Produto
 */
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_produto;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String descrição;
    @Column(nullable = false)
    private float valor_unitário;
    @Column(nullable = false)
    private int quantidade;


	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescriçãO() {
		return this.descrição;
	}

	public void setDescriçãO(String descrição) {
		this.descrição = descrição;
	}

	public float getValor_unitáRio() {
		return this.valor_unitário;
	}

	public void setValor_unitáRio(float valor_unitário) {
		this.valor_unitário = valor_unitário;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


    
}