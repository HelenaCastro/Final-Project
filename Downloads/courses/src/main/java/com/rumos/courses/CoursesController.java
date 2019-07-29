package com.rumos.courses;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jms.Queue;
import java.util.List;

import java.util.concurrent.CopyOnWriteArrayList;



@Controller
@Data
public class CoursesController {

    @Autowired
    CourseService curso;

    @Autowired
    JmsTemplate jmsTemplate;


    //static int ID = 1;
    //static List<Course> curso = new CopyOnWriteArrayList<>();


    @GetMapping("/")
    public String newCourse() {
        return "courses";
    }


    @GetMapping("/courses/rumos")
    public String getCourses(Model model) {

        model.addAttribute("cursoespetacular", curso.getCurso());
        return "courses";
    }


    @PostMapping("/courses/rumos")
    public String add(Course createCourse, Model model) {
        model.addAttribute("cursoespetacular", curso.getCurso());
        AddCourse(createCourse);
//        createCourse.setID(ID++);
//        curso.add(createCourse);

        //model.addAttribute("cursoespetacular", curso);

        return "courses";
    }

    private Course AddCourse(Course cursos) {
        Course addCourse = new Course();

        addCourse.setID(curso.getCurso().size() + 1);
        addCourse.setName(cursos.getName());
        addCourse.setPrice(cursos.getPrice());
        curso.getCurso().add(addCourse);
        return addCourse;

    }


    @GetMapping("/courses/rumos/delete/{id}")
    public ModelAndView delete(@PathVariable("id") int courseId, Model model) {
        //System.out.println("courseId");
        deleteCourse(courseId);
        model.addAttribute("cursoespetacular", curso.getCurso());
        return new ModelAndView("redirect:/courses/rumos");

    }

    private void deleteCourse(int courseId) {
        for (Course c : curso.getCurso()) {
            if (c.getID() == courseId) {
                curso.getCurso().remove(c);
            }
        }
    }



    @RequestMapping("/courses/rumos/update{Id}")
    public String getUpdate(int Id, Model model){
        System.out.println("updateDaTreta");
        model.addAttribute("add", getSpecificCourse(Id));
        return "update";
    }

    @PostMapping("/courses/rumos/update")
   public String updateAddForm(Course ad){
        updateAdd(ad);
        //jmsTemplate.convertAndSend();
        return "redirect:/courses/rumos";
    }

    private void updateAdd(Course addtoUpdate){

        for (Course c: curso.getCurso()){
            if (c.getID()== addtoUpdate.getID()){
                curso.getCurso().set(curso.getCurso().indexOf(c),addtoUpdate);
            }
        }
    }
    private Course getSpecificCourse(int id) {
        if (curso.getCurso().isEmpty()) {
            return null;
        } else {
            for (Course ad : curso.getCurso()) {
                if (ad.getID() == id) {
                    return ad;
                }
            }
        }
        return null;
    }


//    private String serializationToJson(){
//
//    }


}







