
public class ShannonEntropy {

    /*
     * This is for Week 4 Programming Assignment of 
     * Programming with a Purpose on Coursera
     */
    
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] count = new int[m];
        int times = 0;
        double entropy = 0.0;
        
        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            count[x - 1]++;
            times++;
        }
        
        for (int i = 0; i < m; i++) {
            double frequency = 0.0;
            frequency = (count[i] / 1.0) / times;
            if (frequency == 0.0) continue;
            else entropy += frequency * 
                    (Math.log(frequency) / Math.log(2.0));
        }
        
        entropy = 0 - entropy;
        StdOut.printf("%.4f\n", entropy);
    }
}
