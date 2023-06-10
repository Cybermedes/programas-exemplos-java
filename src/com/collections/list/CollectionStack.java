package com.collections.list;

import java.util.Stack;

class CollectionStack {

	public static void main(String[] args) {
		
		Stack<String> animals = new Stack<>();
		
		//Add elements to the stack
		animals.push("cow");
		animals.push("horse");
		animals.push("pig");
		animals.push("dog");
		animals.push("cat");		
		animals.push("bird");
		
		System.out.println("Original stack: " + animals + "\n");
		
		//Remove element from the top
        System.out.println("Removed Element: " + animals.pop() + "\n");
        
        //Retrieves the element from the top
        System.out.println("Element at the top: " + animals.peek() + "\n");
        
        //Search and element and return its index
        System.out.println("Position of the element \"dog\": " + animals.search("dog")  + "\n");
        
        //Check if the stack is empty
        System.out.println("The stack is empty? " + animals.isEmpty() + "\n");
        
        //Add a new element to the stack
        System.out.println("Add a new element to the stack: fish");
        animals.push("fish");
        System.out.println("New Stack: " + animals);
	}
}
