package com.springboot.demoapp.service;

import com.springboot.demoapp.dao.StudentRepository;
import com.springboot.demoapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceImp implements StudentService{

    /** The doc id. */
    String docId = "USERDATA::";

    @Autowired
    private StudentRepository repo;

    @Override
    /**
     * Adds the user.
     *
     * @param data the data
     * @return the user data
     */
    @Transactional
    public Student addUser(Student data) {
        Student saveData = new Student();
        saveData.setDocId(docId + UUID.randomUUID().toString());
        saveData.setId(data.getId());
        saveData.setName(data.getName());
        saveData.setDob(data.getDob());
        return repo.save(saveData);
    }
    @Transactional
    @Override
    /**
     * Gets the user.
     *
     * @param name the name
     * @return the user
     */
    public Student getUser(String name) {
        Student data = repo.findUserByName(name);
        return data;
    }
    @Transactional
    @Override
    /**
     * Gets the all users.
     *
     * @return the all users
     */
    public List<Student> getAllUsers() {
        List<Student> findAll = repo.findAllUsers(docId + "%");
        return findAll;
    }
    @Transactional
    @Override
    /**
     * Delete all users.
     *
     * @return the list
     */
    public List<Student> deleteAllUsers() {
        return repo.deleteAllUserData();
    }
    @Transactional
    @Override
    /**
     * Delete user by name.
     *
     * @param name the name
     * @return the list
     */
    public List<Student> deleteUserByName(String name) {
        return repo.deleteUserDataByName(name);
    }
    @Transactional
    @Override
    /**
     * Update user data.
     *
     * @param name the name
     * @param data the data
     * @return the user data
     */
    public Student updateUserData(String name, Student data) {
        Student user = getUser(name);
        user.setId(data.getId());
        user.setName(data.getName());
        user.setDob(data.getDob());
        return repo.save(user);
    }

}

