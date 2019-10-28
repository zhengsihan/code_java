package org.minus.prac2;

import org.junit.jupiter.api.Test;
import org.minus.prac2.dao.ProductDao;
import org.minus.prac2.dto.ProductDto;
import org.minus.prac2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Prac2ApplicationTests {

    @Autowired
    ProductService prodService;

    @Autowired
    ProductDao prodDao;

    @Test
    void contextLoads() {
    }

    @Test
    public void testGetProdById(){
        ProductDto prodDto = prodService.getProdById(10004L);
        System.out.println(prodDto);
    }
}
