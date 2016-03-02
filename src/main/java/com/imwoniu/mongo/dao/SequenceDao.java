package com.imwoniu.mongo.dao;

/**
 * Created by Work on 2016/3/1.
 */
public interface SequenceDao {
    long getNextSequenceId(String key) throws Exception;
}
