package org.mybatis.entity;

public class User {
    private Integer id;

    private String name;

    private String sex;

    private String hobby;

    public User(Integer id, String name, String sex, String hobby) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.hobby = hobby;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }
}