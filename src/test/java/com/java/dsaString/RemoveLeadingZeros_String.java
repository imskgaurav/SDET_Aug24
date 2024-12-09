package com.java.dsaString;

public class RemoveLeadingZeros_String {

    public static void main(String[] args) {
      String str1= "00000123569";
      String str2= "000012356090";
      String str3= "723623700000044";
      // Check in index from 0 till we found char 0 continuously /
        int index =0;
        for(int i =0; i<str2.length(); i++){
            if(str2.charAt(i)!='0'){
                index= i;
                break;
            }
        }
        System.out.println("Total Index:"+index);
        String ss =str2.substring(index, str2.length());
        System.out.println(ss);
        findFirstAndLastIndexSpace(str1);

    }

    public  static void findFirstAndLastIndexSpace(String arr){
        int start=0;
        int end=0;
     for(int i=0; i<arr.length();i++){
            start=arr.indexOf('0');
            end =arr.lastIndexOf('0');
     }
        System.out.println("start :"+start);
        System.out.println("end :"+end);

    }


}
