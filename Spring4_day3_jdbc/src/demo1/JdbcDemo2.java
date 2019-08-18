package demo1;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import demo2.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcDemo2 {

	@Resource(name="JdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	@Test
	//保存操作
	public void test1(){
		jdbcTemplate.update("insert into account values(null,?,?)","张如花",400d);
	}
	
	@Test
	//修改操作
	public void test2(){
		jdbcTemplate.update("update account set name = ?,money = ? where id = ?","张如花",500d,6);
	}
	
	@Test
	//删除操作
	public void test3(){
		jdbcTemplate.update("delete from account  where id = ?",7);
	}
	
	@Test
	//查询操作
	public void test4(){
		String name = jdbcTemplate.queryForObject("select name from account where id = ?",String.class,6);
		System.out.println(name);
	}
	
	@Test
	//统计查询
	public void test5(){
		Long count = jdbcTemplate.queryForObject("select count(*) from account ",Long.class);
		System.out.println(count);
	}
	
	@Test
	//封装到对象中
	public void test6(){
		Account account = jdbcTemplate.queryForObject("select *from account where id = ? ",new MyRowMapper(),6);
		System.out.println(account);
	}
	
	class MyRowMapper implements RowMapper<Account>{
		@Override
		public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
			Account account = new Account(rs.getInt("id"),rs.getString("name"), rs.getDouble("money"));
			return account;
		}
	}
	
}
