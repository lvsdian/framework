package mapper;

import java.util.List;

import pojo.User;

public interface UserMapper {

	public User getUserById(Integer id);
	public List<User> getUserByUsername (String username);
	public void insertUser(User user);
}
