package com.springboot.demoapp.controller;

import com.springboot.demoapp.model.Student;
import com.springboot.demoapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/user")
    private Student saveUserData(@RequestBody Student data) {
        System.out.print(data);
        return studentService.addUser(data);
    }

    @GetMapping("/user/{id}")
    private Student getUserData(@PathVariable("id") String id) {
        return studentService.getUser(id);
    }

    @GetMapping("/users")
    private List<Student> getAllUsersData() {
        return studentService.getAllUsers();
    }

    @DeleteMapping("/users")
    private HashMap<String, String> deleteAllUsersData() {
        studentService.deleteAllUsers();
        HashMap<String, String> map = new HashMap<>();
        map.put("Data", "Deleted");
        return map;
    }

    @DeleteMapping("/users/{name}")
    private HashMap<String, String> deleteUserDataByName(@PathVariable("name") String name) {
        studentService.deleteUserByName(name);
        HashMap<String, String> map = new HashMap<>();
        map.put("Data Deleted with name", name);
        return map;
    }

    @PutMapping("/users/{name}")
    private Student updateUserData(@PathVariable("name") String name, @RequestBody Student data) {
        return studentService.updateUserData(name, data);
    }

}