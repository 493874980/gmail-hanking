package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wxl
 * @email 493874980@qq.com
 * @date 2020-02-21 01:04:19
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
