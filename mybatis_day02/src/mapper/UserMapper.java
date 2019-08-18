package mapper;

import java.util.List;

import pojo.QueryVo;
import pojo.User;

public interface UserMapper {

	public User getUserById(Integer id);
	public List<User> getUserByUsername (String username);
	public void insertUser(User user);
	public List<User> getUserByQueryVo(QueryVo queryVo);
	List<User> getUserByPojo(User user);//if��ǩ
	List<User> getUserByIds(QueryVo queryVo);//foreach��ǩ
	List<User> getUserOrderMap();//��ʾһ�Զ����
}
