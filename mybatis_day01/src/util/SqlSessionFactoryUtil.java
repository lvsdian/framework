package util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtil {
	private static SqlSessionFactory sqlSessionFactory;
	static{
		try {
			//����SqlSessionFactoryBuilder����
			SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
			
			//�������������ļ���������
			InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
			//ͨ������������SqlSessionFactory����
			 sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
