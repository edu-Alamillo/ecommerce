package com.ecommerce.ecommerce.Controller;

import com.ecommerce.ecommerce.Model.Producto;
import com.ecommerce.ecommerce.Model.Usuario;
import com.ecommerce.ecommerce.Service.IUsuarioService;
import com.ecommerce.ecommerce.Service.ProductoService;
import com.ecommerce.ecommerce.Service.UploadFileService;
import com.ecommerce.ecommerce.Service.UsuarioServiceImpl;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final Logger LOGGER = LoggerFactory.getLogger(ProductoController.class);

    @Autowired
    private ProductoService productoService;

    @Autowired
    private UploadFileService upload;

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("")
    public String Show(Model model){
        model.addAttribute("productos",productoService.findAll());
        return "administrador/productos/show";
    }

    @GetMapping("/create")
    public String Create(){
        return "administrador/productos/create";
    }

    @PostMapping("/save")
    public String save(Producto producto, @RequestParam("img") MultipartFile file, HttpSession session) throws IOException {
        LOGGER.info("este es el objeto producto {}", producto);

        Usuario u= usuarioService.findById(Integer.parseInt(session.getAttribute("idusuario").toString() )).get();
        producto.setUsuario(u);

        //imagen
        if(producto.getId() == null){ //Cuando se crea el producto
            String nombreImagen = upload.saveImage(file);
            producto.setImagen(nombreImagen);
        }else{
        }

        productoService.save(producto);
        return "redirect:/productos";
    };

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        Producto producto = new Producto();
        Optional<Producto> optionalProducto = productoService.getProducto(id);
        producto = optionalProducto.get();
        LOGGER.info("producto buscado: {}", producto);
        model.addAttribute("producto", producto);

        return "administrador/productos/edit";
    };

    @PostMapping("/update")
    public String Update(Producto producto, @RequestParam("img") MultipartFile file) throws IOException{
        Producto p = productoService.getProducto(producto.getId()).get();

        if(file.isEmpty()){ //editamos el producto pero no editamos la imagen
            producto.setImagen(p.getImagen());
        }else{
            if(!p.getImagen().equals("default.jpg")){
                upload.deleteImage(p.getImagen());
            }
            String nombreImagen = upload.saveImage(file);
            producto.setImagen(nombreImagen);
        }
        producto.setUsuario(p.getUsuario());
        productoService.update(producto);
        return "redirect:/productos";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id){
        Producto p=productoService.getProducto(id).get();

        //Eliminar cuando no sea la imagen por defento
        if(!p.getImagen().equals("default.jpg")){
            upload.deleteImage(p.getImagen());
        }
        productoService.delete(id);
        return "redirect:/productos";
    }
}
