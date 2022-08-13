package com.building.service;

import java.util.Iterator;
import java.util.LinkedList;

import java.util.Queue;
import java.util.Stack;

public class BuildingSearch {
	
	
	public void printConstructionTable(int floor[],int noOfFloor) {
		
		System.out.println("The order of construction is as follows");
		
		Queue<Integer> queue=new LinkedList<Integer>();
		Stack<Integer> stack= new Stack<Integer>();

		int[] tempArray = new int[noOfFloor];

		int max = noOfFloor;

		System.out.println();
		for (int i = 0; i < noOfFloor; i++) {

			System.out.println("Day: "+(i+1));
			
			
			tempArray[i] = floor[i];

			queue.add(tempArray[i]);
			//System.out.println(queue.peek());
			stack.add(queue.peek());
			


			while (!stack.isEmpty() && stack.peek() == max) {

				System.out.print(stack.pop()+" ");

				max--;

			}
			
			queue.poll();

			System.out.println();
			

		}
		

	  }

}
