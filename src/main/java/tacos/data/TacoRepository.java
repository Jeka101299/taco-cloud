package tacos.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tacos.Taco;

@Repository
public interface TacoRepository
        extends JpaRepository<Taco, Long> {
}
