package com.GreedyProblems;

public class Jobs implements Comparable<Jobs>{
	private String JobId;
	private int deadline;
	private int profit;
	
	public Jobs(String jobId,int profit, int deadline) {
		super();
		JobId = jobId;
		this.deadline = deadline;
		this.profit = profit;
	}
	
	
	public String getJobId() {
		return JobId;
	}
	public void setJobId(String jobId) {
		JobId = jobId;
	}
	public int getDeadline() {
		return deadline;
	}
	public void setDeadline(int deadline) {
		this.deadline = deadline;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}


	@Override
	public int compareTo(Jobs job) {
		return job.profit-this.profit;
	}
}
