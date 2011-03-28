package project1;

import java.util.Hashtable;
import processing.core.*;

/**
 *
 * @author eltico
 */
public class Project1 extends PApplet {

    private static Hashtable params = new Hashtable(); //Hash table. It will save the parameters from the args
    private int width, height; //Dimensions for the window

    @Override
    public String param(String id) {
        return (String) params.get(id);
    }

    @Override
    public void setup() {
        width = Integer.parseInt(param("width"));
        height = Integer.parseInt(param("height"));
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
        String[] newArgs = new String[args.length + 1];
        newArgs[0] = "project1.Project1";
        params.put("height", args[1]);
        params.put("width", args[0]);
        //Stores the array args into the hashtable so it can be processed during excution of the PApplet.
        for (int i = 2; i < args.length; i++) {
            newArgs[i + 1] = args[i];
            params.put("Bar" + i, args[i]);
        }
        PApplet.main(newArgs);
    }
}
