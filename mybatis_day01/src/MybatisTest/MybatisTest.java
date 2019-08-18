package MybatisTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import pojo.User;
import util.SqlSessionFactoryUtil;

public class MybatisTest {

	@Test
	public void testGetUserById() throws IOException{

		//����SqlSessionFactoryBuilder����
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		
		//�������������ļ���������
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
	
		//ͨ������������SqlSessionFactory����
		SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
	
		//����sqlSession����
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//ִ�в�ѯ
		User user1 = sqlSession.selectOne("user.getUserById", 1);
		System.out.println(user1);
		
		//�ͷ���Դ
		sqlSession.close();
	}
	
	@Test
	public void TestGetUserByUserName(){
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();
		
//		List<User> list = sqlSession.selectList("user.getUserByUsername", "%��%");
//		DEBUG [main] - ==>  Preparing: SELECT `id`, `username`, `birthday`, `sex`, `address` FROM `mybatis`.`user` where username like ? 
//		DEBUG [main] - ==> Parameters: %��%(String)
		
		List<User> list = sqlSession.selectList("user.getUserByUsername", "��");
//		DEBUG [main] - ==>  Preparing: SELECT `id`, `username`, `birthday`, `sex`, `address` FROM `mybatis`.`user` where username like '%��%' 
//		DEBUG [main] - ==> Parameters: 
		for (User user : list) {
			System.out.println(user);
		}
		sqlSession.close();
	}
	
	@Test
	public void TestInsertUser(){
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();//������ﴫ��Ϊtrue,�ͱ�ʾ�Զ��ύ����
		User user = new  User("������3","1",new Date(),"������ʯ");
		sqlSession.insert("user.insertUser", user);
		System.out.println(user);//�õ��˲�����������ݵ�id
		//User [id=29, username=������3, sex=1, birthday=Wed Aug 15 16:38:25 CST 2018, address=������ʯ]
		//�ύ����
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void TestInsertUserUUID(){
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();//������ﴫ��Ϊtrue,�ͱ�ʾ�Զ��ύ����
		User user = new  User("����","1",new Date(),"����");
		sqlSession.insert("user.insertUserUUID", user);
		System.out.println(user);//�õ��˲�����������ݵ�uuid
		//User [id=29, username=����, sex=1, birthday=Wed Aug 16 16:38:25 CST 2018, address=���� 19BD-ED6B-C4D6-45FB-BC4C-7884-29B7-21F9]
		//�ύ����
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void TestUpdateUser(){
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();//������ﴫ��Ϊtrue,�ͱ�ʾ�Զ��ύ����
		User user = new  User();
		user.setId(1);
		user.setUsername("����5");
		sqlSession.update("user.updateUser", user);
		//�ύ����
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void TestDeleteUser(){
		SqlSession sqlSession = SqlSessionFactoryUtil.getSqlSessionFactory().openSession();//������ﴫ��Ϊtrue,�ͱ�ʾ�Զ��ύ����
		sqlSession.delete("user.deleteUser", 30);
		//�ύ����
		sqlSession.commit();
		sqlSession.close();
	}
}
