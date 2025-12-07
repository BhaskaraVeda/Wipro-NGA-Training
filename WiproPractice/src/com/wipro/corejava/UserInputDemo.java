package com.wipro.corejava;


import  java.util.Scanner;  // step1
public class UserInputDemo {

	public static void main(String[] args) {  
		Scanner scan=new Scanner(System.in); // step 2
//		 System.out.println("Enter two numbers");
//		int x= scan.nextInt();   // calling input method step 4
//		int y=scan.nextInt();
//       System.out.println("addition: "+(x+y));
		System.out.println("Enter your any alphabet"); 
		char letter=scan.next().charAt(0);
		System.out.println("Alphabet you entered is : "+letter); 
	}
}
/*    
 *   Scanner 
 * object creation --->   Classname obj=new Classname();
 *    Integer -   nextInt()
 *    float   -  nextFloat()
 *    double  -  nextDouble()
 *    boolean - nextBoolean()
 *    String  -   next() - without space  and nextLine() - including space
 *    char    - next().charAt(0)
 * 
 */
