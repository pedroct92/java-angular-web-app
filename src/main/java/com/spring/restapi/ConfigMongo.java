package com.spring.restapi;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Profile({"mongo","mongop"})
@Configuration
@EnableMongoRepositories(basePackages = { "${db.package}" })
public class ConfigMongo {

}
