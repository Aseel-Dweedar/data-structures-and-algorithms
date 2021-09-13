
package graph;

public class App {

    public static void main(String[] args) {

        Graph myGraph = new Graph();
        myGraph.addNode("8");
        myGraph.addNode("1");
        myGraph.addNode("2");
        myGraph.addNode("9");
        myGraph.addNode("7");
        myGraph.addNode("5");
        myGraph.addEdge("8" , "1");
        myGraph.addEdge("5" , "1");
        myGraph.addEdge("7" , "5");
        myGraph.addEdge("8" , "9");
        myGraph.addEdge("8" , "2");
//        System.out.println(myGraph);
//        System.out.println(myGraph.getNodes());
//        System.out.println(myGraph.getNeighbors("8"));
//        System.out.println(myGraph.getNeighbors("7"));
//        System.out.println(myGraph.getNeighbors("5"));
//        System.out.println(myGraph.size());
        System.out.println(myGraph.breadthFirst("8"));
        System.out.println(myGraph.breadthFirst("7"));
        System.out.println(myGraph.breadthFirst("5"));
    }
}
