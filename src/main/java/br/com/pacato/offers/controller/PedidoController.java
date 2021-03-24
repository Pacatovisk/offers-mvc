package br.com.pacato.offers.controller;

import br.com.pacato.offers.dto.RequisicaoNovoPedido;
import br.com.pacato.offers.model.Pedido;
import br.com.pacato.offers.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("formulario")
    public String formulario() {
        return "pedido/formulario";
    }

    @PostMapping("novo")
    public String novo(RequisicaoNovoPedido requisicao) {
        Pedido pedido = requisicao.toPedido();
        pedidoService.salvarPedido(pedido);
        return "pedido/formulario";
    }
}
