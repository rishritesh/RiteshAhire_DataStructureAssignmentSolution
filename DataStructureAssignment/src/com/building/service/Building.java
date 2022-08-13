package com.building.service;

import java.util.*;

public class Building {
	
	Stack<Integer> st=new Stack();
	
	public void skyScrapper(int a,Queue q) {
		
		//for loop for iterating 
		for(int i=0;i<a;i++) {
			
			int ele=(int) q.peek();
			//System.out.println(ele);
			
			if(a==ele){
				
				if(st.isEmpty() && a==ele) {
					System.out.println("Day:"+(i+1));
					System.out.println(q.poll());
					continue;
				}
				
				st.add((Integer) q.poll());
				
				System.out.println("Day :"+(i+1));
			
				int A=(int) q.peek();
				
				int B=st.peek();
				
				while(A<B) {
					
					if(st.isEmpty()) {
						break;
					}
					
					
					System.out.print(st.pop()+" ");
					
					if(st.size()==0) {
						break;
					}
					B=st.peek();
					
				}
				
				System.out.println();
			}
			
			else if (a>ele) {
				
				st.add((Integer) q.poll());
				
				if(!q.isEmpty()) {
				if(ele>(int)q.peek() ) {
					System.out.println("Day :"+(i+1)+"\n"+st.pop());
					continue;
				}
				}
				
				System.out.println("Day:"+(i+1)+"\n");
				
					
				
			}
		}

	
		Iterator itr=st.iterator();
		while(itr.hasNext()) 
			System.out.print(st.pop()+" ");
		
		
		
	
	}

}
