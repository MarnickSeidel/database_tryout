package com.example.database.dao;

import com.example.database.entities.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TeacherDAO extends CrudRepository<Teacher, UUID> {}