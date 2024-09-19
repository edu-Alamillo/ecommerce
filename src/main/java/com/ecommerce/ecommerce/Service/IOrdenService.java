package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.Model.Orden;
import org.springframework.stereotype.Service;

@Service
public interface IOrdenService {
    Orden Save(Orden orden);
}
