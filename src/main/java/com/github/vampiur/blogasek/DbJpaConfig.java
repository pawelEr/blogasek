package com.github.vampiur.blogasek;

import org.h2.jdbcx.JdbcDataSource;
import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

@Configuration
@EnableJpaRepositories
@EnableTransactionManagement
public class DbJpaConfig {
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource,@Qualifier("JpaProperties") Properties jpaProperties) {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		factoryBean.setDataSource(dataSource);
		factoryBean.setPackagesToScan("com.github.vampiur.blogasek");
		factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		factoryBean.setJpaProperties(jpaProperties);
		return factoryBean;
	}

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager();
    }
	
	@Bean("JpaProperties")
	public Properties getJpaProperties(){
		Properties properties=new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "create");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		return properties;
	}
	
	@Bean
	public DataSource getDataSource(){
		JdbcDataSource dataSource=new JdbcDataSource();
		dataSource.setUrl("jdbc:h2:~/h2DbBlogasek");
		dataSource.setUser("sa");
		dataSource.setPassword("sa");
		return dataSource;
	}
	
	@Bean(initMethod="start", destroyMethod="stop")
	public Server h2WebServer() throws SQLException{
		return Server.createWebServer("-web","-webAllowOthers","-webPort","8082");
	}
}
