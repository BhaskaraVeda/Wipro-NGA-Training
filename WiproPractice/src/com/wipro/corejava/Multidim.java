package com.wipro.corejava;

import java.util.Scanner;

public class Multidim {

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     
     System.out.println("Please enter no of rows");
     int row=s.nextInt();
     System.out.println("Please enter no of columns");
     int col=s.nextInt();
     
     int metrice1[][] = { {1,2,3} , {3,4,6}  ,{8,1,2}  };
     int metrice2[][] = new int[row][col];
     
		System.out.println("Please enter array elements");
		   for(int i=0; i<row;i++)  //outer loop  becomes 1 in next iteration
		   {
			 for(int j=0;j<col;j++)   //inner loop  0,1
			 {
				 metrice1[i][j]=s.nextInt();
			 }  
		   }
		
		   
		   //printing the elements
		   
		   for(int i=0; i<row;i++)  //outer loop  becomes 1 in next iteration
		   {
			 for(int j=0;j<col;j++)   //inner loop  0,1
			 {
			System.out.print(metrice1[i][j]+"  ");
			 }  
			 System.out.println();
		   }
		
	}

}

/*
 *                       c1   c2  c2   cols=3
 *            row1        3   4   5               1 3 4          4  7  9
 *            row2        1   2   8               2 6 9          3  8  17
 * for(int i=0;i<rows;i++)  
 *   {                                                                i=2,j=0
 * for(int j=0;j<cols;j++)
 *   {   arr[i][j]=s.nextInt()
 *   }
 *   }
 *    
 *    arr[row1][c1]=3  arr[0][0]=3
 *    arr[row1][c2]=4  arr[0][1]=4
 *    arr[row1][c3]=5  arr[0][2]=5
 *    arr[row2][c1]=1  arr[1][0]=1
 *    arr[row2][c2]=2  arr[1][1]=2
 *    arr[row2][c3]=8  arr[1][2]=8
 *    
 */





