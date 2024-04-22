import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sampleGraphs.*;

public class BFS {

    static Map<Integer, List<Integer>> graph = null;

    public void printBFS(Map<Integer,Boolean> visited){
        for(Map.Entry<Integer, List<Integer>> g: graph.entrySet()){

        int key = g.getKey();
        if(!visited.containsKey(key)){
            System.out.println(key+" ");
            visited.put(key, true);
        }

        List<Integer> value = g.getValue();
        for(Integer val: value){
            if(!visited.containsKey(val)){
                System.out.println(val+" ");
                visited.put(val, true);
            }
        }
    }
    }

    public static void main(String[] args) {
        graph = UndirectedGraph1.getUndirectedGraph1();
        Map<Integer, Boolean> visited = new HashMap<>();
        BFS bfs = new BFS();
        bfs.printBFS(visited);

    }
}
