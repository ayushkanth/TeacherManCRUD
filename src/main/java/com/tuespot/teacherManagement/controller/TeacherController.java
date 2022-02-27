package com.tuespot.teacherManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuespot.teacherManagement.entity.TeacherEntity;
import com.tuespot.teacherManagement.repository.TeacherRepo;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class TeacherController {
	@Autowired
	TeacherRepo teacherRepo;
	
	@PostMapping("/")
	public TeacherEntity adTeacherEntity(@RequestBody TeacherEntity teacherEntity) {
		return this.teacherRepo.save(teacherEntity);
	}
	
	@PutMapping("/")
	public TeacherEntity updateTeacherEntity(@RequestBody TeacherEntity teacherEntity) {
		return this.teacherRepo.save(teacherEntity);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTeacherEntity(@PathVariable("id") Long id) {
		this.teacherRepo.deleteById(id);
	}
	
	@GetMapping("/")
	public List<TeacherEntity> showAll(){
		return this.teacherRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public TeacherEntity showById(@PathVariable("id") Long id) {
		return this.teacherRepo.findById(id).get();
	}
}
