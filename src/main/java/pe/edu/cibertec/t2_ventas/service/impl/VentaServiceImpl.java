package pe.edu.cibertec.t2_ventas.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t2_ventas.model.entity.Venta;
import pe.edu.cibertec.t2_ventas.repository.VentaRepository;
import pe.edu.cibertec.t2_ventas.service.VentaService;

import java.util.List;

@Service
public class VentaServiceImpl implements VentaService{
    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public List<Venta> listarVentas() {
        return ventaRepository.findAll();
    }

    @Override
    public Venta obtenerVentaPorId(Long id) {
        return ventaRepository.findById(id).orElse(null);
    }

    @Override
    public Venta registrarVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public void eliminarVenta(Long id) {
        ventaRepository.deleteById(id);
    }
}
