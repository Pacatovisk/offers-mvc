package br.com.pacato.offers.service;

import br.com.pacato.offers.model.Pedido;
import br.com.pacato.offers.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> listaTodosPedidos() {
        List<Pedido> pedidos = pedidoRepository.findAll();;
        return pedidos;
    }

}
