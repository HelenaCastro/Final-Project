package com.rumos.courses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Course {
    String name;

    public Course(String name) {
        this.name = name;
    }
}
