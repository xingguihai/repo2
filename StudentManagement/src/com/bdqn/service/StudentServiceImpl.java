package com.bdqn.service;

import com.bdqn.mapper.StudentMapper;
import com.bdqn.pojo.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<StudentInfo> selAll() {
        return studentMapper.selAll();
    }

    @Override
    public int add(StudentInfo studentInfo) {
        return studentMapper.add(studentInfo);
    }

    @Override
    public StudentInfo selBeen(Integer id) {
        return studentMapper.selBeen(id);
    }

    @Override
    public int upBeen(StudentInfo studentInfo) {
        return studentMapper.upBeen(studentInfo);
    }

    @Override
    public int del(Integer id) {
        return studentMapper.del(id);
    }
}
