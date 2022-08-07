package searching;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the size of array");
		  int n=sc.nextInt();
		  int[] arr=new int[n];
		  for(int i=0;i<n;i++)
		  {
			  System.out.println("Enter the value in array");
			  arr[i]=sc.nextInt();
		  }
		  
		  System.out.println("enter value to be SEARCH");
		  int x=sc.nextInt();
		  boolean f=true;
		  
		  for(int i=0;i<n;i++)
		  {
			  if(arr[i]==x)
			  {
				  System.out.println("Element found at "+i+" index");
				  f=false;
				  break;
			  }
		  }
		  
		  if(f)
			  System.out.println("Element not found");
		  
		  sc.close();
			  
	}

}
