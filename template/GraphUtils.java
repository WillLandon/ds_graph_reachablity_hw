package template;

import java.util.LinkedList;
import java.util.HashSet;

public class GraphUtils<T> {

    public Boolean pathExists(GraphNode<T> targetFromNode, GraphNode<T> targetToNode) {

        //TODO:
        // create queue to manage nodes
        LinkedList<GraphNode<T>> queue = new LinkedList<GraphNode<T>>();
        // create set to manage visitedNodes
        HashSet<GraphNode<T>> visited = new HashSet<GraphNode<T>>();

        //start from the targetFromNode
        queue.add(targetFromNode);
        visited.add(targetFromNode);

        while (!queue.isEmpty()) {
            GraphNode<T> node = queue.poll();

            //for all neighbors:
            for (GraphNode<T> neighbour : node.getNeighbours()) {
                //check if visited.  If not, add to the queue.  
                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
                //if targetToNode has been visited, return true
                if (neighbour == targetToNode) {
                    return true;
                }
            }
        }

        //if u get here
        return false;
    }
}