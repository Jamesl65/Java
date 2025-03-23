package test;

import java.util.HashMap;
import java.util.HashSet;

public class TreeConstructor {
    public static String TreeConstructor(String[] strArr) {
        // HashMap to store the parent of each node
        HashMap<Integer, Integer> parentMap = new HashMap<>();
        // HashSet to track all child nodes
        HashSet<Integer> childNodes = new HashSet<>();
        // HashSet to track all nodes with parents
        HashSet<Integer> allNodes = new HashSet<>();

        for (String pair : strArr) {
            // Remove the parentheses and split the pair by comma
            pair = pair.substring(1, pair.length() - 1);
            String[] parts = pair.split(",");
            int child = Integer.parseInt(parts[0]);
            int parent = Integer.parseInt(parts[1]);

            // If the child already has a parent, return false (because a node can't have two parents)
            if (parentMap.containsKey(child)) {
                return "false";
            }

            // Add the current parent-child relationship to the map
            parentMap.put(child, parent);
            // Add the child to the set of child nodes
            childNodes.add(child);
            // Add the parent to the set of all nodes
            allNodes.add(parent);
            // Add the child node as well
            allNodes.add(child);
        }

        // A valid binary tree must have exactly one root (a node without a parent)
        // The root will not be in the childNodes set
        int rootCount = 0;
        for (int node : allNodes) {
            if (!childNodes.contains(node)) {
                rootCount++;
            }
        }

        // If there is exactly one root and no node has more than one parent, return true
        return (rootCount == 1) ? "true" : "false";
    }

    public static void main(String[] args) {
        String[] strArr1 = {"(1,2)", "(2,4)", "(7,2)", "(9,2)"};
        String[] strArr2 = {"(1,2)", "(2,4)", "(4,2)"};

        System.out.println(TreeConstructor(strArr1)); // Output: true
        System.out.println(TreeConstructor(strArr2)); // Output: false
    }
}
