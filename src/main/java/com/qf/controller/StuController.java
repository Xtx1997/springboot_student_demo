package com.qf.controller;

import com.qf.entity.Student;
import com.qf.servive.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StuController {

    @Autowired
    private IStuService stuService;

   @RequestMapping("/list")
    public String list(Model model){
       List<Student> stu=stuService.list();
       System.out.println(stu);
       model.addAttribute("stus",stu);
        return "stulist";
    }

    @RequestMapping("/delete")
    public  String delete(Integer id){
       stuService.removeById(id);
       return  "redirect:/stu/list";
    }

}
