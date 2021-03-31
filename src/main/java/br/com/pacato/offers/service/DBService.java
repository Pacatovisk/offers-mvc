package br.com.pacato.offers.service;

import br.com.pacato.offers.model.Pedido;
import br.com.pacato.offers.model.StatusPedido;
import br.com.pacato.offers.repository.PedidoRepository;
import br.com.pacato.offers.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private UserRepository userRepository;

    public void instanciaBaseDeDados() {

        Pedido pedido1 = new Pedido(null, "Oracle Database", BigDecimal.valueOf(3232), LocalDate.now(), "https://www.oracle.com/br/database/", "https://www.oracle.com/a/ocom/img/rc32-data-management.png", "Oracle database é um dos melhores do mercado!", StatusPedido.AGUARDANDO);
        Pedido pedido2 = new Pedido(null, "Oracle Database", BigDecimal.valueOf(3232), LocalDate.now(), "https://www.oracle.com/br/database/", "https://www.oracle.com/a/ocom/img/rc32-data-management.png", "Oracle database é um dos melhores do mercado!", StatusPedido.ENTREGUE);
        Pedido pedido3 = new Pedido(null, "Oracle Database", BigDecimal.valueOf(3232), LocalDate.now(), "https://www.oracle.com/br/database/", "https://www.oracle.com/a/ocom/img/rc32-data-management.png", "Oracle database é um dos melhores do mercado!", StatusPedido.APROVADO);
        Pedido pedido4 = new Pedido(null, "Oracle Database", BigDecimal.valueOf(3232), LocalDate.now(), "https://www.oracle.com/br/database/", "https://www.oracle.com/a/ocom/img/rc32-data-management.png", "Oracle database é um dos melhores do mercado!", StatusPedido.ENTREGUE);
        Pedido pedido5 = new Pedido(null, "Oracle Database", BigDecimal.valueOf(3232), LocalDate.now(), "https://www.oracle.com/br/database/", "https://www.oracle.com/a/ocom/img/rc32-data-management.png", "Oracle database é um dos melhores do mercado!", StatusPedido.APROVADO);
        Pedido pedido6 = new Pedido(null, "Oracle Database", BigDecimal.valueOf(3232), LocalDate.now(), "https://www.oracle.com/br/database/", "https://www.oracle.com/a/ocom/img/rc32-data-management.png", "Oracle database é um dos melhores do mercado!", StatusPedido.AGUARDANDO);
        Pedido pedido7 = new Pedido(null, "AWS", BigDecimal.valueOf(1200), LocalDate.now(), "https://aws.amazon.com/", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/93/Amazon_Web_Services_Logo.svg/1200px-Amazon_Web_Services_Logo.svg.png", "AWS é excelente para deploy de aplicações!", StatusPedido.ENTREGUE);
        pedidoRepository.saveAll(Arrays.asList(pedido1,pedido2, pedido3,pedido4, pedido5, pedido6, pedido7));

    }
}
