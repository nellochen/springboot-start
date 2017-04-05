package com.xiaofeng.config;

import org.springframework.context.annotation.Configuration;


/**
 * @author Chen Xiaofeng
 * @version 1.0.0
 * @date 2017/03/27
 * @email chenxf84@gmail.com
 */

@Configuration
public class DataSourceConfig {

//    @Bean
//    @Primary
//    @ConfigurationProperties(prefix = "spring.datasource.primary")
//    public DataSourceProperties primaryDataSourceProperties() {
//        return new DataSourceProperties();
//    }
//
//    @Bean(name = "primaryDataSource")
//    @Primary
//    @ConfigurationProperties(prefix = "spring.datasource.primary")
//    public DataSource primaryDataSource() {
//        return primaryDataSourceProperties().initializeDataSourceBuilder().build();
//    }
//
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource.secondary")
//    public DataSourceProperties secondaryDataSourceProperties() {
//        return new DataSourceProperties();
//    }
//
//    @Bean(name = "secondaryDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.secondary")
//    public DataSource secondaryDataSource() {
//        return secondaryDataSourceProperties().initializeDataSourceBuilder().build();
//    }
//
//
//    @Bean(name = "primaryJdbcTemplate")
//    @Primary
//    public JdbcTemplate primaryJdbcTemplate(@Qualifier("primaryDataSource") DataSource dataSource){
//        return new JdbcTemplate(dataSource);
//    }
//
//    @Bean(name = "secondaryJdbcTemplate")
//    public JdbcTemplate psecondaryJdbcTemplate(@Qualifier("secondaryDataSource") DataSource dataSource){
//        return new JdbcTemplate(dataSource);
//    }
}
