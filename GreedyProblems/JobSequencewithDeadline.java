package com.GreedyProblems;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequencewithDeadline {
	
	public static void main(String[] args) {
		String jobs[] = {"J1","J2","J3","J4"};
		int profit[] = {3,2,5,3};
		int deadline[] = {2,1,1,4};
		maximunProfit(jobs,profit,deadline);
	}
	
	static void maximunProfit(String jobs[], int profit[], int deadline[]) {
		
		ArrayList<Jobs> job = new ArrayList<Jobs>();
		for(int i=0;i<4;i++) {
			job.add(new Jobs(jobs[i], profit[i], deadline[i]));
		}
		Collections.sort(job);	
		int totalProfit = 0;
		boolean slots [] = new boolean[job.size()];
		String sequence [] = new String[job.size()];
 		for(int i=0;i<job.size();i++) {
            for(int j=job.get(i).getDeadline()-1;j>=0;j--) {
            	if(!slots[j]) {
            		slots[j] = true;
            		sequence[i] = job.get(i).getJobId();
            		totalProfit += job.get(i).getProfit();
            		break;
            	}
            }
		}
 		
 		System.out.println("Total Profit is: "+totalProfit);
 		for(int i=0;i<sequence.length;i++) {
 			if(sequence[i]!=null)
 				System.out.println(sequence[i]);
 		}
	}
}
