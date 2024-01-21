package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
//        BrandEntity brand = new BrandEntity();
////        brand.setName("HuaWei");
////        brandService.save(brand);
////        System.out.println("Save successfully.");
//        brand.setBrandId(13L);
//        brand.setDescript("Cheap and good");
//        brandService.updateById(brand);
        List<BrandEntity> brandId = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 13L));
        brandId.forEach((item)-> System.out.println(item));
            
        }
    }


