package com.greatLearning.sort;

import java.util.Comparator;

/*To sort the output Priority Queue in descending order, because we need greater floor size 
  to be constructed earlier.
*/

public class IntegerComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer left, Integer right) {
		if (left == right)
			return 0;
		else if (left < right)
			return 1;
		else
			return -1;

	}
}
