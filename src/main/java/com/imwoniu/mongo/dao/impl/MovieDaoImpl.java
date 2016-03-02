package com.imwoniu.mongo.dao.impl;

import com.imwoniu.mongo.dao.MovieDao;
import com.imwoniu.mongo.dao.SequenceDao;
import com.imwoniu.mongo.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * Created by Work on 2016/3/1.
 */
@Repository
public class MovieDaoImpl implements MovieDao {

    private static final String COLLECTION_NAME = "movie";

    @Autowired
    private SequenceDao sequenceDao;

    @Autowired
    private MongoOperations mongoOperations;

    @Override
    public void save(String name, String type) {

        Movie movie = new Movie();

        try {
            movie.setId(sequenceDao.getNextSequenceId(COLLECTION_NAME));
        } catch (Exception e) {
            e.printStackTrace();
        }

        movie.setName(name);
        movie.setTypeName(type);
        movie.setDatetime(new Date());

        mongoOperations.save(movie, COLLECTION_NAME);

    }
}
