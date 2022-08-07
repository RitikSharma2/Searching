package searching;

import java.util.Scanner;

public class BinarySearch {

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
		  
		  System.out.println("enter value to be search");
		  int x=sc.nextInt();
		  boolean f=true;
		  
		  int lo=0, hi=n-1;
		  
		  while(lo<=hi)
		  {
			  int mid=(lo+hi)/2;
			  
			  if(arr[mid]==x)
			  {
				  System.out.println("element found at index = "+mid);
				  f=false;
				  break;
			  }
			  else if(arr[mid]<x)
			  {
				  lo=mid+1;
			  }
			  else
			  {
				  hi=mid-1;
			  }
		  }
		  
		  if(f)
			  System.out.println("element not found");
		  

	}

}
