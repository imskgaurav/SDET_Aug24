package com.coreJava.InterviewPrep;

public class SynchronTest {

public static void main(String[] args) {
		
		String input="a2b3c4";
		String output="aabbbcccc";

for(int i =0; i<input.length(); i++){
   
	String s = "";

//String dig = "";

    char c =input.charAt(i);

if(Character.isAlphabetic(c)){

  s = s+ c;

  System.out.println(s);
  ///System.out.println(s.getClass());
}
if(Character.isDigit(c)){
int x = Integer.parseInt(Character.toString(c));
System.out.println(x);	
StringBuilder sb= new StringBuilder();
System.out.print(sb.isEmpty());
for(int j=0;j<x; j++ ) {
	System.out.println("Value of j is :"+j);
	sb.append(s);
	System.out.println(sb);
}

}

}
	}

    
}
