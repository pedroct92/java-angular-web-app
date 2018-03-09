package com.spring.restapi;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 *
 * @author amanganiello90 General configuration. It enables embedded mongo db
 */
@Configuration
@ComponentScan(basePackages = { "${db.package}" })
@EnableMongoRepositories(basePackages = { "${db.package}" })
public class Config {

}
