package com.imwoniu.mongo;

import com.imwoniu.mongo.config.AppConfig;
import com.imwoniu.mongo.dao.MovieDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Work on 2016/3/1.
 */
public class App {

    public static void main(String[] args) {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        HostingBo host = (HostingBo) ctx.getBean("hostingBoImpl");
//        try {
//            host.save("No.1");
//            host.save("No.2");
//            host.save("No.3");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MovieDao dao = (MovieDao) ctx.getBean("movieDaoImpl");
        try {
            dao.save("AAA", "美剧");
            dao.save("BBB", "国产电视剧");
            dao.save("C", "美剧");
            dao.save("DDDD", "最爱");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
