package com.amuse.framemongo.dao;

import com.amuse.framemongo.entity.Student;
import org.springframework.stereotype.Repository;

/**
 * @ClassName StudentMongoDbDao
 * @Description TODO
 * @Author 刘培振
 * @Date 2020-06-23 16:34
 * @Version 1.0
 */
@Repository
public class StudentMongoDbDao extends MongoDbDao<Student>{

    @Override
    protected Class<Student> getEntityClass() {
        return Student.class;
    }
}
