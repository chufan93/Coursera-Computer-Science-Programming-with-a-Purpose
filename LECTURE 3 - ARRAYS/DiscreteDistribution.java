
public class DiscreteDistribution {

    /*
     * This is for Week 3 Programming Assignment of 
     * Programming with a Purpose on Coursera
     */
    
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = args.length - 1;
        
        int[] a = new int[n];
        int[] sum = new int[n + 1];
        int r;
        
        // initialize a[i]
        sum[0] = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
        }
        
        // initialize sum[i]
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + a[i];
        }
        
        // loop for m trials
        for (int i = 0; i < m; i++) {
            r = (int) (Math.random() * sum[n]);
            for (int j = 0; j < n; j++) {
                if (r >= sum[j] && r < sum[j + 1])
                    System.out.print(j + 1);
            }
            
            if (i != m - 1) System.out.print(" ");
            else System.out.println("");
            if ((i + 1) % 25 == 0) System.out.println("");
        }
    }
}
