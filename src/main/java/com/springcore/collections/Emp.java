package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
    private String Name;
    private List <String> phones;
    private Set <String> addresses;
    private Map<String, String> courses;
    private Properties props;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public Emp(String name, List<String> phones, Set<String> addresses, Map<String, String> courses) {
        Name = name;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
    }

    public Emp() {
        super();
    }
}
