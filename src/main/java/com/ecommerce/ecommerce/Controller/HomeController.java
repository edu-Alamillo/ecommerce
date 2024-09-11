package com.ecommerce.ecommerce.Controller;

import com.ecommerce.ecommerce.Model.DetalleOrden;
import com.ecommerce.ecommerce.Model.Orden;
import com.ecommerce.ecommerce.Model.Producto;
import com.ecommerce.ecommerce.Service.ProductoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class HomeController {

    private final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    private ProductoService productoService;

    //para almacenar los detalles de la orden
    List<DetalleOrden> detalle = new ArrayList<DetalleOrden>();

    //datos de la orden
    Orden orden = new Orden();

    @GetMapping("")
    public String home(Model model){

        model.addAttribute("productos", productoService.findAll());

        return "administrador/usuario/home";
    }

    @GetMapping("productohome/{id}")
    public String productoHome(@PathVariable Integer id, Model model){
        log.info("id producto enviado como parametro {}", id);
        Producto producto = new Producto();
        Optional<Producto> productoOptional = productoService.getProducto(id);
        producto = productoOptional.get();

        model.addAttribute("producto", producto);

        return "administrador/usuario/productohome";
    }

    @PostMapping("/cart")
    public String addCart(@RequestParam Integer id, @RequestParam Integer cantidad){
        DetalleOrden detalleOrden = new DetalleOrden();
        Producto producto = new Producto();
        double sumaTotal=0;

        Optional<Producto> optionalProducto = productoService.getProducto(id);
        log.info("Producto añadido: {}", optionalProducto.get());
        log.info("cantidad: {}", cantidad);

        return "administrador/usuario/carrito";
    }
}
