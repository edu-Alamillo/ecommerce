package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.Model.Orden;
import com.ecommerce.ecommerce.Model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IOrdenService {
    List<Orden> findAll();
    Orden Save(Orden orden);
    String generarNumeroOrden();
    List<Orden> findByUsuario(Usuario usuario);
}
