package test;

import static org.junit.Assert.fail;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import mapper.UserMapper;
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

}
