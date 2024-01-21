package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jianwei
 * @email jianwei020518@gmail.com
 * @date 2024-01-04 21:11:37
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
