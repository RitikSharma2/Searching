package searching;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchOnList {

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
		
		System.out.println("enter value to be SEARCH");
		int x=sc.nextInt();
		boolean f=true;
		
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)==x)
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
