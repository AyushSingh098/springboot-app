package com.springboot.demoapp.dao;

import com.springboot.demoapp.model.Student;
import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;

import org.springframework.stereotype.Repository;
import java.util.List;

@N1qlPrimaryIndexed
@Repository
public interface StudentRepository extends CouchbasePagingAndSortingRepository<Student, Integer>
{
    /**
     * Find all users.
     *
     * @param docId the doc id
     * @return the list
     *
     *         Behaves like "select * from {bucketName} where meta().id like {docId}
     *         meta().id refers to the document Id
     */
    @Query("#{#n1ql.selectEntity} WHERE meta().id like $1")
    List<Student> findAllUsers(String docId);

    /**
     * Find user by name.
     *
     * @param name the name
     * @return the user data
     */
    @Query("#{#n1ql.selectEntity} WHERE name = $1")
    Student findUserByName(String name);

    /**
     * Delete all user data.
     *
     * @return the list
     *
     *         mybucket is bucket name in couchbase
     */
    @Query("delete from mybucket")
    List<Student> deleteAllUserData();

    /**
     * Delete user data by name.
     *
     * @param name the name
     * @return the list
     */
    @Query("delete from mybucket WHERE name = $1")
    List<Student> deleteUserDataByName(String name);
}
