package com.imwoniu.mongo.dao.impl;

import com.imwoniu.mongo.dao.HostingBo;
import com.imwoniu.mongo.dao.SequenceDao;
import com.imwoniu.mongo.exception.SequenceException;
import com.imwoniu.mongo.model.Hosting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Work on 2016/3/1.
 */
@Repository
public class HostingBoImpl implements HostingBo {

    private static final String HOSTING_SEQ_KEY = "hosting";

    @Autowired
    private SequenceDao sequenceDao;

    @Autowired
    private MongoOperations mongoOperations;

    @Override
    public void save(String name) throws SequenceException {

        Hosting hosting = new Hosting();

        try {
            hosting.setId(sequenceDao.getNextSequenceId(HOSTING_SEQ_KEY));
        } catch (Exception e) {
            e.printStackTrace();
        }

        hosting.setName(name);
        hosting.setAge(11);
        hosting.setAddress("望京SOHO17层");
        mongoOperations.save(hosting);

    }
}
