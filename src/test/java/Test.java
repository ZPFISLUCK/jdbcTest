import com.domain.Brand;
import com.mapper.BrandMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    @org.junit.Test
    public void testMybatis() throws IOException {
//加载核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//获取工厂对象的构造对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//获取工厂对象
        SqlSessionFactory sessionFactory = sqlSessionFactoryBuilder.build(is);
//获取java程序和数据库之间会话对象
        SqlSession sqlSession = sessionFactory.openSession();
//获取mapper接口对象
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
//测试功能
        List<Brand> brands = mapper.selectAll();

    }
}

