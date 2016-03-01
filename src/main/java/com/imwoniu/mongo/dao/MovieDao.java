package com.imwoniu.mongo.dao;

import com.imwoniu.mongo.model.Movie;

import java.util.Date;

/**
 * Created by Work on 2016/3/1.
 */
public interface MovieDao {

    void save(String name, String type);
}
