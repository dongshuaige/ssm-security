package com.fy.service.Impl;

import com.fy.dao.ProductDao;
import com.fy.domain.Product;
import com.fy.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author java
 * @create 2019-07-26 16:34
 * @desc
 * @ClassName
 **/
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public List<Product> findAll() throws Exception {
        return productDao.findAll();
    }

    @Override
    public void save(Product product) {
         productDao.save(product);
    }
}
