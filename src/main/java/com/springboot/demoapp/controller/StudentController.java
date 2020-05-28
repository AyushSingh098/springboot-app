package com.springboot.demoapp.controller;

import com.springboot.demoapp.model.Student;
import com.springboot.demoapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    /** The helper. */
    StudentService studentService;

    /**
     * Save user data.
     *
     * @param data the data
     * @return the user data
     */
    @PostMapping("/user")
    private Student saveUserData(@RequestBody Student data) {
        return studentService.addUser(data);
    }

    /**
     * Gets the user data.
     *
     * @param id the id
     * @return the user data
     */
    @GetMapping("/user/{id}")
    private Student getUserData(@PathVariable("id") String id) {
        return studentService.getUser(id);
    }

    /**
     * Gets the all users data.
     *
     * @return the all users data
     */
    @GetMapping("/users")
    private List<Student> getAllUsersData() {
        return studentService.getAllUsers();
    }

    /**
     * Delete all users data.
     *
     * @return the hash map
     */
    @DeleteMapping("/users")
    private HashMap<String, String> deleteAllUsersData() {
        studentService.deleteAllUsers();
        HashMap<String, String> map = new HashMap<>();
        map.put("Data", "Deleted");
        return map;
    }

    /**
     * Delete user data by name.
     *
     * @param name the name
     * @return the hash map
     */
    @DeleteMapping("/users/{name}")
    private HashMap<String, String> deleteUserDataByName(@PathVariable("name") String name) {
        studentService.deleteUserByName(name);
        HashMap<String, String> map = new HashMap<>();
        map.put("Data Deleted with name", name);
        return map;
    }

    /**
     * Update user data.
     *
     * @param name the name
     * @param data the data
     * @return the user data
     */
    @PutMapping("/users/{name}")
    private Student updateUserData(@PathVariable("name") String name, @RequestBody Student data) {
        return studentService.updateUserData(name, data);
    }

}