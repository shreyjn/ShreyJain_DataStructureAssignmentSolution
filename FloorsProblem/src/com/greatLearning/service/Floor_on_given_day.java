package com.greatLearning.service;

import java.util.PriorityQueue;

import com.greatLearning.sort.IntegerComparator;

public class Floor_on_given_day {
	/*
	 * Priority Queue stores the output. When a floor is removed from input queue
	 * which is maximum in the entire input, we start emptying the output queue and
	 * start printing the result. We will print the result till a floor size, which
	 * is greater than maximum floor size after that day, is encountered.
	 */
	static PriorityQueue<Integer> floor_sizes = new PriorityQueue<Integer>(new IntegerComparator());

// max------------ Stores maximum floor size present in the entire input.
// max_after_day-- Stores maximum floor size after that day.
// floor_removed-- Contains the floor size removed from the input queue in the Driver class.

	public static void evaluate(int floor_removed, int max, int max_after_day, int day) {

//Adding the floor removed from input queue to our output queue.
		floor_sizes.offer(floor_removed);

//Displaying the output according to condition.
		System.out.println("Day: " + day);
		if (floor_removed == max) {
			while (floor_sizes.peek() != null && floor_sizes.peek() > max_after_day)
				System.out.print(floor_sizes.poll() + " ");
		}
		System.out.println();
	}
}