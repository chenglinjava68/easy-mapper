package com.baidu.unbiz.easymapper.vo;

import java.util.List;

import com.google.common.base.MoreObjects;

/**
 * @author zhangxu
 */
public class Person3 {

    public String firstName;
    public String lastName;
    public List<String> jobTitles;
    public long salary;
    public Family<String> family;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("firstName", firstName)
                .add("lastName", lastName)
                .add("jobTitles", jobTitles)
                .add("salary", salary)
                .add("family", family)
                .toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getJobTitles() {
        return jobTitles;
    }

    public void setJobTitles(List<String> jobTitles) {
        this.jobTitles = jobTitles;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public Family<String> getFamily() {
        return family;
    }

    public void setFamily(Family<String> family) {
        this.family = family;
    }
}
