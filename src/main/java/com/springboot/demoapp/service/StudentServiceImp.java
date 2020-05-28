package com.springboot.demoapp.service;

import com.springboot.demoapp.dao.StudentRepository;
import com.springboot.demoapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{

    /** The doc id. */
    String docId = "1";

    @Autowired
    private StudentRepository repo;

    @Override
    public Student addUser(Student data)
    {
        Student saveData = new Student();
        saveData.setDocId(docId);
        saveData.setId(data.getId());
        saveData.setName(data.getName());
        saveData.setDob(data.getDob());
        return repo.save(saveData);
    }

    @Override
    public Student getUser(String name) {
        Student data = repo.findUserByName(name);
        return data;
    }

    @Override
    public List<Student> getAllUsers() {
        List<Student> findAll = repo.findAllUsers(docId + "%");
        return findAll;
    }

    @Override
    public List<Student> deleteAllUsers() {
        return repo.deleteAllUserData();
    }

    @Override
    public List<Student> deleteUserByName(String name) {
        return repo.deleteUserDataByName(name);
    }

    @Override
    public Student updateUserData(String name, Student data)
    {
        Student user = getUser(name);
        user.setId(data.getId());
        user.setName(data.getName());
        user.setDob(data.getDob());
        return repo.save(user);
    }
}

