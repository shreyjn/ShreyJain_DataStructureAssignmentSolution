package com.greatLearning.main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import com.greatLearning.service.Floor_on_given_day;

public class Driver {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter total no. of floors in the building");
		int n_floors = in.nextInt();

//Taking input of floor sizes from the user and storing them in a Queue.

		Queue<Integer> floor_list = new LinkedList<>();
		for (int i = 1; i <= n_floors; i++) {
			System.out.println("Enter the floor size given on day: " + i);
			floor_list.offer(in.nextInt());
		}
		in.close();

		System.out.println();
		System.out.println("The order of construction is as follows---");
		System.out.println();

		for (int day = 1; day <= n_floors; day++) {

//Calculating maximum floor size present in the entire input data. Original as well as after change.
			int max_size = Collections.max(floor_list);

//Removing a floor from the queue.
			int rem_floor = floor_list.poll();

//Calculating maximum floor size after removal of a floor.			
			int max_after_day = 0;
			if (floor_list.peek() != null) {
				max_after_day = Collections.max(floor_list);
			}

//Calculating floors to be constructed on each day
			Floor_on_given_day.evaluate(rem_floor, max_size, max_after_day, day);
		}
	}

}
