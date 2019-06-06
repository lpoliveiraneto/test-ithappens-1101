package br.com.matheus.teste.dominios.Filial;

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
    private String localidade;
}