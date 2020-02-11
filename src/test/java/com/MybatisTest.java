package com;

import com.Mapper.IUserMapper;
import com.Pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    public static void main (String[] args) throws Exception {
        //读配置文件
        InputStream in = Resources.getResourceAsStream("Mybatis/MapperConfig.xml");
        //创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //使用工厂生产SqlSession对象
        SqlSession session = factory.openSession();
        //使用SqlSession创建Mapper接口的代理对象
        IUserMapper userMapper = session.getMapper(IUserMapper.class);
        //使用代理对象执行方法
        List<User> users = userMapper.findAll();
        for (User user : users){
            System.out.println(user);
        }
        session.close();
        in.close();
    }

}
