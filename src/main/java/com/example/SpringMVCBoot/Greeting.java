package com.example.SpringMVCBoot;

public class Greeting {
    private long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
    
    private String email;
    private String phone;
    private String todo;
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
