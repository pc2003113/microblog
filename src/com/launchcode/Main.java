package com.launchcode;

public class Main {

    public static void main(String[] args) {
        MicroblogMenu microblogMenu= new MicroblogMenu();
        System.out.println("Welcome to MICROBLOG");
        boolean keepGoing =true;

        while(keepGoing){
            microblogMenu.displayMenu();
            int result= microblogMenu.userChoice();
            microblogMenu.userAction(result);
            if(result==0){
                keepGoing=false;
            }

        }









    }
}
