package com.bdqn.mapper;

import com.bdqn.pojo.StudentInfo;

import java.util.List;

public interface StudentMapper {

    public List<StudentInfo> selAll();

    public int add(StudentInfo studentInfo);

    public StudentInfo selBeen(Integer id);
    public int upBeen(StudentInfo studentInfo);

    public int del(Integer id);
}
