
public class Minesweeper {

    /*
     * This is for Week 3 Programming Assignment of 
     * Programming with a Purpose on Coursera
     */
    
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        
        boolean[][] mineField = new boolean[m][n];
        int[][] result = new int[m][n];
        int count;
        
        while (k > 0) {
            int random = (int) (Math.random() * (m * n));
            int x = random / n;
            int y = random % n;
            
            if (!mineField[x][y]) {
                mineField[x][y] = true;
                k--;
            }
        }
        
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                count = 0;
                if (mineField[i][j]) result[i][j] = -1;
                else {
                    if (i - 1 != -1 && mineField[i - 1][j])
                        count++;
                    if (i - 1 != -1 && j - 1 != -1 && mineField[i - 1][j - 1])
                        count++;
                    if (i - 1 != -1 && j + 1 != n && mineField[i - 1][j + 1])
                        count++;
                    if (j - 1 != -1 && mineField[i][j - 1])
                        count++;
                    if (j + 1 != n && mineField[i][j + 1])
                        count++;
                    if (i + 1 != m && mineField[i + 1][j])
                        count++;
                    if (i + 1 != m && j - 1 != -1 && mineField[i + 1][j - 1])
                        count++;
                    if (i + 1 != m && j + 1 != n && mineField[i + 1][j + 1])
                        count++;
                    result[i][j] = count;
                }
            }
        
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                if (mineField[i][j])
                    System.out.print("*");
                else System.out.print(result[i][j]);
                if (j == n - 1) System.out.println("");
                else System.out.print("  ");
            }
    }
}
