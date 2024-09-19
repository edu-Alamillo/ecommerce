package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.Model.Orden;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IOrdenService {
    List<Orden> findAll();
    Orden Save(Orden orden);
}
