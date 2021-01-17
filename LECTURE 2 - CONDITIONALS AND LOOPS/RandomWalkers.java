
public class RandomWalkers {

    /*
     * This is for Week 2 Programming Assignment of 
     * Programming with a Purpose on Coursera
     */
    
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int x, y, steps;
        
        double dice;
        double averageSteps = 0.0;
        
        // loop for n trials
        for (int i = 0; i < trials; i++) {
            // initialize the origin coordinate for each trial
            x = 0;
            y = 0;
            steps = 0;
            
            // calculate the distance r
            while (Math.abs(x) + Math.abs(y) != r) {
                dice = Math.random();
                if (dice < 0.25) y += 1; // define she goes north
                else if (dice < 0.5) x += 1; // define she goes east
                else if (dice < 0.75) y -= 1; // define she goes south
                else x -= 1; // define she goes west
                
                steps += 1;
            }
            
            averageSteps += steps;
        }
        
        // calculate the average steps
        averageSteps /= trials;
        
        System.out.println("average number of steps = " + averageSteps);
    }
}
