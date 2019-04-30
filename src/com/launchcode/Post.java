package com.launchcode;



public class Post {
    //declaration of variable

        public static int totalNumberOfPost=0;

        private User user;
        private int postOrderNumber;
        private String postDesc;
        private String postURL;

    // Constructors
    public Post(){
        totalNumberOfPost++;
        this.postOrderNumber=totalNumberOfPost;
        this.postDesc="";
        //this.postURL="";
    }


    // Methods
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user=user;
    }

    public int getPostOrderNumber() {
        return postOrderNumber;
    }

    public void setPostOrderNumber(int postOrderNumber) {
        this.postOrderNumber=postOrderNumber;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc=postDesc;
    }

    public String getPostURL() {
        return postURL;
    }

    public void setPostURL(String postURL) {
        this.postURL=postURL;
    }

    @Override
    public String toString() {
         String result="";
         result="Post order number :"+getPostOrderNumber()+"  "+"Post Description: "+getPostDesc()+" Username: "+getUser().getUserName();
         if(postURL!=null&&!postURL.equals("")){
             result=result+" URL :"+postURL;
         }
         return result;
    }
}
