package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.Model.Orden;
import com.ecommerce.ecommerce.Model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IOrdenService {
    List<Orden> findAll();
    Optional<Orden> findById(Integer id);
    Orden Save(Orden orden);
    String generarNumeroOrden();
    List<Orden> findByUsuario(Usuario usuario);
}
