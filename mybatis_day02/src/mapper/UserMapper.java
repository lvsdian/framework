package mapper;

import java.util.List;

import pojo.QueryVo;
import pojo.User;

public interface UserMapper {

	public User getUserById(Integer id);
	public List<User> getUserByUsername (String username);
	public void insertUser(User user);
	public List<User> getUserByQueryVo(QueryVo queryVo);
	List<User> getUserByPojo(User user);//if标签
	List<User> getUserByIds(QueryVo queryVo);//foreach标签
	List<User> getUserOrderMap();//演示一对多关联
}
