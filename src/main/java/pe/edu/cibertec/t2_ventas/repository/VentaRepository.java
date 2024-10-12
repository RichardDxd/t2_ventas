package pe.edu.cibertec.t2_ventas.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.t2_ventas.model.entity.Venta;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
}
