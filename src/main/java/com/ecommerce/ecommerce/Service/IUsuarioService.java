package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.Model.Producto;
import com.ecommerce.ecommerce.Model.Usuario;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface IUsuarioService {
    Optional<Usuario> finById(Integer Id);
}
