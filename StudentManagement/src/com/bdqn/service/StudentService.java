package com.bdqn.service;

import com.bdqn.pojo.StudentInfo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {

    public List<StudentInfo> selAll();

    public int add(StudentInfo studentInfo);

    public StudentInfo selBeen(Integer id);
    public int upBeen(StudentInfo studentInfo);

    public int del(Integer id);
}
