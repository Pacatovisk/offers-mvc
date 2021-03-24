package br.com.pacato.offers.controller;

import br.com.pacato.offers.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model){
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Vitrola");
        pedido.setUrlImagem("https://www.google.com");
        pedido.setUrlProduto("https://www.omni.com");
        pedido.setDescricao("Produto de qualidade");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);

        return "home";
    }
}
