package demo02;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import domain.Role;
import domain.User;

public class HibernateDemo1 {

//	/**
//	 * ���������¼���������û��ͽ�ɫ
//	 */
//	@Test
//	public void test1(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//�����û�
//		User user1 = new User();
//		user1.setUser_name("u1");
//		User user2 = new User();
//		user2.setUser_name("u2");
//		
//		//������ɫ
//		Role role1 = new Role();
//		role1.setRole_name("r1");
//		Role role2 = new Role();
//		role2.setRole_name("r2");
//		Role role3 = new Role();
//		role3.setRole_name("r3");
//		
//		//����˫�������ϵ
//		user1.getRoles().add(role1);
//		user1.getRoles().add(role2);
//		user2.getRoles().add(role3);
//		user2.getRoles().add(role1);
//		
//		role1.getUsers().add(user1);
//		role1.getUsers().add(user1);
//		role2.getUsers().add(user2);
//		role3.getUsers().add(user2);
//
//		//�����������Զཨ��˫���ϵʱ��������һ���������ά��
//		//һ���Ǳ���������
//		session.save(user1);
//		session.save(user2);
//		session.save(role1);
//		session.save(role2);
//		session.save(role3);
//		
//		transaction.commit();
//	}
//	
	/**
	 * ��Զ�ֻ����һ�ߣ��ᱨ˲ʱ�����쳣
	 * ��Զ�ļ����������û�������ɫ�����û�ӳ���ļ�������
	 * 				�����ɫ�����û����ڽ�ɫӳ���ļ�������
	 */
//	@Test
//	public void test2(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//һ���û�
//		User user1 = new User();
//		user1.setUser_name("u1");
//		
//		
//		//һ����ɫ
//		Role role1 = new Role();
//		role1.setRole_name("r1");
//		
//		
//		//����˫�������ϵ
//		user1.getRoles().add(role1);
//		
//		role1.getUsers().add(user1);
//		
//		session.save(user1);
//		
//		transaction.commit();
//	}
	
//	/**
//	 * ��Զ༶��ɾ��
//	 * 	ɾ���û�������ɫ	
//	 * 		���û������ļ��м���cascade="delete"
//	 */
//	@Test
//	public void test3(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//��ѯ�û�
//		User user1 = session.get(User.class, 1l);
//		
//		session.delete(user1);
//		
//		transaction.commit();
//	}
	
//	/**
//	 * ��Զ༶��ɾ��
//	 * 	ɾ����ɫ�����û�	
//	 * 		�ڽ�ɫ�����ļ��м���cascade="delete"
//	 */
//	@Test
//	public void test4(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//��ѯ��ɫ
//		Role role = session.get(Role.class, 1l);
//		
//		session.delete(role);
//		
//		transaction.commit();
//	}
	
//	/**
//	 * ��Զ༶��ɾ��
//	 * 	ɾ����ɫ�����û�	
//	 * 		�ڽ�ɫ�����ļ��м���cascade="delete"
//	 */
//	@Test
//	public void test5(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//��ѯ��ɫ
//		Role role = session.get(Role.class, 1l);
//		
//		session.delete(role);
//		
//		transaction.commit();
//	}
	
//	/**
//	 * ���û���ѡ��ɫ
//	 */
//	@Test
//	public void test6(){
//	
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//��ѯ�û�
//		User user = session.get(User.class, 1l);
//		
//		//��ѯ��ɫ
//		Role role1 = session.get(Role.class, 1l);
//		Role role2 = session.get(Role.class, 2l);
//		
//		user.getRoles().remove(role1);
//		user.getRoles().add(role2);
//		
//		transaction.commit();
//	}
//	
}
