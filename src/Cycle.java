import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;

public class Cycle {

    public boolean detectCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];

        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {
                Queue<Integer> q = new ArrayDeque<>();
                q.add(i);
                vis[i] = true;

                while (!q.isEmpty()) {
                    int n = q.poll();
                    set.add(n);
                    for (int j : adj.get(n)) {

                        if (!vis[j]) {
                            q.add(j);
                            vis[j] = true;
                        } else if (!set.contains(j)) return true;
                    }
                }
            }
        }
        return false;
    }
}

