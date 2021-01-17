
public class GreatCircle {
    
    /*
     * This is for Week 1 Programming Assignment of 
     * Programming with a Purpose on Coursera
     */
    
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        
        // r stands for the radius 
        double r = 6371.0;
        
        // calculate the temporary values of the given formula 
        double sin2x = Math.sin((x2 - x1) / 2) * Math.sin((x2 - x1) / 2);
        double sin2y = Math.sin((y2 - y1) / 2) * Math.sin((y2 - y1) / 2);
        double sqrt = Math.sqrt(sin2x + Math.cos(x1) * Math.cos(x2) * sin2y);
        
        // calculate the distance using the given formula 
        double distance = 2 * r * Math.asin(sqrt);
        
        System.out.println(distance + " kilometers");
    }
}
