
public class BandMatrix {

    /*
     * This is for Week 2 Programming Assignment of 
     * Programming with a Purpose on Coursera
     */
    
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        
        // print element a[i][j]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // judge to print * or 0
                if (Math.abs(i - j) <= width) System.out.print("*");
                else System.out.print("0");
                
                // judge to print a new line or two spaces
                if (j == n - 1) System.out.println();
                else System.out.print("  ");
            }
        }
    }
}
