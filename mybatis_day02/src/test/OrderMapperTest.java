package test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import mapper.OrderMapper;
import pojo.Order;
import pojo.OrderUser;
import util.SqlSessionFactoryUtil;

public class OrderMapperTest {

	@Test
	public void testGetOrderUser() {
	
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		List<OrderUser> orderUser = orderMapper.getOrderUser();
		for (OrderUser orderUser1 : orderUser) {
			System.out.println(orderUser1);
		}
		sqlSession.close();
	}
	@Test
	public void testGetOrderUserMap() {
	
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		List<Order> order= orderMapper.getOrderUserMap();
		for (Order orde1 : order) {
			System.out.println(orde1);
		}
		sqlSession.close();
	}

}
