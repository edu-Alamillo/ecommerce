package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.Model.Orden;
import com.ecommerce.ecommerce.Repository.IOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenServiceImpl implements IOrdenService{

    @Autowired
    private IOrdenRepository ordenRepository;

    @Override
    public Orden Save(Orden orden) {
        return ordenRepository.save(orden);
    }
}
