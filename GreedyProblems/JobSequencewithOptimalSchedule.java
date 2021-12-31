package com.GreedyProblems;

import java.util.ArrayList;
import java.util.Collections;

public class JobSequencewithOptimalSchedule {

	public static void main(String[] args) {

		String jobs[] = {"Job1","Job2","Job3"};
		int time[] = {1,3,2};
		int weight[] = {10,2,15};
		jobSequencewithMinimumCost(jobs,time,weight);
		
	}
	
	static void jobSequencewithMinimumCost(String jobs[],int time[],int weight[]) {
		ArrayList<Job> job = new ArrayList<Job>();
		for(int i=0;i<jobs.length;i++) {
			job.add(new Job(jobs[i], time[i], weight[i]));
		}
		
		Collections.sort(job);
		
		int minimunDisatisfaction = 0;
		int currentTime = 0;
		for(int i=0;i<jobs.length;i++) {
			currentTime += job.get(i).getTime();
			minimunDisatisfaction += currentTime*job.get(i).getWeight();
		}
		System.out.println(minimunDisatisfaction);
	}

}
