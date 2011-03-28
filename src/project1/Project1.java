package project1;

import java.util.Enumeration;
import java.util.Hashtable;
import processing.core.*;

/**
 *
 * @author eltico
 */
public class Project1 extends PApplet {

    private static int[] arguments; //Arg copy from the main method.
    private int width, height, big; //Dimensions for the window.

    //Finds the biggest number in the array of integers arguments
    private void biggest() {
        int biggest = 2;
        for (int i = 2; i < (arguments.length); i++) {
            if (arguments[biggest] < arguments[i]) {
                biggest = i;
            }
        }
        this.big = biggest;
        System.out.println(big);
    }

    @Override
    public void setup() {
        width = arguments[0];
        height = arguments[1];
        biggest();
        size(height, width);
        smooth();
    }

    @Override
    public void draw() {
        this.background(255);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cnt = 0;
        arguments = new int[args.length];
        for (String i : args) {
            arguments[cnt] = Integer.parseInt(i);
            cnt++;
        }
        PApplet.main(new String[]{"project1.Project1"});
    }
}
