package com.demoJPA.springjpa;

import com.demoJPA.springjpa.entity.Course;
import com.demoJPA.springjpa.entity.CourseMaterial;
import com.demoJPA.springjpa.repository.CourseMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringJpaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);

	}

}
