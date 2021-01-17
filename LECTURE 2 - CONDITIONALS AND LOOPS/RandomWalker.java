
public class RandomWalker {

    /*
     * This is for Week 2 Programming Assignment of 
     * Programming with a Purpose on Coursera
     */
    
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;
        double dice;
        
        // print the original coordinate
        System.out.println("(0, 0)");
        
        // calculate the distance r
        while (Math.abs(x) + Math.abs(y) != r) {
            
            dice = Math.random();
            if (dice <= 0.25) y += 1; // define she goes north
            else if (dice <= 0.5) x += 1; // define she goes east
            else if (dice <= 0.75) y -= 1; // define she goes south
            else x -= 1; // define she goes west
            
            // print the coordinates
            System.out.println("(" + x + ", " + y + ")");
            
            steps += 1;
        }
        
        System.out.println("steps = " + steps);
    }
}
