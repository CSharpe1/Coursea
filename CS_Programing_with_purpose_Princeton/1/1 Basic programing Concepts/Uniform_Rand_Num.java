
/**
 * Write a description of class Uniform_Rand_Num here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Uniform_Rand_Num
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Uniform_Rand_Num
     */
    public Uniform_Rand_Num()
    {
        // initialise instance variables
        x = 0;
        double rand1 = Math.random();
        double rand2 = Math.random();
        double rand3 = Math.random();
        double rand4 = Math.random();
        double rand5 = Math.random();

        // Output is different everytime this code is executed
        System.out.println("Random Number seq:" + rand1 + rand2 + rand3 + rand4 + rand5);
        
        double minvalue = Math.min(rand1,rand2);
        double minvalue2 = Math.min(minvalue,rand3);
        double minvalue3 = Math.min(minvalue2,rand4);        
        double minvalue4 = Math.min(minvalue3,rand5);
        System.out.println("Min Value:" + minvalue4);
        
        double maxvalue = Math.max(rand1,rand2);
        double maxvalue2 = Math.max(minvalue,rand3);
        double maxvalue3 = Math.max(maxvalue2,rand4);        
        double maxvalue4 = Math.max(maxvalue3,rand5);
        System.out.println("Max Value:" + maxvalue4);
    }

    
}
