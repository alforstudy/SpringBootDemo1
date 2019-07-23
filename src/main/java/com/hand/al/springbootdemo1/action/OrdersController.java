package com.hand.al.springbootdemo1.action;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hand.al.springbootdemo1.mapper.ItemsDao;
import com.hand.al.springbootdemo1.mapper.OrdersDao;
import com.hand.al.springbootdemo1.mapper.UserDao;
import com.hand.al.springbootdemo1.pojo.Items;
import com.hand.al.springbootdemo1.pojo.Orders;
import com.hand.al.springbootdemo1.pojo.User;
import com.hand.al.springbootdemo1.vo.OrderCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;


@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersDao ordersDao;

    @Autowired
    private UserDao userDao;

    @Autowired
    private ItemsDao itemsDao;

    @GetMapping("/users")
    public List<User>  listUsers(){

        HashMap<String, Object> map = new HashMap<>();
        map.put("username","%王%");
        map.put("sex",2);
        List<User> users = userDao.findUserByUsernameAndSex(map);
        return users;
    }


    @GetMapping("/items")
    public PageInfo<Items>  listItems(){
        PageHelper.startPage(1,10);
        List<Items> items = itemsDao.selectAll();
//        Page<Items> page = (Page<Items>) items;
        PageInfo<Items> itemsPageInfo = new PageInfo<>(items);
//        Example example = new Example(Items.class);
//        example.createCriteria().andEqualTo("name","台式机");
//        List<Items> items = itemsDao.selectByExample(example);
//        example.clear();
//        ArrayList<Long> ids = new ArrayList<>();
//        ids.add(1L);
//        ids.add(2L);
//        ids.add(3L);
//        example.createCriteria().andIn("id",ids);
//        List<Items> items1 = itemsDao.selectByExample(example);
//        example.clear();
        return itemsPageInfo;
    }


    @GetMapping("/andusers")
    public List<OrderCustom> listOrdersAndUsers(){
        List<OrderCustom> orderCustoms = ordersDao.listOrderCustom();
        return orderCustoms;
    }

    @GetMapping("/andusers2")
    public List<Orders> listOrdersAndUsers2(){
        List<Orders> orders = ordersDao.listOrderCustom2();
        return orders;
    }

    @GetMapping("/andusers3")
    public List<Orders> listOrdersAndUsers3(){
        List<Orders> orders = ordersDao.lazyListOrderAndDetail();
        return orders;
    }

    @GetMapping("/orderdetails")
    public List<Orders> listOrdersAndDetail(){
        List<Orders> orders = ordersDao.listOrderAndDetail();
        return orders;
    }
}
