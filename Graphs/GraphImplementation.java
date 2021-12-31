package com.Graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Graph {
	
	private LinkedList<Integer> adjacentNodes[];
	
	Graph(int vertices) {
		adjacentNodes = new LinkedList[vertices];
		for(int i=0;i<vertices;i++) {
		     adjacentNodes[i] = new LinkedList<Integer>();
		}
	}
	
	//Add an Edge
	public void addEdge(int source, int destination) {
		adjacentNodes[source].add(destination);
		adjacentNodes[destination].add(source);
	}
	
	//Function for BFS
	public void BFS(int rootNode) {
		boolean visited[] = new boolean[adjacentNodes.length];
		
		//BFS Queue
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[rootNode] = true;
		queue.add(rootNode);
		
		//Loop for traversing the queue
		while(queue.size()!=0) {
			rootNode = queue.poll();
			System.out.println(rootNode+" ");
			
			//loop for traversing the adjacentNodes
			Iterator<Integer> itr = adjacentNodes[rootNode].iterator();
			while(itr.hasNext()) {
				int n = itr.next();
				if(!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
}

public class GraphImplementation{
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of vertices and Edges");
        int v = in.nextInt();
        int e = in.nextInt();
        Graph graph = new Graph(v);
        
        System.out.println("Enter "+e+" Edges :");
        for(int i=0;i<e;++i) {
        	int source = in.nextInt();
        	int destination = in.nextInt();
        	graph.addEdge(source, destination);
        }
        graph.BFS(0); 
		in.close();
		
	}

}
