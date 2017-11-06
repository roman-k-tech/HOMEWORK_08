package TASK_01;

import java.io.Serializable;

/**
 * Created by Роман on 15.10.2017.
 */
public class Human implements Serializable {
    private String name;
    private String surename;
    private Integer age;

    public void printHuman() {
        System.out.println(name + ": " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }
}
