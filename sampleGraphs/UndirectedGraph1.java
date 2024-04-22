package sampleGraphs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndirectedGraph1 {

    private static Map<Integer, List<Integer>> graph= new HashMap<>();

    public static Map<Integer,List<Integer>> getUndirectedGraph1(){
        if(graph.isEmpty()){
            buildGraph();
        }
        return graph;
    }

    private static void buildGraph(){
//        graph.put(0, Arrays.asList(1,2));
//        graph.put(1, Arrays.asList(0,2,3));
//        graph.put(2,Arrays.asList(0,1,3,4));
//        graph.put(3, Arrays.asList(1,2,4));
//        graph.put(4, Arrays.asList(2,3));

        graph.put(0, Arrays.asList(1,2));
        graph.put(1, Arrays.asList(0,2,3));
        graph.put(2,Arrays.asList(0,1,4));
        graph.put(3, Arrays.asList(1));
        graph.put(4, Arrays.asList(2));

    }

}
