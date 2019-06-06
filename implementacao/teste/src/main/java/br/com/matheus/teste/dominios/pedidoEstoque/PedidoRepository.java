package br.com.matheus.teste.dominios.pedidoEstoque;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * PedidoRepository
 */
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

    
}