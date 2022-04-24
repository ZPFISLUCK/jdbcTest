package com.service.impl;


import com.domain.Brand;
import com.mapper.BrandMapper;
import com.service.BrandService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author 飛
 * @description 针对表【tb_brand】的数据库操作Service实现
 * @createDate 2022-04-23 09:45:10
 */

public class BrandServiceImpl implements BrandService {
    //加载核心配置文件
    InputStream is;

    {
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //获取工厂对象的构造对象
    SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
    //获取工厂对象
    SqlSessionFactory sessionFactory = sqlSessionFactoryBuilder.build(is);
    //获取java程序和数据库之间会话对象
    @Override
    public List<Brand> selectAll() {
        SqlSession sqlSession = sessionFactory.openSession();
        //获取mapper接口对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = mapper.selectAll();
        sqlSession.close();
        return brands;
    }

    @Override
    public int insert(Brand brand) {
        SqlSession sqlSession = sessionFactory.openSession();
        //获取mapper接口对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        int insert = mapper.insert(brand);
        sqlSession.commit();
        sqlSession.close();
        return insert;
    }

    @Override
    public int deleteById(int id) {
        SqlSession sqlSession = sessionFactory.openSession();
        //获取mapper接口对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        int i = mapper.deleteById(id);
        sqlSession.commit();
        sqlSession.close();
        return i;
    }

    @Override
    public Brand selectById(int id) {
        SqlSession sqlSession = sessionFactory.openSession();
        //获取mapper接口对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = mapper.selectById(id);
        sqlSession.close();
        return brand;
    }

    @Override
    public int update(Brand brand) {
        SqlSession sqlSession = sessionFactory.openSession();
        //获取mapper接口对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        int i = mapper.update(brand);
        sqlSession.commit();
        sqlSession.close();
        return i;
    }
}
