package tacos.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tacos.Order;

@Repository
public interface OrderRepository
        extends JpaRepository<Order, Long> {

}
