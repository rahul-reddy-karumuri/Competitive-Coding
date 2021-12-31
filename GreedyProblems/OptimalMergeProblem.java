package com.GreedyProblems;

import java.util.PriorityQueue;

public class OptimalMergeProblem {

	public static void main(String[] args) {
		int arraySizes[] = new int[] { 15, 60, 25 };
		System.out.println("Optimal merge Cost= "+ minComputation(arraySizes));
	}
	
	static int minComputation(int arraySizes[]) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < arraySizes.length; i++) {
		    pq.add(arraySizes[i]);
		}
		int totalCost=0;
	    while (pq.size() > 1) {
	          int currentCost = pq.poll() + pq.poll();
	          totalCost += currentCost;
	          pq.add(currentCost); 
	    }
		return totalCost;
	}

}
