package com.building.driver;

import java.util.*;
import java.util.Scanner;
import java.util.Stack;

import com.building.service.Building;
import com.building.service.BuildingSearch;

public class Driver {
	
	public static void main(String[] args)  throws Exception{
		
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the total no of floors in the building");
		
		int noOfFloor = sc.nextInt();

	    int[] floors = new int[noOfFloor];
		
	   
		for(int i=0; i<noOfFloor; i++)  
		{  
		System.out.println("enter the floor size given on day : "+(i+1));
		floors[i] = sc.nextInt(); 
		}  
		System.out.println();
		
		//Service service = new Service();
		
		BuildingSearch service=new BuildingSearch();
		service.printConstructionTable(floors, noOfFloor);
	}
	

}
