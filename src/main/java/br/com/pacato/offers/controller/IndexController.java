package br.com.pacato.offers.controller;


import br.com.pacato.offers.model.Pedido;
import br.com.pacato.offers.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("/")
    public String home(Model model){
        List<Pedido> pedidos = pedidoRepository.findAll();
        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
