package demo1;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("UserService")//�൱��������bean��ǩ
public class UserServiceImpl implements UserService {

	//ע��Dao��ע����ͨ������value
	/**
			@Autowired//(ע��������ͣ�ע����ͨ������@Value)
			@Qualifier(value="UserDao")//�˴���valueֵ������UserDao��ע��ֵһ�£�
			//����@Qualifier��@Autowired��������ʹ��
			//������ע�������@Resource���
	 */
	
	@Resource(name="UserDao")
	private UserDao userDao;

	@Override
	public void save() {
		userDao.save();
	}

}
