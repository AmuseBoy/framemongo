package com.amuse.framemongo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

/**
 * @ClassName MongoDbDao
 * @Description TODO
 * @Author 刘培振
 * @Date 2020-06-23 16:23
 * @Version 1.0
 */
public abstract class MongoDbDao<T> {

    @Autowired
    private MongoTemplate mongoTemplate;

    protected abstract Class<T> getEntityClass();

    public void save(T t){
        mongoTemplate.save(t);
    }

    public T queryById(String id){
        Query query = new Query(Criteria.where("_id").is(id));
        return mongoTemplate.findOne(query, this.getEntityClass());
    }

}
