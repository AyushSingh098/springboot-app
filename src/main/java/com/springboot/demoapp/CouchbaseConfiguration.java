package com.springboot.demoapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CouchbaseConfiguration extends AbstractCouchbaseConfiguration {

    @Override
    protected List<String> getBootstrapHosts() {
        return Arrays.asList("localhost");
    }

    @Override
    protected String getBucketName() {
        return "springbootapp"; // enter the bucket name
    }

    @Override
    protected String getBucketPassword() {
        return "admin1234"; // enter the password
    }

    @Override
    protected String getUsername() {
        return "springbootapp"; // enter the username
    }
}
