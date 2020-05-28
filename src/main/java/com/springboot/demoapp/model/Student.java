package com.springboot.demoapp.model;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.couchbase.core.mapping.Document;

import java.io.Serializable;

@Document
public class Student implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new user data.
     */
    public Student() {
    }

    /**
     * Instantiates a new user data.
     *
     * @param docId the doc id
     * @param id the id
     * @param name the name
     * @param dob the dob
     */
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
    /** The id. */
    private String id;

    @Field
    /** The name. */
    private String name;

    @Field
    /** The dob. */
    private String dob;

    /**
     * Gets the doc id.
     *
     * @return the doc id
     */
    public String getDocId() {
        return docId;
    }

    /**
     * Sets the doc id.
     *
     * @param docId the new doc id
     */
    public void setDocId(String docId) {
        this.docId = docId;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the dob.
     *
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * Sets the dob.
     *
     * @param dob the new dob
     */
    public void setDob(String dob) {
        this.dob = dob;
    }
}