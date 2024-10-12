package pe.edu.cibertec.t2_ventas.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.t2_ventas.model.entity.Venta;
import pe.edu.cibertec.t2_ventas.service.VentaService;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {
    @Autowired
    private VentaService ventaService;

    @GetMapping("/listar")
    public List<Venta> listarVentas() {
        return ventaService.listarVentas();
    }

    @GetMapping("/detalle/{id}")
    public Venta obtenerVentaPorId(@PathVariable Long id) {
        return ventaService.obtenerVentaPorId(id);
    }

    @PostMapping("/registrar")
    public Venta registrarVenta(@RequestBody Venta venta) {
        return ventaService.registrarVenta(venta);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarVenta(@PathVariable Long id) {
        ventaService.eliminarVenta(id);
    }
}
