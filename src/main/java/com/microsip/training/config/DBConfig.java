package com.microsip.training.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by paco_technogi on 14/03/17.
 */
@Configuration
public class DBConfig {

    @Value("${spring.datasource.username}")
    private String user;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.url}")
    private String dataSourceUrl;

    @Value("${spring.datasource.driverClassName}")
    private String driverClassName;

    @Bean
    public DataSource primaryDatasource() {
        HikariConfig config = new HikariConfig();

        config.setJdbcUrl(dataSourceUrl);
        config.setUsername(user);
        config.setPassword(password);

        config.setConnectionTestQuery("SELECT 1");
        config.setDriverClassName(driverClassName);
        config.setMaxLifetime(50000);
        config.setConnectionTimeout(50000);
        config.setIdleTimeout(50000);
        config.setMaximumPoolSize(10);

        return new HikariDataSource(config);
    }
}
