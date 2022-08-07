package searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearchOnLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(5);
		l.add(15);
		l.add(25);
		l.add(45);
		l.add(55);
		l.add(35);
		l.add(65);
		Collections.sort(l);
		
		System.out.println("Enter element you want to SEARCH");
		int x=sc.nextInt();
		
		boolean f=true;
		
		int lo=0, hi=l.size()-1;
		  
	  while(lo<=hi)
	  {
		  int mid=(lo+hi)/2;
		  
		  if(l.get(mid)==x)
		  {
			  System.out.println("element found at index = "+mid);
			  f=false;
			  break;
		  }
		  else if(l.get(mid)<x)
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
