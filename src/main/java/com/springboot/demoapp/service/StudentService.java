package com.springboot.demoapp.service;

import com.springboot.demoapp.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    public Student addUser(Student data);

    public Student getUser(String name);

    public List<Student> getAllUsers();

    public List<Student> deleteAllUsers();

    public List<Student> deleteUserByName(String name);

    public Student updateUserData(String name, Student data);
}

