
public class RightTriangle {
    
    /*
     * This is for Week 1 Programming Assignment of 
     * Programming with a Purpose on Coursera
     */
    
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        
        boolean isRightTriangle;
        
        // To judge whether the triangle is a right triangle or not. 
        isRightTriangle = (a > 0) && (b > 0) && (c > 0) 
            && ((a * a + b * b == c * c) || (b * b + c * c == a * a) 
            || (a * a + c * c == b * b));
        
        System.out.println(isRightTriangle);
    }
}
