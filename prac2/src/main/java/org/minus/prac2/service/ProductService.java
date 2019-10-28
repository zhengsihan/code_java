package org.minus.prac2.service;

import org.minus.prac2.dto.ProductDto;
import org.springframework.stereotype.Component;

/**
 * Created by zhengsihan, on 2019-10-28
 */
@Component("prodService")
public interface ProductService {
    int addProduct(ProductDto prodDto);
    ProductDto getProdById(Long id);
}
