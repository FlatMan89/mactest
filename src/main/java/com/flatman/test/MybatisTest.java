package com.flatman.test;

import java.io.InputStream;
import java.util.List;

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
		
		String statement = dof("getUser");
		
		User user = session.selectOne(statement, 6);
		System.out.println(user);
		
		// 插入一条数据
		User u1 = new User();
		u1.setAge(29);
		u1.setName("张三");
		u1.setUsername("zhangsan");
		u1.setPassword("");
		
		statement = dof("insertUser");
		session.insert(statement,u1);
		
		statement = dof("findAll");
		List<User> users = session.selectList(statement);
		
		for (User user2 : users) {
			System.out.println(user2);
		}
		
		session.commit();
		
		session.close();
		
		
	}
	
	public static String dof(String doSome){
		return "com.flatman.mybatis.mapping.userMapper."+doSome;
	}

}
