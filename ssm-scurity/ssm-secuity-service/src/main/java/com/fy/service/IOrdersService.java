package com.fy.service;

import com.fy.domain.Orders;

import java.util.List;

/**
 * @author java
 * @desc
 * @ClassName
 **/
public interface IOrdersService {
    
    List<Orders> findAll(int page, int size) throws Exception;

    Orders findById(String ordersId) throws Exception;
}
