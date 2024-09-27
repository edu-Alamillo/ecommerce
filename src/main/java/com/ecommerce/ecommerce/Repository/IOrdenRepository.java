package com.ecommerce.ecommerce.Repository;

import com.ecommerce.ecommerce.Model.DetalleOrden;
import com.ecommerce.ecommerce.Model.Orden;
import com.ecommerce.ecommerce.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer> {
    List<Orden> findByUsuario(Usuario usuario);

}
