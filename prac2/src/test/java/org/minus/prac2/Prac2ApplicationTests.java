package org.minus.prac2;

import org.junit.jupiter.api.Test;
import org.minus.prac2.dao.ProductDao;
import org.minus.prac2.dto.ProductDto;
import org.minus.prac2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
class Prac2ApplicationTests {

    @Autowired
    ProductService prodService;

    @Autowired
    @Resource
    RedisTemplate redisTemplate;

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

    @Test
    public void setValue() {
        String key = "zsh";
        Object value = redisTemplate.opsForValue().get(key);
        System.out.println(String.format("%s的取值为：%s", key, value.toString()));
    }
}
