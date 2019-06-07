package br.com.mateus.teste.dominios.estoque;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import br.com.mateus.teste.dominios.filial.Filial;

/**
 * Estoque
 */
@Entity
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_estoque;

    //private Filial filial;

//    public String getFilial(){
//        return filial.getNome_filial();
//    }
}