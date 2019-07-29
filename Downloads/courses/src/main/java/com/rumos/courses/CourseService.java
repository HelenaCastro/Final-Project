package com.rumos.courses;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Data
@Service
public class CourseService {

    private List<Course> curso;

    public CourseService(){

        curso = new CopyOnWriteArrayList<>();

    }


}
