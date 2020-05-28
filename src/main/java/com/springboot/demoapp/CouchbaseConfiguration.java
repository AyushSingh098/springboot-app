package com.springboot.demoapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CouchbaseConfiguration extends AbstractCouchbaseConfiguration {

    /**
     * Gets the bootstrap hosts.
     *
     * @return the bootstrap hosts
     */
    @Override
    protected List<String> getBootstrapHosts() {
        return Arrays.asList("localhost");
    }

    /**
     * Gets the bucket name.
     *
     * @return the bucket name
     */
    @Override
    protected String getBucketName() {
        return "springboot-demo"; // enter the bucket name
    }

    /**
     * Gets the bucket password.
     *
     * @return the bucket password
     */
    @Override
    protected String getBucketPassword() {
        return "admin1234"; // enter the password
    }

    /**
     * Gets the username.
     *
     * @return the username
     */
    @Override
    protected String getUsername() {
        return "springboot-demo"; // enter the username
    }
}
