package com.ecommerce.ecommerce.Repository;

import com.ecommerce.ecommerce.Model.DetalleOrden;
import com.ecommerce.ecommerce.Model.Orden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer> {
}
