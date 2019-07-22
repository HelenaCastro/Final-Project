package com.rumos.courses;


import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@Data
public class CoursesController {

    static int ID=1;
    static List<Course> curso = new ArrayList<Course>();


    @GetMapping("/")
    public String newCourse(){
        return "courses";
    }



    @GetMapping("/courses/rumos")
    public String  getCourses(Model model) {

         //List<Course> curso = new ArrayList<Course>();
//        curso.add(new Course("java", 4500d));
//        curso.add(new Course("javaSE", 5000d));
//        curso.add(new Course("javaEE", 5500d));

        model.addAttribute("cursoespetacular", curso);
        return "courses";
    }


@PostMapping("/courses/rumos")
public String add(Course createCourse, Model model) {
   // createCourse.setID(ID++);
    curso.add(createCourse);
    model.addAttribute("cursoespetacular", curso);

    return "courses";

}




//    @PutMapping("/courses/rumos/{name}")
//    @ResponseBody
//    public Course createCourse(@PathVariable ("name") String courseName, @RequestBody Course toUpdate) {
//
//        for(Course m : curso) {
//
//            if(m.getName() == courseName) {
//                m.setName(toUpdate.getName());
//                m.setPrice(toUpdate.getPrice());
//                return m;
//            }
//        }
//
//        throw new RuntimeException("Course not found!");
//    }



}
