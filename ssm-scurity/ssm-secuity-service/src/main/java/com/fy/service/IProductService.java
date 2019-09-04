package com.fy.service;

import com.fy.domain.Product;

import java.util.List;

/**
 * @author java
 * @desc
 * @ClassName
 **/
public interface IProductService {
    List<Product> findAll() throws Exception;

    void save(Product product);
}
