import java.util.*;

public class AdjacencyList {

    Map<Character, List<Character>> graph = new HashMap<>();

    public void buildGraph(){
        graph.put('A', Arrays.asList('B', 'C'));
        graph.put('B', new ArrayList<>());
        graph.put('C', Arrays.asList('D', 'E'));
        graph.put('D', Arrays.asList('E'));
        graph.put('E', new ArrayList<>());
    }

    public void printGraph(){
        for(Map.Entry<Character, List<Character>> map: graph.entrySet()){
            Character key = map.getKey();
            List<Character> valueList = map.getValue();
            System.out.print(key+"->");
            if(valueList.isEmpty()) System.out.print("[]");
            else{
                for(Character ch : valueList){
                    System.out.print(ch +" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        AdjacencyList adjacencyList = new AdjacencyList();
        adjacencyList.buildGraph();
        adjacencyList.printGraph();
    }
}
