package com.rumos.courses;


import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CoursesController {


    @GetMapping("/courses")
    public String newCourse(){
        return "courses";
    }


    @GetMapping("/courses/rumos")
    public String  getCourses(Model model) {

        Course curso = new Course("adoroJava");

        model.addAttribute("cursoespetacular", curso);
        return "courses";
    }
//
//    @PostMapping("courses/rumos")
//    @ResponseBody
//    public Courses createCourse(@RequestBody Courses){
//
//        courses.add()
//    }


}
