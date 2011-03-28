package project1;

import java.util.Enumeration;
import java.util.Hashtable;
import processing.core.*;

/**
 *
 * @author eltico
 */
public class Project1 extends PApplet {

    private static String[] arguments; //Arg copy from the main method.
    private int width, height; //Dimensions for the window.

    @Override
    public void setup() {
        width = Integer.parseInt(arguments[0]);
        height = Integer.parseInt(arguments[1]);
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

        arguments = args;
        PApplet.main(new String[]{"project1.Project1"});
    }
}
