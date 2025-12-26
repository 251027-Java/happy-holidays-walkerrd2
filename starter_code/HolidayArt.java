/**
 * Holiday ASCII Art Generator
 * 
 * Your task: Create a festive Christmas tree using ASCII characters!
 * 
 * Basic tree structure:
 * * <- Star on top
 * *** <- Tree branches (odd numbers of *)
 * *****
 * *******
 * ||| <- Trunk
 */
public class HolidayArt {

    public static void main(String[] args) {
        // TODO: Parse command-line argument for tree height (default: 5)
        int height = 5;
        if(args.length > 0){
            height = Integer.parseInt(args[0]);
        }

        // TODO: Print the tree
        printTree(height);
    }

    /**
     * Prints a Christmas tree with the given height.
     * 
     * @param height Number of branch levels (not including star and trunk)
     */
    public static void printTree(int height) {
        // TODO: Implement this method
        for(int i =0; i < height; i++){
            int stars = (i*2)+1;
            int spaces = height-i-1;
            System.out.println(" ".repeat(spaces)+"*".repeat(stars)+" ".repeat(spaces));
        }
        System.out.println(" ".repeat(height-2)+"|||");
    }
}
