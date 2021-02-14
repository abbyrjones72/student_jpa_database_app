package com.abbycodes.studentapp.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student abby = new Student(
                    "Abby",
                    "abbyrjones72@gmail.com",
                    LocalDate.of(1972, APRIL, 15)
            );

            Student elbe = new Student(
                    "Elbe",
                    "elbebear@gmail.com",
                    LocalDate.of(1968, OCTOBER, 11)
            );
            Student mark = new Student(
                    "Mark",
                    "mark@gmail.com",
                    LocalDate.of(1980, FEBRUARY, 11)
            );
            Student joan = new Student(
                    "Joan",
                    "Joan@gmail.com",
                    LocalDate.of(1945, DECEMBER, 11)
            );

            // save to the database passing a list
            studentRepository.saveAll(
                    List.of(
                        abby, elbe, mark, joan
                    )
            );
        };
    }
}
