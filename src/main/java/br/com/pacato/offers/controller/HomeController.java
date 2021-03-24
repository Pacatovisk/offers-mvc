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
        pedido.setNomeProduto("Oracle Database");
        pedido.setUrlImagem("https://www.oracle.com/a/ocom/img/rc32-data-management.png");
        pedido.setUrlProduto("https://www.oracle.com/br/database/");
        pedido.setDescricao("Banco de dados relacional");

        List<Pedido> pedidos = Arrays.asList(pedido);
        model.addAttribute("pedidos", pedidos);

        return "home";
    }
}
