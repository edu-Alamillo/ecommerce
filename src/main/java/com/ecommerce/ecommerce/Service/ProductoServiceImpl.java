package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.Model.Producto;
import com.ecommerce.ecommerce.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService{

     @Autowired
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

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }
}
