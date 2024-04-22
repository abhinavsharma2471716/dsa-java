import java.util.*;

class Solution {
    
    // Helper method to generate all possible neighbor combinations
    public void fillNeighbors(Queue<String> que, StringBuilder curr, Set<String> dead) {
        for (int i = 0; i < 4; i++) {
            char ch = curr.charAt(i);

            // Decrement and increment each digit of the current combination
            char dec = (ch == '0') ? '9' : (char) (ch - 1);
            char inc = (ch == '9') ? '0' : (char) (ch + 1);

            // Replace the current character with decremented value
            curr.setCharAt(i, dec);
            String decStr = curr.toString();
            // If not dead, add it to the queue and mark as dead
            if (!dead.contains(decStr)) {
                dead.add(decStr);
                que.add(decStr);
            }

            // Replace the current character with incremented value
            curr.setCharAt(i, inc);
            String incStr = curr.toString();
            // If not dead, add it to the queue and mark as dead
            if (!dead.contains(incStr)) {
                dead.add(incStr);
                que.add(incStr);
            }
            // Reset the character back to original value for next iteration
            curr.setCharAt(i, ch);
        }
    }

    // Main method to solve the problem
    public int openLock(String[] deadends, String target) {
        // Set to store deadend combinations
        Set<String> dead = new HashSet<>();
        // Add deadend combinations to the set
        for (String deadend : deadends) {
            dead.add(deadend);
        }

        // Initial combination
        String start = "0000";
        // If start combination is a deadend, return -1
        if (dead.contains(start)) {
            return -1;
        }

        // Queue to perform BFS
        Queue<String> que = new LinkedList<>();
        que.add(start);

        int level = 0;
        // Perform BFS
        while (!que.isEmpty()) {
            int n = que.size();

            // Traverse all combinations at the current level
            while (n > 0) {
                String curr = que.poll();
                // If current combination is the target, return level
                if (curr.equals(target)) {
                    return level;
                }

                // Generate neighbors of the current combination
                StringBuilder currBuilder = new StringBuilder(curr);
                fillNeighbors(que, currBuilder, dead);
                n--;
            }
            // Move to the next level
            level++;
        }
        // Target not reached, return -1
        return -1;
    }
}
