package demo1;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcDemo1 {

	@Test
	public void demo1(){
		
		//创建连接池
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql:///spring4_day03?useSSL=true&amp;useUnicode=true&amp;characterEncoding=UTF-8");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root");
		
		//创建jdbc模板
		JdbcTemplate jdbcTemplate = new JdbcTemplate(driverManagerDataSource);
		jdbcTemplate.update("insert into account values(null,?,?)","张三",100d);
	}
}
