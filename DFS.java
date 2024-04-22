import sampleGraphs.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DFS {

    static Map<Integer, List<Integer>> graph = null;

    public void printDFS(Integer key, Map<Integer, Boolean> visited){

        visited.put(key, true);
        System.out.println(key+" ");
        List<Integer> value = graph.get(key);
        for(Integer val: value){
            if(!visited.containsKey(val)){
                printDFS(val,visited);
            }
        }
    }


    public static void main(String[] args) {

        graph = UndirectedGraph1.getUndirectedGraph1();
        DFS dfs = new DFS();

        Map<Integer, Boolean> visited = new HashMap<>();
        Map.Entry<Integer, List<Integer>> entry = graph.entrySet().iterator().next();
        Integer key = entry.getKey();
        dfs.printDFS(key, visited);

    }
}
