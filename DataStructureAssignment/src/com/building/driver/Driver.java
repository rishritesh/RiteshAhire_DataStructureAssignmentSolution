package com.building.driver;

import java.util.*;
import java.util.Scanner;
import java.util.Stack;

import com.building.service.Building;

public class Driver {
	
	public static void main(String[] args) {
		
		//Stack<Integer> st=new Stack();
		//Queue  q = new Queue();
		Queue<Integer> q=new LinkedList();
		System.out.println("enter the totsl no of floor in building");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0; i<a;i++) {
			System.out.println("enter the floor size of given Day:"+(i+1));
			int b=sc.nextInt();
			q.add(b);
		}
		//System.out.println(q);
		Building b=new Building();
		b.skyScrapper(a, q);
	}
	

}
