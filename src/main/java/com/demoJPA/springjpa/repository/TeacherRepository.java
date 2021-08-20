package com.demoJPA.springjpa.repository;

import com.demoJPA.springjpa.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
