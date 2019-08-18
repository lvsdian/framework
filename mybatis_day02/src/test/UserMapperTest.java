package test;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import mapper.UserMapper;
import pojo.QueryVo;
import pojo.User;
import util.SqlSessionFactoryUtil;

public class UserMapperTest {

	@Test
	public void testGetUserById() {
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		//获取接口的代理实现类
	
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		User user = userMapper.getUserById(30);
		System.out.println(user);
		sqlSession.close();
	}

	@Test
	public void testGetUserByUsername() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertUser() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetUserByQueryVo(){
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user1 = new User();
		//user1.setUsername("a");
		QueryVo queryVo = new QueryVo();
		queryVo.setUser(user1);
		List <User> users = userMapper.getUserByQueryVo(queryVo);
		for (User user2 : users) {
			System.out.println(user2);
		}
		sqlSession.close();
	}
	
	@Test
	public void testGetUserByPojo(){
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		User user1 = new User();
		user1.setUsername("a");
		user1.setSex("1");
		List <User> users = userMapper.getUserByPojo(user1);
		for (User user2 : users) {
			System.out.println(user2);
		}
		sqlSession.close();
	}
	
	@Test
	public void testGetUserByIds(){
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		QueryVo queryVo = new QueryVo();
		queryVo.setIds(Arrays.asList(25,26,27,28,29,30));
		List<User> users = userMapper.getUserByIds(queryVo);
		for (User user2 : users) {
			System.out.println(user2);
		}
		sqlSession.close();
	}
	
	@Test
	public void testGetUserOrderMap(){
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> users = userMapper.getUserOrderMap();
		for (User user2 : users) {
			System.out.println(user2);
		}
		sqlSession.close();
	}
}
