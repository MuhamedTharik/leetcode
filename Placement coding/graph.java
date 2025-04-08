// using array list
import java.util.ArrayList;
class Graph{
    int vertices;
    ArrayList<ArrayList<Integer>> adj;
    
    Graph(int a){
        adj = new ArrayList<>();
        vertices = a;
        for(int i=0;i<a;i++){
            adj.add(new ArrayList<>());
        }
    }
    
    public void edge(int a,int b){
        adj.get(a).add(b);
        adj.get(b).add(a);
    }
    
    public void display(){
        for(int i=0;i<5;i++){
            System.out.print("Adjacency list of"+i+"Index :");
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}

public class Main{
    public static void main(String args[]){
        Graph g = new Graph(5);
        g.edge(0, 1);
        g.edge(1, 4);
        g.edge(1, 3);
        g.edge(2, 4);
        g.display();
    }
}
