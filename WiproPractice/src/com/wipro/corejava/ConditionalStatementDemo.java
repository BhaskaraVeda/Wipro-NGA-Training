package com.wipro.corejava;

import java.util.Scanner;

public class ConditionalStatementDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		
		System.out.println("enter any alphabet");
		char letter=scan.next().charAt(0);
		if(letter =='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u')
			System.out.println(letter+" is vowel");
		else
			System.out.println(letter+" is a consonent!");
		
		
		
//		if(letter=='a')
//			System.out.println(letter+" is vowel");
//			else if(letter=='e')
//			System.out.println(letter+" is vowel");
//		else if(letter=='i')
//			System.out.println(letter+" is vowel");
//		else if(letter=='o')
//			System.out.println(letter+" is vowel");
//		else if(letter=='u')
//			System.out.println(letter+" is vowel");
//		else
//			System.out.println(letter+" is a consonent!");
//		
//		switch(letter)   // fall through statement // comparision ==
//		{
//		case 'a' :  System.out.println(letter+" is vowel"); break;
//		case 'e' :  System.out.println(letter+" is vowel"); break;
//		case 'i' :  System.out.println(letter+" is vowel"); break;
//		case 'o' :  System.out.println(letter+" is vowel");  break;
//		case 'u' :  System.out.println(letter+" is vowel");break;
//		default  : 	System.out.println(letter+" is a consonent!");
//		}
//		
//		
		
		
//		if(age<18) // 27<18 false
//		{
//			System.out.println("You are too young for voting");
//		}
//		else
//		{
//			System.out.println("Your age is valid for voting");
//		}
		
		
	}
}


/*            true/false
      if(condition)
      {
      code;
      }
      
      
  if(condition)
      {
      code;  // if condition is true
      }
      else
      {
         code; // if condition is false
      }



    if(condition1)
    {
    
    }
    else if (condition2)
    {
    
    }
    else if (condition3)
    {
    
     }
else if (condition n)
{

}

else{

}

                                        true
if(cond1  && cond2 )         if(1 + 0 = 1)

  &&     multiply ( * )         
  
  ||     add  (+)
 
      





*/