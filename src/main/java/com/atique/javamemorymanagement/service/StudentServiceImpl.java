package com.atique.javamemorymanagement.service;

import com.atique.javamemorymanagement.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

//    private static final List<String> studentIds = new ArrayList<>();


    /**
     * @param name
     * @return
     */
    @Override
    public Student create(String name) {

        //Very bad code which will generate heap issues

        //        log.info("name: {}", name);

        //UUID studentId = UUID.randomUUID();

//        if (!studentIds.contains(studentId.toString())) {
//            studentIds.add(studentId.toString());
//        }

        //return Student.builder().name(name).id(studentId.toString()).build();

        //Solution
        return Student.builder().name(name).id(UUID.randomUUID().toString()).build();
    }
}
