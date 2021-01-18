
public class Birthday {

    /*
     * This is for Week 3 Programming Assignment of 
     * Programming with a Purpose on Coursera
     */
    
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        boolean[] isBirthdayDuplicate = new boolean[n];
        int people;
        double fraction = 0.0;
        int[] time = new int[365];
        
        // trial loops
        for (int i = 0; i < trials; i++) {
            people = 0;
            for (int j = 0; j < n; j++) isBirthdayDuplicate[j] = false;
            
            while (true) {
                int day = (int) (Math.random() * n);
                if (isBirthdayDuplicate[day]) {
                    time[people]++;
                    break;
                }
                isBirthdayDuplicate[day] = true;
                people++;
            }
        }
        
        // output
        for (int i = 0; fraction / trials < 0.5; i++) {
            fraction += time[i];
            System.out.println(i + 1 + "\t" + time[i] 
                    + "\t" + fraction / trials);
        }
    }
}
