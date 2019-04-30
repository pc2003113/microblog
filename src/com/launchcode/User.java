package com.launchcode;

import java.util.ArrayList;

public class User {
    // decalaration of variables

    private ArrayList<Post> posts;

    private String avatarLink;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;


    //constructor
    public User(){
        this.avatarLink="";
        this.userName="";
        this.firstName="";
        this.lastName="";
        this.email="";
        this.posts=new ArrayList<>();
    }

    //Methods


    public String getAvatarLink() {
        return avatarLink;
    }

    public void setAvatarLink(String avatarLink) {
        this.avatarLink=avatarLink;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName=userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email=email;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts=posts;
    }

    @Override
    public String toString() {
        return ("User ID: "+getUserName()+ " First Name: "+ getFirstName()+ " Last Name: "+ getLastName());
    }
}
