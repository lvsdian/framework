package mapper;

import java.util.List;

import pojo.Order;
import pojo.OrderUser;

public interface OrderMapper {

	List<OrderUser> getOrderUser();//resultType的Order与User一对一
	List<Order> getOrderUserMap();//resultMap的Order与User一对一
}
