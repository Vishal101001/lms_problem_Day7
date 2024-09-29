package com.lmsDay7;
import java.util.Stack;

   public class StackDemo {
	    public static void main(String[] args) {
	        // Create a Stack 
	    	
	        Stack<Integer> stack = new Stack<>();

	        // Store 10 elements in the stack
	        for (int i = 1; i <= 10; i++) {
	            stack.push(i); // Push elements into the stack
	        }

	        // Display the contents of the stack
	        System.out.println("Stack elements after adding 10 elements: " + stack);

	        // Remove 4 elements from the stack
	        for (int i = 0; i < 4; i++) {
	            if (!stack.isEmpty()) {
	                int removedElement = stack.pop(); // Remove the top element
	                System.out.println("Removed element: " + removedElement);
	            }
	        }

	        // Display the contents of the stack after removal
	        System.out.println("Stack elements after removing 4 elements: " + stack);
	    }
	}
