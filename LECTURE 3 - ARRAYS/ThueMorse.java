
public class ThueMorse {

    /*
     * This is for Week 3 Programming Assignment of 
     * Programming with a Purpose on Coursera
     */
    
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] tm = new int[n];
        tm[0] = 0;
        
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0)
                tm[i] = tm[i / 2];
            else
                tm[i] = 1 - tm[i - 1];
        }
        
        String[][] tmSequence = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tm[i] == tm[j]) tmSequence[i][j] = "+";
                else tmSequence[i][j] = "-";
            }
        }
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                System.out.print(tmSequence[i][j]);
                if (j == n - 1) System.out.println("");
                else System.out.print("  ");
            }
    }
}
