package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class arr {
public static  void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	
	int n=sc.nextInt();
	
	int dr[]= new int[n];
	
	ArrayList<Integer> even=new ArrayList<Integer>();
	ArrayList<Integer> odd=new ArrayList<Integer>();

	
	for(int i=0;i<dr.length;i++) {
		
		if(dr[i]%2==0) {
			
			even.add(dr[i]);
		}
		else {
			odd.add(dr[i]);
		}
	}
	Collections.sort(even);
	Collections.sort(odd,Collections.reverseOrder());
	
	int i = 0; 
    for (int j = 0; j < even.size(); j++) { 
        dr[i++] = (int) even.get(j); 
    } 
    for (int j = 0; j < odd.size(); j++) { 
        dr[i++] = (int) odd.get(j); 
    } 
    for(int f:dr) {
    	
    	System.out.print(f);
    }
}
}
