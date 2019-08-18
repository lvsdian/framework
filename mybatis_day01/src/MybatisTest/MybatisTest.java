package MybatisTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import pojo.User;
import util.SqlSessionFactoryUtil;

public class MybatisTest {

	@Test
	public void testGetUserById() throws IOException{

		//创建SqlSessionFactoryBuilder对象
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		
		//创建核心配置文件的输入流
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
	
		//通过输入流创建SqlSessionFactory对象
		SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
	
		//创建sqlSession对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//执行查询
		User user1 = sqlSession.selectOne("user.getUserById", 1);
		System.out.println(user1);
		
		//释放资源
		sqlSession.close();
	}
	
	@Test
	public void TestGetUserByUserName(){
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		
//		List<User> list = sqlSession.selectList("user.getUserByUsername", "%张%");
//		DEBUG [main] - ==>  Preparing: SELECT `id`, `username`, `birthday`, `sex`, `address` FROM `mybatis`.`user` where username like ? 
//		DEBUG [main] - ==> Parameters: %张%(String)
		
		List<User> list = sqlSession.selectList("user.getUserByUsername", "张");
//		DEBUG [main] - ==>  Preparing: SELECT `id`, `username`, `birthday`, `sex`, `address` FROM `mybatis`.`user` where username like '%张%' 
//		DEBUG [main] - ==> Parameters: 
		for (User user : list) {
			System.out.println(user);
		}
		sqlSession.close();
	}
	
	@Test
	public void TestInsertUser(){
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();//如果这里传参为true,就表示自动提交事务
		User user = new  User("张三三3","1",new Date(),"湖北黄石");
		sqlSession.insert("user.insertUser", user);
		System.out.println(user);//得到了插入的这条数据的id
		//User [id=29, username=张三三3, sex=1, birthday=Wed Aug 15 16:38:25 CST 2018, address=湖北黄石]
		//提交事务
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void TestInsertUserUUID(){
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();//如果这里传参为true,就表示自动提交事务
		User user = new  User("张三","1",new Date(),"湖北");
		sqlSession.insert("user.insertUserUUID", user);
		System.out.println(user);//得到了插入的这条数据的uuid
		//User [id=29, username=张三, sex=1, birthday=Wed Aug 16 16:38:25 CST 2018, address=湖北 19BD-ED6B-C4D6-45FB-BC4C-7884-29B7-21F9]
		//提交事务
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void TestUpdateUser(){
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();//如果这里传参为true,就表示自动提交事务
		User user = new  User();
		user.setId(1);
		user.setUsername("张三5");
		sqlSession.update("user.updateUser", user);
		//提交事务
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void TestDeleteUser(){
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();//如果这里传参为true,就表示自动提交事务
		sqlSession.delete("user.deleteUser", 30);
		//提交事务
		sqlSession.commit();
		sqlSession.close();
	}
}
