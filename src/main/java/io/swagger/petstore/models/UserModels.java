package io.swagger.petstore.models;

import java.util.List;

public class UserModels {


    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private Integer userStatus;


    public UserModels(List<List<String>> listCreate) {

        this.id = Integer.valueOf(listCreate.get(0).get(0));
        this.username = listCreate.get(0).get(1);
        this.firstName = listCreate.get(0).get(2);
        this.lastName = listCreate.get(0).get(3);
        this.email = listCreate.get(0).get(4);
        this.password = listCreate.get(0).get(5);
        this.phone = listCreate.get(0).get(6);
        this.userStatus = Integer.valueOf(listCreate.get(0).get(7));

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

}
