package com.tuespot.teacherManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuespot.teacherManagement.entity.TeacherEntity;

@Repository
public interface TeacherRepo extends JpaRepository<TeacherEntity, Long>{

}
