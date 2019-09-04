package com.fy.dao;

import com.fy.domain.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author java
 * @desc
 * @ClassName
 **/
public interface TravellerDao {
    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId=#{ordersId})")
    List<Traveller> findByOrdersId(String ordersId) throws Exception;
}
