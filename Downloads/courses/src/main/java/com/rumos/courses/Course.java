package com.rumos.courses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Data
@Service
public class Course {
    
    int ID;
    String name;
    Double price;

   public Course(){

   }


    public Course( String name, Double price) {

        this.name = name;
        this.price = price;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
