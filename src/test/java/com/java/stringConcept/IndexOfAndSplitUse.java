package com.java.stringConcept;

public class IndexOfAndSplitUse {

// Find the  name of Mail service provider //
 // shashikant.gaurav@gmail.com :; randomAvenger@hotmail.com

    // randomAvenger@hotmail.com : find the index of @ and . and create subString
    public static void main(String[] args) {
        String email = "randomAvenger@hotmail.com";
        //split from @
         String emailArr[] = email.split("@");
         int dotIndex= emailArr[1].lastIndexOf(".");
        System.out.println("Name of provider:"+emailArr[1].substring(0, dotIndex));
        //using  lastIndex method
        System.out.println("Using Indexof");
        String mailId= "shashikant.gaurav@gmail.com";
        int beginIndex=mailId.lastIndexOf('@');
        int endIndex=mailId.lastIndexOf('.');
        String provideName=mailId.substring(beginIndex+1,endIndex);
        System.out.println(provideName);

    }
}
