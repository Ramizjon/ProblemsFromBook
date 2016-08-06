package problem19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	private HashMap<Integer, LinkedList<Integer>> adjacencyMap;

	public Graph() {
		adjacencyMap = new HashMap<Integer, LinkedList<Integer>>();
	}

	public Graph addEdge(int index, Integer value) {
		if (!adjacencyMap.containsKey(index)) {
			adjacencyMap.put(index, new LinkedList<Integer>());
		}
		adjacencyMap.get(index).add(value);
		return this;
	}

	boolean pathExists(int vertexOne, int vertexTwo) {
		boolean[] visited = new boolean[adjacencyMap.size()];
		Queue<Integer> graphQueue = new LinkedList<Integer>();

		visited[vertexOne] = true;
		graphQueue.add(vertexOne);
		Iterator<Integer> iterator;

		while (graphQueue.size() != 0) {
			System.out.print(graphQueue.poll() + " ");
			int temp;
			iterator = (Iterator<Integer>) adjacencyMap.get(vertexOne).listIterator();

			while (iterator.hasNext()) {
				temp = iterator.next();

				if (temp == vertexTwo) {
					return true;
				}

				if (!visited[temp]) {
					visited[temp] = true;
					graphQueue.add(temp);
				}
			}
			System.out.println();
		}

		return false;
	}

}
