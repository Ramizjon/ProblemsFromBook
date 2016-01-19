package problem19;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraphTest {
	Graph graph;
	
	public void init() {
		graph = new Graph();
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
	}
	
	@Test
	public void testExists() {
		this.init();
        assertEquals(true, graph.pathExists(2, 3));
	}
	
	@Test
	public void testNotExists() {
		this.init();
		assertEquals(false, graph.pathExists(3, 0));
	}

}
