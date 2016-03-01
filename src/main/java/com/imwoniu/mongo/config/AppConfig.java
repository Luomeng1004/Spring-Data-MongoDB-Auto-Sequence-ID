package com.imwoniu.mongo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Work on 2016/3/1.
 */
@Configuration
@ComponentScan({"com.imwoniu.mongo.*"})
@Import({MongoConfig.class})
public class AppConfig {



}
