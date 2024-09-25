package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.Model.Usuario;

import java.util.Optional;

public interface IUsuarioService {
    Optional<Usuario> findById(Integer id);

    Usuario save(Usuario usuario);
    Optional<Usuario> findByEmail(String email);

}
