package com.java.dsaString;

public class L58_LenOfLastWord {

    public static void main(String[] args) {

      String  str = " luffy is still joyboy  ";

      //int beginIndex =lengthOfLastWord(str);
        //System.out.println("last word is :"+str.substring(beginIndex, str.length()));
      int len=  lengthOfLastWordFromString(str);
        System.out.print("Last word is lenght is:"+len);



    }

     static int lengthOfLastWord(String s)
     {
         int len=0;

         s =s.trim();

        for(int i =0; i< s.length(); i++) {

            if (s.charAt(i) == ' ') {
                System.out.println("Words started at index :" + (i + 1));
                int startIndex = i + 1;
                System.out.print("Start index of Last word is :" + startIndex);
                len = startIndex;
            }

        }

    return  len;
     }


    //https://www.youtube.com/watch?v=0vlc5ttPftY&t=580s
   public static int lengthOfLastWordFromString(String str){
         str= str.trim();

        int count= 0;
        for(int i =str.length()-1; i>=0; i--){

            if(str.charAt(i)!=' '){

                count++;
            }
            else{
           if(count>1){

               return count;
           }

            }
        }

 return count;
    }
}
