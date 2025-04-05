package codeDesignPatterns.dependentClasses;

public class User {
   public String name;

    public  User (String name){
        this.name = name;
    }

    public  void HelloUser (){
        System.out.println("hello, I'm "+ name);
    }
}
