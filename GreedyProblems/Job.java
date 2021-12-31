package com.GreedyProblems;


public class Job implements Comparable<Job>{

	private String jobId;
	private int time;
	private int weight;
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Job(String jobId, int time, int weight) {
		super();
		this.jobId = jobId;
		this.time = time;
		this.weight = weight;
	}
	
	@Override
	public int compareTo(Job job) {
		return job.weight/job.time - this.weight/this.time;
	}
}
