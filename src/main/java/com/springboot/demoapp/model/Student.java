package com.springboot.demoapp.model;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

@Document
public class Student implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    public Student() {
    }

    public Student(String docId, String id, String name, String dob) {
        super();
        this.docId = docId;
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    /** The doc id. */
    @Id
    @JsonIgnore
    private transient String docId;

    @Field
    private String id;

    @Field
    private String name;

    @Field
    private String dob;

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}