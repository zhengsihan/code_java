package org.minus.prac2.dao;

import org.minus.prac2.dto.ProductDto;
import org.springframework.stereotype.Component;

/**
 * Created by zhengsihan, on 2019-10-28
 */
@Component("prodDao")
public interface ProductDao {
    int addProduct(ProductDto prodDto);
    ProductDto getProdById(Long id);
}
