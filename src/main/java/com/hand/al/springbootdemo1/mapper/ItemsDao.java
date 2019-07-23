package com.hand.al.springbootdemo1.mapper;

import com.hand.al.springbootdemo1.baseMapper.BaseMapper;
import com.hand.al.springbootdemo1.vo.OrderCustom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.hand.al.springbootdemo1.pojo.Items;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ItemsDao extends BaseMapper<Items> {

}
