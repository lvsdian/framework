package mapper;

import java.util.List;

import pojo.Order;
import pojo.OrderUser;

public interface OrderMapper {

	List<OrderUser> getOrderUser();//resultType��Order��Userһ��һ
	List<Order> getOrderUserMap();//resultMap��Order��Userһ��һ
}
