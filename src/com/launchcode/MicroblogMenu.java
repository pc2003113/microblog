package com.launchcode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class MicroblogMenu {
    // declaration
    private User currentUser;
    private ArrayList<User> users;
    private ArrayList<Post> posts;



    //Constructor
    public MicroblogMenu(){
        this.users=new ArrayList<>();
        this.posts=new ArrayList<>();
    }


    // Methods

    public void displayMenu(){
        Scanner keyboard = new Scanner(System.in);
        if(currentUser!=null){
        System.out.println("Current user logged in is "+currentUser.getUserName());
        }
        else{
            System.out.println("There is no user logged in at this time");
        }
        System.out.println("Menu Options\n" +
                "1- Login\n" +
                "2- Create a post\n" +
                "3- Print all the posts\n" +
                "4- Print all the users\n" +
                "5- Choose the user\n" +
                "0- to exit");
        System.out.println("Please enter your selection");
    }

    public int userChoice(){
        Scanner keyboard= new Scanner(System.in);
        int choice = keyboard.nextInt();
        keyboard.skip("\n");
        return choice;
    }

    public void userAction(int userChoice){
        Scanner keyboard =new Scanner(System.in);
        switch(userChoice){
            case 1 ://login
                System.out.println("Enter a weblink of your Avatar");
                String avatarLink= keyboard.nextLine();
                System.out.println("Enter your username");
                String userName= keyboard.nextLine();
                System.out.println("Enter your First Name");
                String firstName= keyboard.nextLine();
                System.out.println("Enter your Last Name");
                String lastName= keyboard.nextLine();
                System.out.println("Enter your email address");
                String email= keyboard.nextLine();

                User user= new User();
                user.setAvatarLink(avatarLink);
                user.setUserName(userName);
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setEmail(email);

                users.add(user);
                this.currentUser=user;

                break;

            case 2 :// create a new post

                int index=currentUser.getPosts().size()-1;
                if(index>-1) {
                    System.out.println("The most recent post made by you is :\n"+currentUser.getPosts().get(index));
                }
                System.out.println("Enter the post description");
                String userPostDesc =keyboard.nextLine();
                System.out.println("Enter the post URL");
                String postURL=keyboard.nextLine();
                Post post =new Post();
                post.setPostDesc(userPostDesc);
                post.setPostURL(postURL);
                post.setUser(currentUser);
                posts.add(post);
                currentUser.getPosts().add(post);



                break;

            case 3: // print all posts

                for (Post individualPost:posts){
                    System.out.println(individualPost);

                }


                break;

            case 4 : // print all users

                for(User individualUser : users){
                    System.out.println(individualUser);
                }

                break;

            case 5 : // selection of user
            if(users.size()!=0) {
                for (int i=0; i < users.size(); i++) {
                    System.out.println(i + " " + users.get(i).getUserName());

                }
                System.out.println("Please enter the your choice of user");
                int userPick=keyboard.nextInt();
                currentUser=users.get(userPick);
            }
            else{
                System.out.println("Currently there are no users listed. Please pick option 1 to create an user\n\n");
            }
            break;

            case 0:
                System.out.println( "Bye bye .. see you later");
                break;

            default:
                System.out.println( "Incorrect entry. Try again");
                break;
        }
    }













}
