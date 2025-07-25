package io.alw.css.refdataloader.config;

import io.alw.css.refdataloader.dao.DataLoaderDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DataLoaderDao dataLoaderDao() {
        return new DataLoaderDao();
    }
}
