package com.imwoniu.mongo.config;

import com.mongodb.MongoClient;
import com.mongodb.WriteConcern;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * Created by Work on 2016/3/1.
 */
@Configuration
public class MongoConfig {

    public @Bean
    MongoDbFactory mongoDbFactory() throws Exception {
        MongoClient mongo = new MongoClient("123.57.242.222");
        SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(mongo, "test");
        return simpleMongoDbFactory;
    }

    public @Bean
    MongoTemplate mongoTemplate() throws Exception {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());

        // show error, should off on production to speed up performance
        mongoTemplate.setWriteConcern(WriteConcern.SAFE);

        return mongoTemplate;
    }

}
