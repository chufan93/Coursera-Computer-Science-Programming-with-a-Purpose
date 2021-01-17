
public class CMYKtoRGB {
    
    /*
     * This is for Week 1 Programming Assignment of 
     * Programming with a Purpose on Coursera
     */
    
    public static void main(String[] args) {
        // handle the inputs as a CMYK colour value 
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);
        
        // use the given formula 
        // to calculate the RGB colour value of the given CMYK value 
        double white = 1 - black;
        long red = Math.round(255 * white * (1 - cyan));
        long green = Math.round(255 * white * (1 - magenta));
        long blue = Math.round(255 * white * (1 - yellow));
        
        System.out.println("red   = " + red);
        System.out.println("green = " + green);
        System.out.println("blue  = " + blue);
    }
}
