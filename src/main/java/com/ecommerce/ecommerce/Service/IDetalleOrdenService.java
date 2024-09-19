package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.Model.DetalleOrden;
import org.springframework.stereotype.Service;

@Service
public interface IDetalleOrdenService {
    DetalleOrden save(DetalleOrden detalleOrden);
}
