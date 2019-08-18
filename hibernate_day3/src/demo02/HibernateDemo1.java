package demo02;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import domain.Role;
import domain.User;

public class HibernateDemo1 {

//	/**
//	 * 保存多条记录：保存多个用户和角色
//	 */
//	@Test
//	public void test1(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//两个用户
//		User user1 = new User();
//		user1.setUser_name("u1");
//		User user2 = new User();
//		user2.setUser_name("u2");
//		
//		//三个角色
//		Role role1 = new Role();
//		role1.setRole_name("r1");
//		Role role2 = new Role();
//		role2.setRole_name("r2");
//		Role role3 = new Role();
//		role3.setRole_name("r3");
//		
//		//设置双向关联关系
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
//		//保存操作，多对多建立双向关系时，必须有一方放弃外键维护
//		//一般是被动方放弃
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
	 * 多对多只保存一边，会报瞬时对象异常
	 * 多对多的级联，保存用户级联角色，在用户映射文件中设置
	 * 				保存角色级联用户，在角色映射文件中设置
	 */
//	@Test
//	public void test2(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//一个用户
//		User user1 = new User();
//		user1.setUser_name("u1");
//		
//		
//		//一个角色
//		Role role1 = new Role();
//		role1.setRole_name("r1");
//		
//		
//		//设置双向关联关系
//		user1.getRoles().add(role1);
//		
//		role1.getUsers().add(user1);
//		
//		session.save(user1);
//		
//		transaction.commit();
//	}
	
//	/**
//	 * 多对多级联删除
//	 * 	删除用户级联角色	
//	 * 		在用户配置文件中加上cascade="delete"
//	 */
//	@Test
//	public void test3(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//查询用户
//		User user1 = session.get(User.class, 1l);
//		
//		session.delete(user1);
//		
//		transaction.commit();
//	}
	
//	/**
//	 * 多对多级联删除
//	 * 	删除角色级联用户	
//	 * 		在角色配置文件中加上cascade="delete"
//	 */
//	@Test
//	public void test4(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//查询角色
//		Role role = session.get(Role.class, 1l);
//		
//		session.delete(role);
//		
//		transaction.commit();
//	}
	
//	/**
//	 * 多对多级联删除
//	 * 	删除角色级联用户	
//	 * 		在角色配置文件中加上cascade="delete"
//	 */
//	@Test
//	public void test5(){
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//查询角色
//		Role role = session.get(Role.class, 1l);
//		
//		session.delete(role);
//		
//		transaction.commit();
//	}
	
//	/**
//	 * 给用户改选角色
//	 */
//	@Test
//	public void test6(){
//	
//		Session session = HibernateUtils.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
//		
//		//查询用户
//		User user = session.get(User.class, 1l);
//		
//		//查询角色
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
