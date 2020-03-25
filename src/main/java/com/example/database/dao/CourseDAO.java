package com.example.database.dao;

import com.example.database.entities.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CourseDAO extends CrudRepository<Course, UUID> {}