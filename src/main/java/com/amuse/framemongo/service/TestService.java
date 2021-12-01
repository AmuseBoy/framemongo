package com.amuse.framemongo.service;

import com.amuse.framemongo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestService
 * @Description TODO
 * @Author 刘培振
 * @Date 2021-07-08 15:13
 * @Version 1.0
 */
@Service
public class TestService {

    @Autowired
    private StudentRepository studentRepository;
}
