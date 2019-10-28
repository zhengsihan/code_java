package org.minus.prac2.service.impl;

import org.minus.prac2.dao.ProductDao;
import org.minus.prac2.dto.ProductDto;
import org.minus.prac2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhengsihan, on 2019-10-28
 */
@Service
public class ProdServiceImpl implements ProductService {
    @Autowired
    ProductDao prodDao;

    @Override
    public int addProduct(ProductDto prodDto) {
        return prodDao.addProduct(prodDto);
    }

    @Override
    public ProductDto getProdById(Long id) {
        return prodDao.getProdById(id);
    }
}
