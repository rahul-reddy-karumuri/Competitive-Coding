package com.Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

//This class represents a directed graph using adjacency list
public class EulerTour
{
	private int V; // No. of vertices
	private LinkedList<Integer> adj[];//Adjacency List
	private int in[];		 //maintaining in degree
	
	static HashMap<Integer, Integer> tour = new HashMap<Integer,Integer>();

	//Constructor
	EulerTour(int v)
	{
		V = v;
		adj = new LinkedList[v];
		in = new int[V];
		for (int i=0; i<v; ++i)
		{
			adj[i] = new LinkedList();
			in[i] = 0;
		}
	}

	//Function to add an edge into the graph
	void addEdge(int v,int w)
	{
		adj[v].add(w);
		//in[w]++;
	}

	// A recursive function to print DFS starting from v
	void DFSUtil(int v,Boolean visited[])
	{
		// Mark the current node as visited
		if (!visited[v]) {
			visited[v] = true;
			tour.put(0,0);
		}
		
		int n;

		// Recur for all the vertices adjacent to this vertex
		Iterator<Integer> i =adj[v].iterator();
		while(i.hasNext())
		{
			n = i.next();
			if (!visited[n]
					) {
				DFSUtil(n,visited);
			}
		}
	}

	// The main function that returns true if graph is strongly
	// connected
	Boolean isSC()
	{
		// Step 1: Mark all the vertices as not visited (For
		// first DFS)
		Boolean visited[] = new Boolean[V];
		for (int i = 0; i < V; i++)
			visited[i] = false;

		// Step 2: Do DFS traversal starting from the first vertex.
		DFSUtil(0, visited);

		// If DFS traversal doesn't visit all vertices, then return false.
		for (int i = 0; i < V; i++)
			if (visited[i] == false)
				return false;

		return true;
	}

	/* This function returns true if the directed graph has a eulerian
	cycle, otherwise returns false */
	Boolean isEulerianCycle()
	{
		// Check if all non-zero degree vertices are connected
		if (isSC() == false)
			return false;

		// Check if in degree and out degree of every vertex is same
		for (int i = 0; i < V; i++)
			if (adj[i].size() != in[i])
				return false;

		return true;
	}

	public static void main (String[] args)
	{
		EulerTour g = new EulerTour(5);
		g.addEdge(1, 0);
		g.addEdge(0, 2);
		g.addEdge(2, 1);
		g.addEdge(0, 3);
		g.addEdge(3, 4);
		g.addEdge(4, 0);

		if (g.isEulerianCycle()) {
			System.out.println("Given directed graph is eulerian ");
			for(int i=0;i<tour.size();++i)
				System.out.println(tour.get(i));
		}	
		else
			System.out.println("Given directed graph is NOT eulerian ");
	}
}
