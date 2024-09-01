package com.ecommerce.ecommerce.Controller;

import com.ecommerce.ecommerce.Model.Producto;
import com.ecommerce.ecommerce.Model.Usuario;
import com.ecommerce.ecommerce.Service.ProductoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);

    @Autowired
    private ProductoService productoService;

    @GetMapping("")
    public String Show(){
        return "administrador/productos/show";
    }

    @GetMapping("/create")
    public String Create(){
        return "administrador/productos/create";
    }

    @PostMapping("/save")
    public String save(Producto producto){
        LOGGER.info("este es el objeto producto {}", producto);
        Usuario u = new Usuario(1, "", "", "", "", "", "", "");
        producto.setUsuario(u);
        productoService.save(producto);
        return "redirect:/productos";
    };
}
