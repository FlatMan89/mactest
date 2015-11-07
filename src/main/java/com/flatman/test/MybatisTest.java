package com.flatman.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.flatman.entity.User;

public class MybatisTest {

	public static void main(String[] args) {
		//mybatis的配置文件
		String resource = "conf.xml";
		
		//使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
		InputStream is = MybatisTest.class.getClassLoader().getResourceAsStream(resource);
		
		//构建sqlSession的工厂
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		
		//创建能执行映射文件中sql的sqlSession
		SqlSession session = sessionFactory.openSession();
		
		String statement = "com.flatman.mybatis.mapping.userMapper.getUser";
		
		User user = session.selectOne(statement, 1);
		System.out.println(user);
		
		// 插入一条数据
		User u1 = new User();
		u1.setAge(29);
		u1.setName("张三");
		u1.setUsername("zhangsan");
		u1.setPassword("zhangsan");
		
		statement = "com.flatman.mybatis.mapping.userMapper.insertUser";
		session.insert(statement,u1);
		
		session.commit();
		
		session.close();
		
		
	}

}
