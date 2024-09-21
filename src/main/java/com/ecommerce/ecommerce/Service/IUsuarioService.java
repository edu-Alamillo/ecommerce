package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.Model.Usuario;

import java.util.Optional;

public interface IUsuarioService {
    Optional<Usuario> finById(Integer Id);

    Usuario save(Usuario usuario);
}
