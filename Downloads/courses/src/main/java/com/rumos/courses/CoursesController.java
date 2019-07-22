package com.rumos.courses;


import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
@Data
public class CoursesController {

    static int ID = 1;
    static List<Course> curso = new CopyOnWriteArrayList<>();


    @GetMapping("/")
    public String newCourse() {
        return "courses";
    }


    @GetMapping("/courses/rumos")
    public String getCourses(Model model) {

        model.addAttribute("cursoespetacular", curso);
        return "courses";
    }


    @PostMapping("/courses/rumos")
    public String add(Course createCourse, Model model) {

        createCourse.setID(ID++);
        curso.add(createCourse);

        model.addAttribute("cursoespetacular", curso);

        return "courses";
    }

    @GetMapping("/courses/rumos/delete/{id}")
    public ModelAndView delete(@PathVariable("id") int courseId, Model model) {
        System.out.println("courseId");
        deleteCourse(courseId);
        model.addAttribute("cursoespetacular", curso);
        return new ModelAndView("redirect:/courses/rumos");

    }

    private void deleteCourse(int courseId){
        for (Course c : curso) {
            if (c.getID() == courseId) {
                curso.remove(c);
            }
        }
    }
}







