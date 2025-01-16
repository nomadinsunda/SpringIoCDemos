package com.intheeast.ioc.beanoverview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AliasConfig {

    @Bean(name = {"primaryDataSource", "subsystemA-dataSource", "subsystemB-dataSource"})
    @Primary
    public DataSource dataSource() {
        return new DataSource();
    }
}

class DataSource {
    public DataSource() {
        System.out.println("DataSource created.");
    }
}