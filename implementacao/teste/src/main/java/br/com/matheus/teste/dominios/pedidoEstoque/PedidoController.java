package br.com.matheus.teste.dominios.pedidoEstoque;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PedidoController
 */
@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @PostMapping
    public String savePedido(@RequestBody Pedido pedido) {
        pedidoRepository.save(pedido);
        return "Pedido salvo com sucesso";
    }
}