package com.springboot.demoapp.service;

import java.util.List;


import com.springboot.demoapp.model.Student;

public interface StudentService {

    public Student addUser(Student data);

    public Student getUser(String name);

    public List<Student> getAllUsers();

    public List<Student> deleteAllUsers();

    public List<Student> deleteUserByName(String name);

    public Student updateUserData(String name, Student data)


}

