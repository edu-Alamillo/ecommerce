package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.Model.Producto;

import java.util.List;
import java.util.Optional;


public interface ProductoService {
    public Producto save(Producto producto);
    public Optional<Producto> getProducto(Integer Id);
    public void update(Producto producto);
    public void delete(Integer Id);
    public List<Producto> findAll();
}
