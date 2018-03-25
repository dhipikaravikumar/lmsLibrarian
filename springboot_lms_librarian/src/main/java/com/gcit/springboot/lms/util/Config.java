package com.gcit.springboot.lms.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.gcit.springboot.lms")
@Configuration
//@EnableTransactionManagement
public class Config {

	Logger logger = LoggerFactory.getLogger(Config.class);

//	public final String driver = "com.mysql.cj.jdbc.Driver";
//	public final String url = "jdbc:mysql://localhost/library?useSSL=false";
//	public final String username = "root";
//	public final String password = "admin";
	
//	ConnectionUtil connUtil = new ConnectionUtil();

//	@Bean
//	public BasicDataSource dataSource() {
//		BasicDataSource bds = new BasicDataSource();
//		bds.setDriverClassName(driver);
//		bds.setUrl(url);
//		bds.setUsername(username);
//		bds.setPassword(password);
//		return bds;
//	}
//	
//	@Bean
//	public JdbcTemplate jdbcTemplate() {
//		return new JdbcTemplate();
//	}
	
	
//	@Bean
//	public BranchDAO branchDAO() {
//		return new BranchDAO();
//	}
	
	
//	@Bean
//	public CopyDAO copyDAO() {
//		return new CopyDAO();
//	}
//	



}
