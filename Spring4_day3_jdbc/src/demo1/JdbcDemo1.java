package demo1;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcDemo1 {

	@Test
	public void demo1(){
		
		//�������ӳ�
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql:///spring4_day03?useSSL=true&amp;useUnicode=true&amp;characterEncoding=UTF-8");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root");
		
		//����jdbcģ��
		JdbcTemplate jdbcTemplate = new JdbcTemplate(driverManagerDataSource);
		jdbcTemplate.update("insert into account values(null,?,?)","����",100d);
	}
}
