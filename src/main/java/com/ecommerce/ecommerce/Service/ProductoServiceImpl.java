package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.Model.Producto;
import com.ecommerce.ecommerce.Repository.ProductoRepository;

import java.util.Optional;

public class ProductoServiceImpl implements ProductoService{

    public ProductoRepository productoRepository;

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Optional<Producto> getProducto(Integer Id) {
        return productoRepository.findById(Id);
    }

    @Override
    public void update(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public void delete(Integer Id) {
        productoRepository.deleteById(Id);
    }
}
