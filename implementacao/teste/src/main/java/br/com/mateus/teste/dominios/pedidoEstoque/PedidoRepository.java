package br.com.mateus.teste.dominios.pedidoEstoque;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * PedidoRepository
 */
public interface PedidoRepository extends JpaRepository<PedidoEstoque, Integer> {

    
}