package day32;

import java.sql.Connection;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariDBConnectionPPP {
	private static HikariDataSource dataSource;
	
	static
	{
		 	HikariConfig config = new HikariConfig();

	        config.setJdbcUrl("jdbc:mysql://localhost:3306/pppdb");
	        config.setUsername("root");
	        config.setPassword("");

	        config.setMaximumPoolSize(10);
	        config.setMinimumIdle(5);
	        config.setIdleTimeout(30000);
	        config.setConnectionTimeout(30000);
	        config.setMaxLifetime(1800000);

	        dataSource = new HikariDataSource(config);
	}
	
	public static Connection getConnection()throws Exception 
	{
		return dataSource.getConnection();
	}
}
