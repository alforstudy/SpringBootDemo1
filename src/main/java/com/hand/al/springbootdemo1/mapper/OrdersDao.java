package com.hand.al.springbootdemo1.mapper;

import com.hand.al.springbootdemo1.pojo.Orders;
import com.hand.al.springbootdemo1.vo.OrderCustom;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OrdersDao {
    List<OrderCustom> listOrderCustom();
    List<Orders> listOrderCustom2();
    List<Orders> listOrderAndDetail();
    List<Orders> lazyListOrderAndDetail();
}
