# CS232 Graph Homework

## Overview
You are a **station master** at a busy city train terminal. Your task is to model train routes using a graph and implement a path-finding algorithm.

---

## Problem Description

You are given a map of train routes (stations and their connections). You will represent this as a graph and determine whether routes exist between stations.

---

## Part 1: Build the Graph

Using the provided `GraphNode`:

- **Vertices (Nodes):** Train stations  
- **Edges (Neighbors):** Connections between adjacent stations  

---

## Part 2: Implement Path Search

Implement the following method:

```java
boolean pathExists(GraphNode targetFromNode, GraphNode targetToNode);
```

### Algorithm (Breadth-First Search)

1. Create a **queue** to manage nodes to visit  
2. Create a **set** to track visited nodes  
3. Start from `targetFromNode`  

4. While the queue is not empty:
   - Dequeue a node
   - For each neighbor:
     - If not visited:
       - Add to queue
       - Mark as visited
     - If `targetToNode` is found:
       - Return `true`

5. If traversal completes without finding the target:
   - Return `false`

---

## Part 3: Run and Verify

Run your driver program and verify results against the expected output below:

```
Routes Available:
--------------------------------
Austin -> Chicago:     true
Denver -> Austin:      false
Houston -> Dallas:     false
Austin -> Atlanta:     true
Denver -> Dallas:      false
Washington -> Houston: true
```

---

## Notes

- This problem uses **graph traversal (BFS)**.
- Make sure to avoid revisiting nodes using a `Set`.
- Your graph should reflect the exact structure of the provided map.
