package com.fy.service.Impl;

import com.fy.dao.OrdersDao;
import com.fy.domain.Orders;
import com.fy.service.IOrdersService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author java
 * @create 2019-08-06 17:38
 * @desc
 * @ClassName
 **/
@Service
public class OrdersServiceImpl implements IOrdersService {
    @Autowired
    private OrdersDao ordersDao;
    @Override
    public List<Orders> findAll(int page, int size) throws Exception {
        PageHelper.startPage(page,size);
        return ordersDao.findAll();
    }

    @Override
    public Orders findById(String ordersId) throws Exception {
        return ordersDao.findById(ordersId);
    }
}
