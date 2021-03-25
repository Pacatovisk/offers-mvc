package br.com.pacato.offers.repository;

import br.com.pacato.offers.model.Pedido;
import br.com.pacato.offers.model.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByStatus(StatusPedido aguardando);
}
