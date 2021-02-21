package com.amuse.framemongo.repository;

import com.amuse.framemongo.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @ClassName StudentRepository
 * @Description TODO
 * @Author 刘培振
 * @Date 2020-06-23 14:42
 * @Version 1.0
 */
public interface StudentRepository extends MongoRepository<Student, String> {

}
