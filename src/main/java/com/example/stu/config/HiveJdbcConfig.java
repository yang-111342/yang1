package com.example.stu.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Configuration
public class HiveJdbcConfig {
    @Bean(name = "hiveDataSource")
    @ConfigurationProperties(prefix = "hive.datasource.druid")//和yml中的配置项，呼应
    public DataSource dataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "hiveJdbcTemplate")
    public JdbcTemplate getJdbcTemplate(@Qualifier("hiveDataSource") DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    /**
     * 获取hive连接
     */
    public Connection getHiveConnection() throws SQLException {
        return this.dataSource().getConnection();
    }


}
