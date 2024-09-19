package com.ecommerce.ecommerce.Repository;

import com.ecommerce.ecommerce.Model.DetalleOrden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleOrdenRepository extends JpaRepository<DetalleOrden, Integer> {
}
