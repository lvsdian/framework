package demo1;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("UserService")//相当于配置了bean标签
public class UserServiceImpl implements UserService {

	//注入Dao，注入普通类型用value
	/**
			@Autowired//(注入对象类型，注入普通类型用@Value)
			@Qualifier(value="UserDao")//此处的value值必须与UserDao的注解值一致，
			//而且@Qualifier与@Autowired必须配套使用
			//这两个注解可以用@Resource替代
	 */
	
	@Resource(name="UserDao")
	private UserDao userDao;

	@Override
	public void save() {
		userDao.save();
	}

}
