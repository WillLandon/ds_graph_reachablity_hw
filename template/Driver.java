package template;

public class Driver {

	public static void main(String args[]) {
		TEST_CITIES();
	}

	public static void TEST_CITIES() {
	
		GraphNode<String> austin     = new GraphNode<>("Austin");
        GraphNode<String> chicago    = new GraphNode<>("Chicago");
        GraphNode<String> atlanta    = new GraphNode<>("Atlanta");
        GraphNode<String> houston    = new GraphNode<>("Houston");
        GraphNode<String> washington = new GraphNode<>("Washington");
        GraphNode<String> denver     = new GraphNode<>("Denver");
        GraphNode<String> dallas     = new GraphNode<>("Dallas");

        austin.addneighbours(chicago);
        austin.addneighbours(atlanta);
        washington.addneighbours(houston);
        washington.addneighbours(austin);

        GraphUtils<String> utils = new GraphUtils<>();

        System.out.println("Routes Available:");
        System.out.println("--------------------------------");
        System.out.printf("Austin -> Chicago:     %b%n",  utils.pathExists(austin,     chicago));
        System.out.printf("Denver -> Austin:      %b%n",  utils.pathExists(denver,     austin));
        System.out.printf("Houston -> Dallas:     %b%n",  utils.pathExists(houston,    dallas));
        System.out.printf("Austin -> Atlanta:     %b%n",  utils.pathExists(austin,     atlanta));
        System.out.printf("Denver -> Dallas:      %b%n",  utils.pathExists(denver,     dallas));
        System.out.printf("Washington -> Houston: %b%n",  utils.pathExists(washington, houston));
	
	}
	
	/** Expected results:
	 
	 	Routes Available: 
		 -------------------------------- 
		 Austin -> Chicago:	 true
		 Denver -> Austin:	 false
		 Houston -> Dallas:	 false
		 Austin -> Atlanta:	 true
		 Denver -> Dallas:	 false
		 Washington -> Houston:	 true

	 */

}
