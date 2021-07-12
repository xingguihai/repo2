package com.bdqn.controller;

import com.bdqn.pojo.StudentInfo;
import com.bdqn.service.StudentService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/all")
    public String All(Model model){
        List<StudentInfo> studentInfos = studentService.selAll();
        model.addAttribute("sList",studentInfos);
        return "index";
    }
    @RequestMapping(value = "/goAdd")
    public String goAdd(){
        return "add";
    }

    @RequestMapping(value = "/toAdd")
    public String toAdd(StudentInfo studentInfo){
       studentService.add(studentInfo);
       return "redirect:all";
    }
    @RequestMapping(value = "/goUp")
    public String goUpdate(Integer sId, Model model){
        StudentInfo studentInfo = studentService.selBeen(sId);
        model.addAttribute("stud",studentInfo);
        return "update";
    }
    @RequestMapping(value = "/toUp")
    public String toUpdate(StudentInfo studentInfo){
        studentService.upBeen(studentInfo);
        return "redirect:all";
    }
    @RequestMapping(value = "/toDel")
    public String del(Integer id){
        studentService.del(id);
        return "redirect:all";
    }
}
