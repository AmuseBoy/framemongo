package com.amuse.framemongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @ClassName Student
 * @Description TODO
 * @Author 刘培振
 * @Date 2020-06-23 14:38
 * @Version 1.0
 */
@Document(collection = "student")
public class Student {

    @Id
    private String id;

    @Field
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
