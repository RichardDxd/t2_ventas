package pe.edu.cibertec.t2_ventas.service;
import pe.edu.cibertec.t2_ventas.model.entity.Venta;

import java.util.List;

public interface VentaService {
    List<Venta> listarVentas();
    Venta obtenerVentaPorId(Long id);
    Venta registrarVenta(Venta venta);
    void eliminarVenta(Long id);
}
