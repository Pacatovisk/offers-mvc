package br.com.pacato.offers.service;

import br.com.pacato.offers.model.Pedido;
import br.com.pacato.offers.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public void instanciaBaseDeDados() {
        Pedido pedido = new Pedido(null, "Banco de dados", BigDecimal.valueOf(3232), LocalDate.now(), "wwwew", "ewewe", "dsd");
        pedidoRepository.save(pedido);
    }
}
