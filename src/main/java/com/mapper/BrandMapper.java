package com.mapper;


import com.domain.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 飛
* @description 针对表【tb_brand】的数据库操作Mapper
* @createDate 2022-04-23 09:45:10
* @Entity generator.domain.Brand
*/

public interface BrandMapper  {
    //查询
    List<Brand> selectAll();
    //添加
    int insert(Brand brand);
    //删除
    int deleteById(@Param("id") int id);
    //通过id查询
    Brand selectById(@Param("id") int id);
    //更新
    int update(Brand brand);

}
