package com.reye.service;

import com.reye.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product-server",path = "/product")
public interface ProductService {

    @RequestMapping("/hello")
    String getHello();

    @RequestMapping("/first")
    Product getProduct();
}
