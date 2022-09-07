package kr.co.greenart.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:kr/co/greenart/config/mysql.properties")
@ComponentScan("kr.co.greenart.model.car")
@EnableTransactionManagement
public class RootConfig {
	@Value("${JDBC_DRIVER_CLASS}")
	private String drivername;
	@Value("${JDBC_URL}")
	private String url;
	@Value("${JDBC_UESRNAME}")
	private String username;
	@Value("${JDBC_PASSWORD}")
	private String password;
	
	
//	private DataSource ds;
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(drivername);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
	
	@Bean
	@Autowired
	public JdbcTemplate jdbcTemplate(DataSource ds) {
		return new JdbcTemplate(ds);
	}
	
	@Bean
	public PlatformTransactionManager txmaManager(DataSource ds) {
		return new DataSourceTransactionManager(ds);
	}
}
