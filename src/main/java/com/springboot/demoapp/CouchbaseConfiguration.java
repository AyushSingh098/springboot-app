package com.springboot.demoapp;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class CouchbaseConfiguration extends AbstractCouchbaseConfiguration {

    @Override
    protected String getScopeName() {
        return super.getScopeName();
    }

    @Override
    protected Set<Class<?>> getInitialEntitySet() throws ClassNotFoundException {
        return super.getInitialEntitySet();
    }

    @Override
    protected String getMappingBasePackage() {
        return super.getMappingBasePackage();
    }

    @Override
    public String getBucketName() {
        return null;
    }

    /**
     * Gets the username.
     *
     * @return the username
     */
    @Override
    public String getConnectionString() {
        return null;
    }

    @Override
    public String getUserName() {
        return "Admin";
    }

    @Override
    public String getPassword() {
        return "password";
    }
}