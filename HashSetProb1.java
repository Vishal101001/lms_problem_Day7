package com.lmsDay7;
import java.util.HashSet;

public class HashSetProb1 {

	    public static void main(String[] args) {
	        // Create a HashSet to store Integer elements
	        HashSet<Integer> numbers = new HashSet<>();

	        // Add elements to the HashSet using the add() method
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);

	        // Display the HashSet before appending a new element
	        System.out.println("HashSet before appending: " + numbers);

	        // Append a new element to the HashSet
	        numbers.add(50);

	        // Display the HashSet after appending the new element
	        System.out.println("HashSet after appending: " + numbers);
	    }

}
