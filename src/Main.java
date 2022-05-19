import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        Graph<Integer> g=new Graph<>(n);
        for (int i = 0; i < m; i++) {
            int u= sc.nextInt();
            int v= sc.nextInt();

            g.addEdge(u,v,false);
        }
        ArrayList<ArrayList<Integer>> list=g.getList();
        System.out.println(list);
        Cycle c=new Cycle();
        System.out.println( c.detectCycle(n,list));

    }
}
