package com.springboot.demoapp.dao;

import com.springboot.demoapp.model.Student;
import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentRepository extends CouchbaseRepository<Student, Integer>
{
    @Query("#{#n1ql.selectEntity} WHERE meta().id like $1")
    List<Student> findAllUsers(String docId);

    @Query("#{#n1ql.selectEntity} WHERE name = $1")
    Student findUserByName(String name);

    @Query("delete from springbootapp")
    List<Student> deleteAllUserData();

    @Query("delete from springbootapp WHERE name = $1")
    List<Student> deleteUserDataByName(String name);
}
