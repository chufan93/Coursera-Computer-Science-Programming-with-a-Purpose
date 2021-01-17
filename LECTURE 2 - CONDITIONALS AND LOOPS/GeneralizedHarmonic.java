
public class GeneralizedHarmonic {
    
    /*
     * This is for Week 2 Programming Assignment of 
     * Programming with a Purpose on Coursera
     */
    
    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        
        double result = 0.0;
        
        for (int i = 1; i <= n; i++) {
            /* calculate the nth term and add to the result */
            result += 1 / Math.pow(i, r);
        }
        
        System.out.println(result);
    }
}
